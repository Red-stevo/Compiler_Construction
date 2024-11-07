package red.stevo.code.Lexer;

import lombok.Data;
import red.stevo.code.Lexer.Scope;
import red.stevo.code.Lexer.Symbol;

import java.util.HashMap;
import java.util.Stack;

@Data
public class SymbolTable {

    private HashMap<String, Symbol> globalScope; // Global symbols

    private Stack<Scope> localScopeStack; // Stack to track local scopes (e.g., function or block scopes)

    private HashMap<String, Scope> scopeResolutionMap; // Maps symbol names to scopes for resolution

    public SymbolTable() {
        globalScope = new HashMap<>();
        localScopeStack = new Stack<>();
        scopeResolutionMap = new HashMap<>();
    }

    /* Enter into a new scope; whether class, method, or block scope.
     * Create a new hashmap to store the symbols at that scope. */
    public void enterNewScope(String scopeType) {
        localScopeStack.push(new Scope(scopeType, new HashMap<>()));
    }

    /* Adds a new symbol to the current scope.
     * The current scope is the one at the peek of the stack. */
    public void addSymbol(String tokenVariableName, Object tokenValue, String tokenVariableType, String tokenScope) {

        Symbol symbol = new Symbol(tokenVariableName, tokenValue, tokenVariableType, tokenScope);

        // Check for redeclaration: global scope or local scope
        if ("global".equals(tokenScope)) {
            if (globalScope.containsKey(tokenVariableName)) {
                System.err.println("Error: Variable '" + tokenVariableName + "' already declared in global scope.");
            } else {
                globalScope.put(tokenVariableName, symbol);
            }
        } else {
            Scope currentScope = localScopeStack.peek();
            if (currentScope.getScopeTable().containsKey(tokenVariableName)) {
                System.err.println("Error: Variable '" + tokenVariableName + "' already declared in " + currentScope.getScopeType() + " scope.");
            } else {
                currentScope.getScopeTable().put(tokenVariableName, symbol);
                scopeResolutionMap.put(tokenVariableName, currentScope); // Track scope resolution
            }
        }
    }

    /* Using the scope resolution map, retrieve a symbol by the tokenVariable name. */
    public Symbol getSymbol(String tokenSymbolName) {
        Scope scope = scopeResolutionMap.get(tokenSymbolName);

        if (scope != null) {
            return scope.getScopeTable().get(tokenSymbolName);
        }
        // Check the global scope if not found in the local scope
        return globalScope.get(tokenSymbolName);
    }

    /* View the current stack scopes and the symbols within each scope. */
    public void viewCurrentStackScopes() {
        for (Scope scope : localScopeStack) {
            System.out.println("Scope: " + scope.getScopeType() + "\n" + scope.getScopeTable());
        }
    }

    /* Exit the current scope. This is done by popping the stack that holds the scopes. */
    public void exitScope() {
        if (!localScopeStack.isEmpty()) {
            Scope scope = localScopeStack.pop();
            // Clean up the scope resolution map when a scope is exited
            for (String tokenVariableName : scope.getScopeTable().keySet()) {
                scopeResolutionMap.remove(tokenVariableName);
            }
        }
    }

    // Checks if a symbol is already declared in any scope (global or local)
    public boolean isSymbolDeclared(String symbolName) {
        return globalScope.containsKey(symbolName) ||
                localScopeStack.stream().anyMatch(scope -> scope.getScopeTable().containsKey(symbolName));
    }

    // Check if a variable has been used before it was declared
    public void checkVariableUsage(String symbolName) {
        if (getSymbol(symbolName) == null) {
            System.err.println("Error: Symbol '" + symbolName + "' used before declaration.");
        }
    }

    // Method to check for semantic errors like redeclaration or undeclared symbols
    public void checkForRedeclarations(String tokenVariableName, String tokenScope) {
        if ("global".equals(tokenScope)) {
            if (globalScope.containsKey(tokenVariableName)) {
                System.err.println("Error: Variable '" + tokenVariableName + "' already declared in global scope.");
            }
        } else {
            Scope currentScope = localScopeStack.peek();
            if (currentScope.getScopeTable().containsKey(tokenVariableName)) {
                System.err.println("Error: Variable '" + tokenVariableName + "' already declared in " + currentScope.getScopeType() + " scope.");
            }
        }
    }
}

