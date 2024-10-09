package red.stevo.code;

import lombok.Data;

import java.util.HashMap;
import java.util.Stack;

@Data
public class SymbolTable {

    private HashMap<String, Symbol> globalScope;

    private Stack<Scope> localScopeStack;

    private HashMap<String, Scope> scopeResolutionMap;

    public SymbolTable(){
        globalScope = new HashMap<>();
        localScopeStack = new Stack<>();
        scopeResolutionMap = new HashMap<>();
    }

    /*Enter into a new scope; whether class, method or block scope.\
    * Create a new hashmap to store the symbols at that scope.*/
    public void enterNewScope(String scopeType){
        localScopeStack.push(new Scope(scopeType, new HashMap<>()));
    }

    /*Adds a new symbol to the current scope.The Current scope is the one at the peek of the stack.*/
    public void addSymbol(String tokenVariableName, Object tokenValue, String tokenVariableType, String tokenScope) {

        Symbol symbol = new Symbol(tokenVariableName, tokenValue, tokenVariableType, tokenScope);

        if ("global".equals(tokenScope))
            globalScope.put(tokenScope, symbol);
        else {
            localScopeStack.peek().getScopeTable().put(tokenVariableName, symbol);

            scopeResolutionMap.put(tokenVariableName, localScopeStack.peek());
        }
    }

    /*Using the scope resolution map, retrieve a symbol by the tokenVariable name.*/
    public Symbol getSymbol(String tokenSymbolName){
        Scope scope = scopeResolutionMap.get(tokenSymbolName);

        if (scope != null)
            return scope.getScopeTable().get(tokenSymbolName);

        return globalScope.get(tokenSymbolName);
    }

    public void viewCurrentStackScopes(){
        for (Scope scope : localScopeStack){
            System.out.println(scope.getScopeType()+"\n\n"+scope.getScopeTable());
        }
    }


    /*Exist the current scope.This is done by popping the stack that holds the scopes.*/
    public void existScope(){
        if (!localScopeStack.isEmpty()){
            Scope scope = localScopeStack.pop();

            for (String tokenVariableName : scope.getScopeTable().keySet())
                scopeResolutionMap.remove(tokenVariableName);
        }
    }
}
