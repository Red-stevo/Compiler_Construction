package red.stevo.code.Lexer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Symbol {

    private String tokenName; // Variable name

    private Object tokenValues; // Value held by the variable

    private String tokenDataType; // The variable's datatype (e.g., int, float)

    private String scope; // The scope in which the variable is declared (e.g., global, local, function)
}
