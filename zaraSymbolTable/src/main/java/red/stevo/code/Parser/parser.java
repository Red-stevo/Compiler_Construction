
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package red.stevo.code.Parser;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\010\004\000\002\007\005\000\002\011\003" +
    "\000\002\011\002\000\002\012\003\000\002\012\002\000" +
    "\002\013\003\000\002\014\005\000\002\014\003\000\002" +
    "\003\004\000\002\004\005\000\002\004\005\000\002\004" +
    "\003\000\002\005\005\000\002\005\005\000\002\005\003" +
    "\000\002\006\003\000\002\006\003\000\002\006\003\000" +
    "\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\012\002\uffff\033\uffff\040\uffff\041\uffff\001" +
    "\002\000\012\002\012\033\ufffb\040\ufffb\041\006\001\002" +
    "\000\006\013\022\034\021\001\002\000\006\033\ufffc\040" +
    "\ufffc\001\002\000\004\004\017\001\002\000\012\002\000" +
    "\033\000\040\000\041\000\001\002\000\006\033\ufff9\040" +
    "\013\001\002\000\004\002\001\001\002\000\004\033\ufffa" +
    "\001\002\000\004\033\015\001\002\000\004\004\ufff8\001" +
    "\002\000\004\004\ufffd\001\002\000\006\013\ufffe\034\ufffe" +
    "\001\002\000\012\002\ufff5\033\ufff5\040\ufff5\041\ufff5\001" +
    "\002\000\012\002\ufff6\033\ufff6\040\ufff6\041\ufff6\001\002" +
    "\000\012\004\027\005\025\006\031\035\030\001\002\000" +
    "\020\007\uffef\010\uffef\011\uffef\012\uffef\013\uffef\034\uffef" +
    "\036\uffef\001\002\000\020\007\ufff2\010\ufff2\011\037\012" +
    "\040\013\ufff2\034\ufff2\036\ufff2\001\002\000\020\007\uffee" +
    "\010\uffee\011\uffee\012\uffee\013\uffee\034\uffee\036\uffee\001" +
    "\002\000\012\007\035\010\033\013\022\034\021\001\002" +
    "\000\020\007\uffed\010\uffed\011\uffed\012\uffed\013\uffed\034" +
    "\uffed\036\uffed\001\002\000\012\004\027\005\025\006\031" +
    "\035\030\001\002\000\020\007\uffec\010\uffec\011\uffec\012" +
    "\uffec\013\uffec\034\uffec\036\uffec\001\002\000\010\007\035" +
    "\010\033\036\034\001\002\000\012\004\027\005\025\006" +
    "\031\035\030\001\002\000\020\007\uffeb\010\uffeb\011\uffeb" +
    "\012\uffeb\013\uffeb\034\uffeb\036\uffeb\001\002\000\012\004" +
    "\027\005\025\006\031\035\030\001\002\000\020\007\ufff4" +
    "\010\ufff4\011\037\012\040\013\ufff4\034\ufff4\036\ufff4\001" +
    "\002\000\012\004\027\005\025\006\031\035\030\001\002" +
    "\000\012\004\027\005\025\006\031\035\030\001\002\000" +
    "\020\007\ufff0\010\ufff0\011\ufff0\012\ufff0\013\ufff0\034\ufff0" +
    "\036\ufff0\001\002\000\020\007\ufff1\010\ufff1\011\ufff1\012" +
    "\ufff1\013\ufff1\034\ufff1\036\ufff1\001\002\000\020\007\ufff3" +
    "\010\ufff3\011\037\012\040\013\ufff3\034\ufff3\036\ufff3\001" +
    "\002\000\012\002\ufff7\033\ufff7\040\ufff7\041\ufff7\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\004\002\003\001\001\000\012\003\007\007" +
    "\006\010\004\011\010\001\001\000\004\014\017\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\013\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\015\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\025\005\023\006\022\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\014\043" +
    "\001\001\000\002\001\001\000\010\004\031\005\023\006" +
    "\022\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\005\042\006\022\001\001\000\002\001\001\000\006\005" +
    "\035\006\022\001\001\000\002\001\001\000\004\006\041" +
    "\001\001\000\004\006\040\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  private ZaraLexer scanner;

  public parser(ZaraLexer s) {
    this.scanner = s;
  }

  public java_cup.runtime.Symbol scan() throws java.lang.Exception {
     return scanner.yylex();
  }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= StmtList EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // StmtList ::= StmtList Stmt 
            {
              Object RESULT =null;
		System.out.println("Parsed StmtList: StmtList Stmt");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StmtList",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // StmtList ::= 
            {
              Object RESULT =null;
		System.out.println("Parsed empty StmtList");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StmtList",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // l_desclaration ::= keywords IDENTIFIER 
            {
              Object RESULT =null;
		 System.out.println("Parsed l_desclaration ::= keywords IDENTIFIER"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l_desclaration",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // keywords ::= key_1 key_2 key_3 
            {
              Object RESULT =null;
		 System.out.println("Parsed keywords ::= key_1 key_2 key_3"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("keywords",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // key_1 ::= GLOBAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("key_1",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // key_1 ::= 
            {
              Object RESULT =null;
		 System.out.println("Parsed key_1 ::= GLOBAL | "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("key_1",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // key_2 ::= CONST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("key_2",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // key_2 ::= 
            {
              Object RESULT =null;
		 System.out.println("Parsed key_2 ::= CONST |"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("key_2",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // key_3 ::= DATATYPE 
            {
              Object RESULT =null;
		 System.out.println("Parsed key_3 ::= DATATYPE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("key_3",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // initialize ::= ASSIGN Expr initialize 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("initialize",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // initialize ::= SEMI_COLON 
            {
              Object RESULT =null;
		System.out.println("Parsed initialize ::= ASSIGN Expr initialize | SEMI_COLON");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("initialize",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Stmt ::= l_desclaration initialize 
            {
              Object RESULT =null;
		System.out.println("Parsed Stmt ::= r_desclaration initialize");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Expr ::= Expr OPERATOR_ADD Term 
            {
              Object RESULT =null;
		System.out.println("Parsed Expr: Expr OPERATOR_ADD Term");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Expr ::= Expr OPERATOR_SUB Term 
            {
              Object RESULT =null;
		System.out.println("Parsed Expr: Expr OPERATOR_SUB Term");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Expr ::= Term 
            {
              Object RESULT =null;
		System.out.println("Parsed Expr: Term");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Term ::= Term OPERATOR_MUL Factor 
            {
              Object RESULT =null;
		System.out.println("Parsed Term: Term OPERATOR_MUL Factor");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Term ::= Term OPERATOR_DIV Factor 
            {
              Object RESULT =null;
		System.out.println("Parsed Term: Term OPERATOR_DIV Factor");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Term ::= Factor 
            {
              Object RESULT =null;
		System.out.println("Parsed Term: Factor");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Factor ::= CONSTANT 
            {
              Object RESULT =null;
		System.out.println("Parsed Factor: CONSTANT");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Factor ::= IDENTIFIER 
            {
              Object RESULT =null;
		System.out.println("Parsed Factor: IDENTIFIER");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Factor ::= FLOAT 
            {
              Object RESULT =null;
		System.out.println("Parsed Factor: FLOAT");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Factor ::= PUNCTUATION_LEFT Expr PUNCTUATION_RIGHT 
            {
              Object RESULT =null;
		System.out.println("Parsed Factor: PUNCTUATION_LEFT Expr PUNCTUATION_RIGHT");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}