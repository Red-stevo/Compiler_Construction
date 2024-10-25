// Generated from /home/mirowe/Project/Compiler_Construction/zaraSymbolTable/src/main/ANTLR/ZaraParser.g4 by ANTLR 4.13.2

    package red.stevo.code.Lexer;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ZaraParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, FOR=4, RETURN=5, CONST=6, GLOB=7, IN=8, STRING=9, 
		ARRAY=10, STACK=11, ELSE_IF=12, DO=13, CONTINUE=14, CLASS=15, INT=16, 
		ASSIGN=17, EQ=18, GT=19, LT=20, GTE=21, LTE=22, PLUS=23, MINUS=24, MULT=25, 
		DIV=26, AND=27, NOT=28, DOT=29, OR=30, LPAREN=31, RPAREN=32, LBRACE=33, 
		RBRACE=34, SEMICOLON=35, COMMA=36, COLON=37, LSQUARE=38, RSQUARE=39, IDENTIFIER=40, 
		CONSTANT=41, FLOAT=42;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_functionDeclaration = 3, 
		RULE_parameterList = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, 
		RULE_forStatement = 7, RULE_returnStatement = 8, RULE_block = 9, RULE_expressionStatement = 10, 
		RULE_expression = 11, RULE_orExpression = 12, RULE_andExpression = 13, 
		RULE_relationalExpression = 14, RULE_additiveExpression = 15, RULE_multiplicativeExpression = 16, 
		RULE_unaryExpression = 17, RULE_primaryExpression = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "variableDeclaration", "functionDeclaration", "parameterList", 
			"ifStatement", "whileStatement", "forStatement", "returnStatement", "block", 
			"expressionStatement", "expression", "orExpression", "andExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'for'", "'return'", "'const'", "'global'", 
			"'in'", "'string'", "'arr'", "'stack'", "'else-if'", "'do'", "'continue'", 
			"'class'", "'int'", "'='", "'=='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'&&'", "'!'", "'.'", "'||'", "'('", "')'", "'{'", 
			"'}'", "';'", "','", "':'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "FOR", "RETURN", "CONST", "GLOB", "IN", 
			"STRING", "ARRAY", "STACK", "ELSE_IF", "DO", "CONTINUE", "CLASS", "INT", 
			"ASSIGN", "EQ", "GT", "LT", "GTE", "LTE", "PLUS", "MINUS", "MULT", "DIV", 
			"AND", "NOT", "DOT", "OR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", 
			"COMMA", "COLON", "LSQUARE", "RSQUARE", "IDENTIFIER", "CONSTANT", "FLOAT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ZaraParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ZaraParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ZaraParserParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7698754043962L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(ZaraParserParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ZaraParserParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZaraParserParser.SEMICOLON, 0); }
		public TerminalNode LPAREN() { return getToken(ZaraParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ZaraParserParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((StatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(47);
				match(ASSIGN);
				setState(48);
				expression();
				setState(49);
				match(SEMICOLON);
				System.out.println("Declared variable: " + (((StatementContext)_localctx).IDENTIFIER!=null?((StatementContext)_localctx).IDENTIFIER.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				((StatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(53);
				match(LPAREN);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(54);
					parameterList();
					}
				}

				setState(57);
				match(RPAREN);
				setState(58);
				block();
				System.out.println("Declared function: " + (((StatementContext)_localctx).IDENTIFIER!=null?((StatementContext)_localctx).IDENTIFIER.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				expressionStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(ZaraParserParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ZaraParserParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZaraParserParser.SEMICOLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((VariableDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(69);
			match(ASSIGN);
			setState(70);
			expression();
			setState(71);
			match(SEMICOLON);
			System.out.println("Declared variable: " + (((VariableDeclarationContext)_localctx).IDENTIFIER!=null?((VariableDeclarationContext)_localctx).IDENTIFIER.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(ZaraParserParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ZaraParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ZaraParserParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((FunctionDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(75);
			match(LPAREN);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(76);
				parameterList();
				}
			}

			setState(79);
			match(RPAREN);
			setState(80);
			block();
			System.out.println("Declared function: " + (((FunctionDeclarationContext)_localctx).IDENTIFIER!=null?((FunctionDeclarationContext)_localctx).IDENTIFIER.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ZaraParserParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ZaraParserParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ZaraParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ZaraParserParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((ParameterListContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			System.out.println("Parameter: " + (((ParameterListContext)_localctx).IDENTIFIER!=null?((ParameterListContext)_localctx).IDENTIFIER.getText():null));
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				((ParameterListContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				System.out.println("Parameter: " + (((ParameterListContext)_localctx).IDENTIFIER!=null?((ParameterListContext)_localctx).IDENTIFIER.getText():null));
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ZaraParserParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ZaraParserParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ZaraParserParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ZaraParserParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IF);
			setState(94);
			match(LPAREN);
			setState(95);
			expression();
			setState(96);
			match(RPAREN);
			setState(97);
			block();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(98);
				match(ELSE);
				setState(99);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ZaraParserParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ZaraParserParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ZaraParserParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(WHILE);
			setState(103);
			match(LPAREN);
			setState(104);
			expression();
			setState(105);
			match(RPAREN);
			setState(106);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ZaraParserParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ZaraParserParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ZaraParserParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ZaraParserParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(ZaraParserParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FOR);
			setState(109);
			match(LPAREN);
			setState(110);
			expression();
			setState(111);
			match(SEMICOLON);
			setState(112);
			expression();
			setState(113);
			match(SEMICOLON);
			setState(114);
			expression();
			setState(115);
			match(RPAREN);
			setState(116);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ZaraParserParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ZaraParserParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(RETURN);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7698754043904L) != 0)) {
				{
				setState(119);
				expression();
				}
			}

			setState(122);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ZaraParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ZaraParserParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LBRACE);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7698754043962L) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ZaraParserParser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			expression();
			setState(134);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			orExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ZaraParserParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ZaraParserParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			andExpression();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(139);
				match(OR);
				setState(140);
				andExpression();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ZaraParserParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ZaraParserParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			relationalExpression();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(147);
				match(AND);
				setState(148);
				relationalExpression();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(ZaraParserParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ZaraParserParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(ZaraParserParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ZaraParserParser.LT, i);
		}
		public List<TerminalNode> EQ() { return getTokens(ZaraParserParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ZaraParserParser.EQ, i);
		}
		public List<TerminalNode> GTE() { return getTokens(ZaraParserParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(ZaraParserParser.GTE, i);
		}
		public List<TerminalNode> LTE() { return getTokens(ZaraParserParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(ZaraParserParser.LTE, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			additiveExpression();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) {
				{
				{
				setState(155);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				additiveExpression();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ZaraParserParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ZaraParserParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ZaraParserParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ZaraParserParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			multiplicativeExpression();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				multiplicativeExpression();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(ZaraParserParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(ZaraParserParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ZaraParserParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ZaraParserParser.DIV, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			unaryExpression();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				unaryExpression();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ZaraParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ZaraParserParser.MINUS, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(181);
			primaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public Token CONSTANT;
		public Token FLOAT;
		public TerminalNode IDENTIFIER() { return getToken(ZaraParserParser.IDENTIFIER, 0); }
		public TerminalNode CONSTANT() { return getToken(ZaraParserParser.CONSTANT, 0); }
		public TerminalNode FLOAT() { return getToken(ZaraParserParser.FLOAT, 0); }
		public TerminalNode LPAREN() { return getToken(ZaraParserParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ZaraParserParser.RPAREN, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZaraParserListener ) ((ZaraParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZaraParserVisitor ) return ((ZaraParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primaryExpression);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((PrimaryExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				System.out.println("Identifier: " + (((PrimaryExpressionContext)_localctx).IDENTIFIER!=null?((PrimaryExpressionContext)_localctx).IDENTIFIER.getText():null));
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				((PrimaryExpressionContext)_localctx).CONSTANT = match(CONSTANT);
				System.out.println("Constant: " + (((PrimaryExpressionContext)_localctx).CONSTANT!=null?((PrimaryExpressionContext)_localctx).CONSTANT.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				((PrimaryExpressionContext)_localctx).FLOAT = match(FLOAT);
				System.out.println("Float: " + (((PrimaryExpressionContext)_localctx).FLOAT!=null?((PrimaryExpressionContext)_localctx).FLOAT.getText():null));
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(LPAREN);
				setState(190);
				expression();
				setState(191);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004Y\b\u0004\n\u0004\f\u0004\\\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005e\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0003\by\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t"+
		"\u007f\b\t\n\t\f\t\u0082\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u008e\b\f\n\f\f\f\u0091"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u0096\b\r\n\r\f\r\u0099\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u009e\b\u000e\n\u000e\f\u000e"+
		"\u00a1\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00a6\b"+
		"\u000f\n\u000f\f\u000f\u00a9\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00ae\b\u0010\n\u0010\f\u0010\u00b1\t\u0010\u0001\u0011\u0003"+
		"\u0011\u00b4\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00c2\b\u0012\u0001\u0012\u0000\u0000\u0013"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$\u0000\u0003\u0001\u0000\u0012\u0016\u0001\u0000\u0017"+
		"\u0018\u0001\u0000\u0019\u001a\u00c6\u0000)\u0001\u0000\u0000\u0000\u0002"+
		"B\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006J\u0001"+
		"\u0000\u0000\u0000\bS\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000"+
		"\ff\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010v\u0001"+
		"\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000"+
		"\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018\u008a\u0001\u0000"+
		"\u0000\u0000\u001a\u0092\u0001\u0000\u0000\u0000\u001c\u009a\u0001\u0000"+
		"\u0000\u0000\u001e\u00a2\u0001\u0000\u0000\u0000 \u00aa\u0001\u0000\u0000"+
		"\u0000\"\u00b3\u0001\u0000\u0000\u0000$\u00c1\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001"+
		"\u0001\u0000\u0000\u0000./\u0005(\u0000\u0000/0\u0005\u0011\u0000\u0000"+
		"01\u0003\u0016\u000b\u000012\u0005#\u0000\u000023\u0006\u0001\uffff\uffff"+
		"\u00003C\u0001\u0000\u0000\u000045\u0005(\u0000\u000057\u0005\u001f\u0000"+
		"\u000068\u0003\b\u0004\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009:\u0005 \u0000\u0000:;\u0003\u0012\t"+
		"\u0000;<\u0006\u0001\uffff\uffff\u0000<C\u0001\u0000\u0000\u0000=C\u0003"+
		"\n\u0005\u0000>C\u0003\f\u0006\u0000?C\u0003\u000e\u0007\u0000@C\u0003"+
		"\u0014\n\u0000AC\u0003\u0010\b\u0000B.\u0001\u0000\u0000\u0000B4\u0001"+
		"\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000"+
		"B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000C\u0003\u0001\u0000\u0000\u0000DE\u0005(\u0000\u0000EF\u0005\u0011"+
		"\u0000\u0000FG\u0003\u0016\u000b\u0000GH\u0005#\u0000\u0000HI\u0006\u0002"+
		"\uffff\uffff\u0000I\u0005\u0001\u0000\u0000\u0000JK\u0005(\u0000\u0000"+
		"KM\u0005\u001f\u0000\u0000LN\u0003\b\u0004\u0000ML\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005 \u0000\u0000"+
		"PQ\u0003\u0012\t\u0000QR\u0006\u0003\uffff\uffff\u0000R\u0007\u0001\u0000"+
		"\u0000\u0000ST\u0005(\u0000\u0000TZ\u0006\u0004\uffff\uffff\u0000UV\u0005"+
		"$\u0000\u0000VW\u0005(\u0000\u0000WY\u0006\u0004\uffff\uffff\u0000XU\u0001"+
		"\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[\t\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]^\u0005\u0001\u0000\u0000^_\u0005\u001f\u0000\u0000_`\u0003\u0016"+
		"\u000b\u0000`a\u0005 \u0000\u0000ad\u0003\u0012\t\u0000bc\u0005\u0002"+
		"\u0000\u0000ce\u0003\u0012\t\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005\u0003\u0000\u0000"+
		"gh\u0005\u001f\u0000\u0000hi\u0003\u0016\u000b\u0000ij\u0005 \u0000\u0000"+
		"jk\u0003\u0012\t\u0000k\r\u0001\u0000\u0000\u0000lm\u0005\u0004\u0000"+
		"\u0000mn\u0005\u001f\u0000\u0000no\u0003\u0016\u000b\u0000op\u0005#\u0000"+
		"\u0000pq\u0003\u0016\u000b\u0000qr\u0005#\u0000\u0000rs\u0003\u0016\u000b"+
		"\u0000st\u0005 \u0000\u0000tu\u0003\u0012\t\u0000u\u000f\u0001\u0000\u0000"+
		"\u0000vx\u0005\u0005\u0000\u0000wy\u0003\u0016\u000b\u0000xw\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005"+
		"#\u0000\u0000{\u0011\u0001\u0000\u0000\u0000|\u0080\u0005!\u0000\u0000"+
		"}\u007f\u0003\u0002\u0001\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\"\u0000\u0000\u0084\u0013\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0003\u0016\u000b\u0000\u0086\u0087\u0005#\u0000"+
		"\u0000\u0087\u0015\u0001\u0000\u0000\u0000\u0088\u0089\u0003\u0018\f\u0000"+
		"\u0089\u0017\u0001\u0000\u0000\u0000\u008a\u008f\u0003\u001a\r\u0000\u008b"+
		"\u008c\u0005\u001e\u0000\u0000\u008c\u008e\u0003\u001a\r\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0019"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0097"+
		"\u0003\u001c\u000e\u0000\u0093\u0094\u0005\u001b\u0000\u0000\u0094\u0096"+
		"\u0003\u001c\u000e\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u001b\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u009f\u0003\u001e\u000f\u0000\u009b\u009c"+
		"\u0007\u0000\u0000\u0000\u009c\u009e\u0003\u001e\u000f\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u001d"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a7"+
		"\u0003 \u0010\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000\u00a4\u00a6\u0003"+
		" \u0010\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u001f\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00af\u0003\"\u0011\u0000\u00ab\u00ac\u0007\u0002\u0000"+
		"\u0000\u00ac\u00ae\u0003\"\u0011\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0!\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00b4\u0007\u0001\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003$\u0012\u0000\u00b6#\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0005(\u0000\u0000\u00b8\u00c2\u0006\u0012"+
		"\uffff\uffff\u0000\u00b9\u00ba\u0005)\u0000\u0000\u00ba\u00c2\u0006\u0012"+
		"\uffff\uffff\u0000\u00bb\u00bc\u0005*\u0000\u0000\u00bc\u00c2\u0006\u0012"+
		"\uffff\uffff\u0000\u00bd\u00be\u0005\u001f\u0000\u0000\u00be\u00bf\u0003"+
		"\u0016\u000b\u0000\u00bf\u00c0\u0005 \u0000\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00b7\u0001\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c2%\u0001\u0000\u0000\u0000\u000f)7BMZdx\u0080\u008f\u0097"+
		"\u009f\u00a7\u00af\u00b3\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}