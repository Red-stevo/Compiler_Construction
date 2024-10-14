package red.stevo.code;


import red.stevo.code.Lexer.ZaraLexer;

import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        ZaraLexer zaraLexer = new ZaraLexer(new FileReader("src/main/resources/file.zr"));

        zaraLexer.yylex();
    }
}