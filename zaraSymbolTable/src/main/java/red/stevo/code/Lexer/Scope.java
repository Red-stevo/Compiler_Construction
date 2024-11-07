package red.stevo.code.Lexer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class Scope {

    private String scopeType; // The type of scope (e.g., class, function, block, etc.)

    private HashMap<String, Symbol> scopeTable; // The symbols (variables, functions) defined in this scope
}
