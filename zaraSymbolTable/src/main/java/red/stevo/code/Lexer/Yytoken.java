package red.stevo.code.Lexer;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Yytoken {
    private String type;
    private String value;

    public Yytoken(String type, String value) {
        this.type = type;
        this.value = value;
    }

}
