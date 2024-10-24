package red.stevo.code;


import red.stevo.code.Parser.ZaraLexer;
import red.stevo.code.Parser.parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        ZaraLexer lexer = new ZaraLexer(new FileReader("src/main/resources/file.zr"));
        parser parser = new parser(lexer);

        System.out.println(parser.scan());

    }

    void topDownParser(){

       /* InputStream input = new FileReader("your_input_file.txt");


        ZaraParser parser = new ZaraParser(input);
        parser.Start();  // Start parsing based on your grammar's start rule

        System.out.println("Parsing completed successfully!");*/
    }
}