package red.stevo.code;


import red.stevo.code.Lexer.ZaraLexer;
import red.stevo.code.Lexer.parser;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        ZaraLexer lexer = new ZaraLexer(new FileReader("src/main/resources/file.zr"));
        parser parser = new parser(lexer);
        parser.parse();

    }
}