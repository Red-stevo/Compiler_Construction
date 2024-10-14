package red.stevo.code.Lexer;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Yytoken {
    private final String type;
    private final String value;

    public Yytoken(String type, String value) {
        this.type = type;
        this.value = value;
    }

}
