package red.stevo.code;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import red.stevo.code.Lexer.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        bottomUpParser();

        //topDownParser();                                                                                                                             /**/

    }

    private static void bottomUpParser() throws Exception {
        ZaraLexer lexer = new ZaraLexer(new FileReader("/home/bree/repositories/Collaboration_Compiler_Construction/zaraSymbolTable/src/main/resources/file.zr"));
        parser parser = new parser(lexer);
        parser.parse();
    }

    private static void topDownParser() throws IOException, ParseException {

    }
}