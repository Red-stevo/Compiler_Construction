package red.stevo.code.Lexer;

import org.antlr.v4.runtime.*;
import java_cup.runtime.Symbol;
import red.stevo.code.Lexer.ZaraLexer;
import red.stevo.code.Lexer.sym;
import org.antlr.v4.runtime.*;
import java_cup.runtime.Symbol;

public class JFlexTokenStream implements TokenSource {
    private final ZaraLexer lexer;
    private int line = 1;
    private int charPositionInLine = 0;

    public JFlexTokenStream(ZaraLexer lexer) {
        this.lexer = lexer;
    }

    @Override
    public Token nextToken() {
        try {
            Symbol symbol = (Symbol) lexer.yylex();
            if (symbol.sym == sym.EOF) {
                return new CommonToken(Token.EOF);
            }

            int tokenType = mapJFlexToANTLR(symbol.sym);
            String text = symbol.value != null ? symbol.value.toString() : "";

            CommonToken token = new CommonToken(tokenType, text);
            token.setLine(symbol.left);
            token.setCharPositionInLine(symbol.right);

            updatePosition(text);

            return token;
        } catch (Exception e) {
            throw new RuntimeException("Error fetching next token", e);
        }
    }

    private void updatePosition(String text) {
        for (char c : text.toCharArray()) {
            if (c == '\n') {
                line++;
                charPositionInLine = 0;
            } else {
                charPositionInLine++;
            }
        }
    }

    private int mapJFlexToANTLR(int jflexTokenType) {
        // Implement your mapping logic here
        return jflexTokenType;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    @Override
    public CharStream getInputStream() {
        return null; // Not applicable for JFlex
    }

    @Override
    public String getSourceName() {
        return lexer.getClass().getSimpleName();
    }

    @Override
    public void setTokenFactory(TokenFactory<?> factory) {
        // Optional: Implement if you want to use a custom TokenFactory
    }

    @Override
    public TokenFactory<?> getTokenFactory() {
        return CommonTokenFactory.DEFAULT;
    }
}



