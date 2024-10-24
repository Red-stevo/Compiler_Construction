package red.stevo.code.Parser;

import java.lang.System;
import java.io.IOException;
import java_cup.runtime.Symbol;

%%

%class ZaraLexer
%unicode
%public
%type Symbol

%%

// Ignore whitespace
[ \t\n]+                     { /* Ignore whitespace */ }
// Single-line comments
"#".*                        { /* Ignore comments */ }
// Multi-line comments
"/*"([^*]|[*][^/])*"*/"       { /* Ignore multi-line comments */ }

// KEYWORDS
("const"|"global"|"in" | "break" | "int" | "float" | "string" | "arr" | "stack" | "while" | "if" | "else" | "else-if" | "do" | "for" | "return" | "continue"| "class") {
    return new Symbol(sym.KEYWORD, yytext());
}

// CONSTANTS (integers)
[+-]?[0-9]+                             {
    return new Symbol(sym.CONSTANT, Integer.parseInt(yytext()));
}

// FLOATS
[+-]?[0-9]+(\.[0-9]+)?([eE][+-]?[0-9]+)?  {
    return new Symbol(sym.FLOAT, Double.parseDouble(yytext()));
}

// IDENTIFIERS
[A-Za-z][A-Za-z0-9]*                    {
    return new Symbol(sym.IDENTIFIER, yytext());
}

//[^\".*\"$]  {return new Symbol(sym.STRING, yytext());}

// PUNCTUATION
//[{},:\[\]]                            {return new Symbol(sym.PUNCTUATION, yytext());}



// OPERATORS
//(">"|"<"|"&&"|"=="|">="|"<="|"!"|"||"|".") {return new Symbol(sym.OPERATOR, yytext());}


"+"   {return new Symbol(sym.OPERATOR_ADD);}
"-"   {return new Symbol(sym.OPERATOR_SUB);}
"*"   {return new Symbol(sym.OPERATOR_MUL);}
"/"   {return new Symbol(sym.OPERATOR_DIV);}
"="   {return new Symbol(sym.ASSIGN);}
"("   {return new Symbol(sym.PUNCTUATION_LEFT);}
")"   {return new Symbol(sym.PUNCTUATION_RIGHT);}
";"   {return new Symbol(sym.SEMI_COLON);}

// Error
.  {return new Symbol(sym.ERRor);}

<<EOF>> { return new Symbol( sym.EOF ); }
