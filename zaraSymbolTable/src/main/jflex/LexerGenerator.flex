
import java.lang.System;
import java.io.IOException;


%%

%class LexerGenerator
%unicode
%public
%type Yytoken

%%

[ \t\n]+                     { /* Ignore whitespace */ }
"#".*                       { /* Ignore comments */ }

"\\*\\*"([^*]|\\*[^*])*"\\*\\*" { /* Ignore multi-line comments */ }

("in" | "break" | "func" | "int" | "float" | "string" | "arr" | "stack" | "while" |"if" | "else" | "else-if" | "do" | "for" | "return" |"continue"){
    System.out.printf("KEYWORD \t %s\n", yytext());
}

[+-]?[0-9]+(\.[0-9]+)?([eE][+-]?[0-9]+)?  {
    System.out.printf("FLOAT \t %s\n", yytext());
}
[+-]?[0-9]+                             {
    System.out.printf("CONSTANT \t %s\n", yytext());
}

[A-Za-z][A-Za-z0-9]*                    {
    System.out.printf("IDENTIFIER \t %s\n", yytext());
}

[{},;()\[\]]                            {
    System.out.printf("PUNCTUATION \t %s\n", yytext());
}

\"([^\"\\\n]|\\[btnrf\"\\])*\"          {
    System.out.printf("STRING LITERAL \t %s\n", yytext());
}

("+"|"-"|"*"|"/"|">"|"<"|"&&"|"=="|">="|"<="|"="|"!"|"||")                           {
    System.out.printf("OPERATOR \t %s\n", yytext());
}

.                                       {
    System.out.printf("ERROR: Unrecognized character '%s'\n", yytext());
    System.exit(1);
}

