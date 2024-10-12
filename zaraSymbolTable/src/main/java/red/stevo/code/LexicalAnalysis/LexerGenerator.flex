%{
        package red.stevo.code.LexicalAnalysis;
        import java.lang.System;
%}
        %class ZaraLexer
        %unicode
        %public

%%

        [ \t\n]+  { ; }

        "#".*   { ; }
        "\\*\\*"([^*]|\\*[^*])*"\\*\\*"   { ; }
        "sub"    { System.out.printf("KEYWORD \t sub\n"); }
        "int"    { System.out.printf("KEYWORD \t int\n"); }
        "float"  { System.out.printf("KEYWORD \t float\n"); }
        "string" { System.out.printf("KEYWORD \t string\n"); }
        "array"  { System.out.printf("KEYWORD \t array\n"); }
        "stack"  { System.out.printf("KEYWORD \t stack\n"); }
        "while"  { System.out.printf("KEYWORD \t while\n"); }
        "if"     { System.out.printf("KEYWORD \t if\n"); }
        "else"   { System.out.printf("KEYWORD \t else\n"); }
        "elif"   { System.out.printf("KEYWORD \t elif\n"); }
        "do"     { System.out.printf("KEYWORD \t do\n"); }
        "for"    { System.out.printf("KEYWORD \t for\n"); }
        "return"    { System.out.printf("KEYWORD \t return\n"); }
        "continue"    { System.out.printf("KEYWORD \t continue\n"); }
        "break"    { System.out.printf("KEYWORD \t break\n"); }

        [+-]?[0-9]+(\.[0-9]+)?([eE][+-]?[0-9]+)?  { System.out.printf("FLOAT \t %s\n", yytext()); }
        [+-]?[0-9]+   { System.out.printf("CONSTANT \t %s\n", yytext()); }
        [A-Za-z]([A-Za-z]|[0-9])*   { System.out.printf("IDENTIFIER \t %s\n", yytext()); }
        [{},;()\[\]]                { System.out.printf("PUNCTUATION \t %s\n", yytext()); }
        \"([^\"\\\n]|\\[btnrf\"\\])*\"   { System.out.printf("STRING LITERAL \t %s\n", yytext()); }

        "&&"   { System.out.printf("OPERATOR \t &&\n"); }
        "=="   { System.out.printf("OPERATOR \t ==\n"); }
        "="    { System.out.printf("OPERATOR \t =\n"); }
        "||"   { System.out.printf("OPERATOR \t ||\n"); }
        [+\\-/><*]    { System.out.printf("OPERATOR \t %s\n", yytext()); }


        . {
            System.out.printf("ERROR: Unrecognized character '%s'\n", yytext());
            System.exit(1);
        }
