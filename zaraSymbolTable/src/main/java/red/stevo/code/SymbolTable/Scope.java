package red.stevo.code.SymbolTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import red.stevo.code.SymbolTable.Symbol;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class Scope {

    private String scopeType; //hold a scope type e.g., class, global, method or block scope.

    private HashMap<String, Symbol> scopeTable; //hold symbols defined in a scope.

}
