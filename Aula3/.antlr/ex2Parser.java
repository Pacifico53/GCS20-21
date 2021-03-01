// Generated from /home/pacifico/Git/GCS20-21/Aula3/ex2.g4 by ANTLR 4.8

    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ex2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TURMA=1, ID=2, NUM=3, VIRG=4, PONTOVIRG=5, PONTO=6, LPAREN=7, RPARENT=8, 
		WS=9;
	public static final int
		RULE_turma = 0, RULE_alunos = 1, RULE_aluno = 2, RULE_notas = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"turma", "alunos", "aluno", "notas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "','", "';'", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TURMA", "ID", "NUM", "VIRG", "PONTOVIRG", "PONTO", "LPAREN", "RPARENT", 
			"WS"
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
	public String getGrammarFileName() { return "ex2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int totalAlunos = 0;
	    int media = 0;
	    int numNotas = 0;
	    ArrayList<String> nomes = new ArrayList<String>();
	    String currentNome;

	public ex2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TurmaContext extends ParserRuleContext {
		public TerminalNode TURMA() { return getToken(ex2Parser.TURMA, 0); }
		public TerminalNode ID() { return getToken(ex2Parser.ID, 0); }
		public AlunosContext alunos() {
			return getRuleContext(AlunosContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(ex2Parser.PONTO, 0); }
		public TurmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turma; }
	}

	public final TurmaContext turma() throws RecognitionException {
		TurmaContext _localctx = new TurmaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_turma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(TURMA);
			setState(9);
			match(ID);
			setState(10);
			alunos();
			setState(11);
			match(PONTO);

			            System.out.println("Alunos:" + totalAlunos);
			        
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

	public static class AlunosContext extends ParserRuleContext {
		public List<AlunoContext> aluno() {
			return getRuleContexts(AlunoContext.class);
		}
		public AlunoContext aluno(int i) {
			return getRuleContext(AlunoContext.class,i);
		}
		public List<TerminalNode> PONTOVIRG() { return getTokens(ex2Parser.PONTOVIRG); }
		public TerminalNode PONTOVIRG(int i) {
			return getToken(ex2Parser.PONTOVIRG, i);
		}
		public AlunosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alunos; }
	}

	public final AlunosContext alunos() throws RecognitionException {
		AlunosContext _localctx = new AlunosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alunos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			aluno();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTOVIRG) {
				{
				{
				setState(15);
				match(PONTOVIRG);
				setState(16);
				aluno();
				}
				}
				setState(21);
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

	public static class AlunoContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(ex2Parser.ID, 0); }
		public NotasContext notas() {
			return getRuleContext(NotasContext.class,0);
		}
		public AlunoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aluno; }
	}

	public final AlunoContext aluno() throws RecognitionException {
		AlunoContext _localctx = new AlunoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((AlunoContext)_localctx).ID = match(ID);

			            currentNome = (((AlunoContext)_localctx).ID!=null?((AlunoContext)_localctx).ID.getText():null);
			            if(nomes.contains(currentNome)){
			                System.out.println("Repeated name: " + currentNome+ ".");
			            }else{
			                nomes.add(currentNome);
			            }
			       
			setState(24);
			notas();

			            totalAlunos++;
			            System.out.println("----------------\n"+currentNome+": M = "+media+".. N = "+numNotas);

			            if(numNotas > 6 || numNotas < 4){
			                System.out.println("Numero de notas invalido ("+numNotas+").\n-------------");
			            } else {
			                media = media / numNotas;
			                System.out.println("Media = "+media+"\n--------------");
			            }
			            media = 0;
			            numNotas = 0;
			        
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

	public static class NotasContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode LPAREN() { return getToken(ex2Parser.LPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(ex2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ex2Parser.NUM, i);
		}
		public TerminalNode RPARENT() { return getToken(ex2Parser.RPARENT, 0); }
		public List<TerminalNode> VIRG() { return getTokens(ex2Parser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(ex2Parser.VIRG, i);
		}
		public NotasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notas; }
	}

	public final NotasContext notas() throws RecognitionException {
		NotasContext _localctx = new NotasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_notas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(LPAREN);
			setState(28);
			((NotasContext)_localctx).NUM = match(NUM);

			            media += (((NotasContext)_localctx).NUM!=null?Integer.valueOf(((NotasContext)_localctx).NUM.getText()):0); numNotas++;
			            if((((NotasContext)_localctx).NUM!=null?Integer.valueOf(((NotasContext)_localctx).NUM.getText()):0) > 20 || (((NotasContext)_localctx).NUM!=null?Integer.valueOf(((NotasContext)_localctx).NUM.getText()):0) < 0)
			                System.out.println("Erro, nota invalida.");
			        
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(30);
				match(VIRG);
				setState(31);
				((NotasContext)_localctx).NUM = match(NUM);
				numNotas++; media += (((NotasContext)_localctx).NUM!=null?Integer.valueOf(((NotasContext)_localctx).NUM.getText()):0);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(RPARENT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\24\n\3\f\3"+
		"\16\3\27\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5$\n\5\f\5"+
		"\16\5\'\13\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2(\2\n\3\2\2\2\4\20\3\2\2\2"+
		"\6\30\3\2\2\2\b\35\3\2\2\2\n\13\7\3\2\2\13\f\7\4\2\2\f\r\5\4\3\2\r\16"+
		"\7\b\2\2\16\17\b\2\1\2\17\3\3\2\2\2\20\25\5\6\4\2\21\22\7\7\2\2\22\24"+
		"\5\6\4\2\23\21\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\5"+
		"\3\2\2\2\27\25\3\2\2\2\30\31\7\4\2\2\31\32\b\4\1\2\32\33\5\b\5\2\33\34"+
		"\b\4\1\2\34\7\3\2\2\2\35\36\7\t\2\2\36\37\7\5\2\2\37%\b\5\1\2 !\7\6\2"+
		"\2!\"\7\5\2\2\"$\b\5\1\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3"+
		"\2\2\2\'%\3\2\2\2()\7\n\2\2)\t\3\2\2\2\4\25%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}