package red.stevo.code;


import red.stevo.code.Parser.ZaraLexer;
import red.stevo.code.Parser.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        ZaraLexer lexer = new ZaraLexer(new FileReader("src/main/resources/file.zr"));
        parser parser = new parser(lexer);

        System.out.println(parser.scan());
    }
}