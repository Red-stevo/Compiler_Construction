package red.stevo.code.Lexer;/* Generated By:JavaCC: Do not edit this line. ZaraParser.java */
import java.io.*;
import java_cup.runtime.Symbol;
import red.stevo.code.Parser.ZaraLexer;

import static red.stevo.code.Parser.sym.CONSTANT;
import static red.stevo.code.Parser.sym.FLOAT;

// The parser uses the JFlex lexer ZaraLexer
public class ZaraParser implements ZaraParserConstants {
    ZaraLexer lexer;

    public ZaraParser(InputStreamReader in) {
        lexer = new ZaraLexer(in);  // Instantiate the lexer with an InputStream
    }

    public void Starting() throws Exception {
        Symbol s = lexer.next_token();  // Get token from the JFlex lexer
        while (s.sym != sym.EOF) {
            // Process token, build AST, etc.
            System.out.println("Token: " + s.sym + " (" + s.value + ")");
            s = lexer.next_token();  // Get next token
        }
    }

// Grammar rules start here
  final public void Start() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
      case CONSTANT:
      case FLOAT:
      case 6:
      case 11:
      case 13:
      case 14:
      case 15:
      case 24:
      case 25:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      Statement();
    }
    jj_consume_token(0);
  }

  final public void Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      VariableDeclaration();
      break;
      FunctionDeclaration();
      break;
    case 11:
      IfStatement();
      break;
    case 13:
      WhileStatement();
      break;
    case 14:
      ForStatement();
      break;
    case CONSTANT:
    case FLOAT:
    case 6:
    case 24:
    case 25:
      ExpressionStatement();
      break;
    case 15:
      ReturnStatement();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(4);
  }

  final public void VariableDeclaration() throws ParseException {
    Token t;
    t = jj_consume_token(IDENTIFIER);
    jj_consume_token(5);
    Expression();
                                        System.out.println("Declared variable: " + t.image);
  }

  final public void FunctionDeclaration() throws ParseException {
    Token t;
    jj_consume_token(IDENTIFIER);
    jj_consume_token(6);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      ParameterList();
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    jj_consume_token(7);
    jj_consume_token(8);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
      case CONSTANT:
      case FLOAT:
      case 6:
      case 11:
      case 13:
      case 14:
      case 15:
      case 24:
      case 25:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      Statement();
    }
    jj_consume_token(9);
      System.out.println("Declared function: " + t.image);
  }

  final public void ParameterList() throws ParseException {
    jj_consume_token(IDENTIFIER);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 10:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      jj_consume_token(10);
      jj_consume_token(IDENTIFIER);
    }
  }

  final public void IfStatement() throws ParseException {
    jj_consume_token(11);
    jj_consume_token(6);
    Expression();
    jj_consume_token(7);
    Block();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 12:
      jj_consume_token(12);
      Block();
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
  }

  final public void WhileStatement() throws ParseException {
    jj_consume_token(13);
    jj_consume_token(6);
    Expression();
    jj_consume_token(7);
    Block();
  }

  final public void ForStatement() throws ParseException {
    jj_consume_token(14);
    jj_consume_token(6);
    Expression();
    jj_consume_token(4);
    Expression();
    jj_consume_token(4);
    Expression();
    jj_consume_token(7);
    Block();
  }

  final public void ReturnStatement() throws ParseException {
    jj_consume_token(15);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
    case CONSTANT:
    case FLOAT:
    case 6:
    case 24:
    case 25:
      Expression();
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
  }

  final public void Block() throws ParseException {
    jj_consume_token(8);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
      case CONSTANT:
      case FLOAT:
      case 6:
      case 11:
      case 13:
      case 14:
      case 15:
      case 24:
      case 25:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_4;
      }
      Statement();
    }
    jj_consume_token(9);
  }

  final public void ExpressionStatement() throws ParseException {
    Expression();
  }

  final public void Expression() throws ParseException {
    OrExpression();
  }

  final public void OrExpression() throws ParseException {
    AndExpression();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 16:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_5;
      }
      jj_consume_token(16);
      AndExpression();
    }
  }

  final public void AndExpression() throws ParseException {
    RelationalExpression();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 17:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_6;
      }
      jj_consume_token(17);
      RelationalExpression();
    }
  }

  final public void RelationalExpression() throws ParseException {
    AdditiveExpression();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 18:
        jj_consume_token(18);
        break;
      case 19:
        jj_consume_token(19);
        break;
      case 20:
        jj_consume_token(20);
        break;
      case 21:
        jj_consume_token(21);
        break;
      case 22:
        jj_consume_token(22);
        break;
      case 23:
        jj_consume_token(23);
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      AdditiveExpression();
    }
  }

  final public void AdditiveExpression() throws ParseException {
    MultiplicativeExpression();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
      case 25:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_8;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
        jj_consume_token(24);
        break;
      case 25:
        jj_consume_token(25);
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      MultiplicativeExpression();
    }
  }

  final public void MultiplicativeExpression() throws ParseException {
    UnaryExpression();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 26:
      case 27:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_9;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 26:
        jj_consume_token(26);
        break;
      case 27:
        jj_consume_token(27);
        break;
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      UnaryExpression();
    }
  }

  final public void UnaryExpression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 24:
    case 25:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 24:
        jj_consume_token(24);
        break;
      case 25:
        jj_consume_token(25);
        break;
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
    PrimaryExpression();
  }

  final public void PrimaryExpression() throws ParseException {
    Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      jj_consume_token(IDENTIFIER);
                     System.out.println("Identifier: " + t.image);
      break;
    case CONSTANT:
      jj_consume_token(CONSTANT);
                   System.out.println("Constant: " + t.image);
      break;
    case FLOAT:
      jj_consume_token(FLOAT);
                System.out.println("Float: " + t.image);
      break;
    case 6:
      jj_consume_token(6);
      Expression();
      jj_consume_token(7);
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public ZaraParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x300e84e,0x300e84e,0x2,0x300e84e,0x400,0x1000,0x300004e,0x300e84e,0x10000,0x20000,0xfc0000,0xfc0000,0x3000000,0x3000000,0xc000000,0xc000000,0x3000000,0x3000000,0x4e,};
   }

  /** Constructor with InputStream. */
  public ZaraParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ZaraParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ZaraParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ZaraParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ZaraParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ZaraParser(ZaraParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ZaraParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[30];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 30; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
