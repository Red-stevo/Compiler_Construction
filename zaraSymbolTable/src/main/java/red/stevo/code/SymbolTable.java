package red.stevo.code;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Stack;

@Data
@AllArgsConstructor
public class SymbolTable {

    private HashMap<String, Symbol> globalScope;

    private Stack<Scope> localScopeStack;

    private HashMap<String, Scope> scopeResolutionMap;


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
}
