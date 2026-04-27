// $ANTLR null D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g 2026-04-27 19:48:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class projectLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int AND=4;
	public static final int BOPR=5;
	public static final int DEC=6;
	public static final int DOUBLE=7;
	public static final int Double_type=8;
	public static final int ID=9;
	public static final int INC=10;
	public static final int INT=11;
	public static final int Int_type=12;
	public static final int Linecomment=13;
	public static final int Multiline_comment=14;
	public static final int OR=15;
	public static final int STRING=16;
	public static final int WS=17;
	public static final int XOR=18;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public projectLexer() {} 
	public projectLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public projectLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g"; }

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:2:7: ( '(' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:3:7: ( ')' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:4:7: ( '*' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:5:7: ( '+' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:6:7: ( ',' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:6:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:7:7: ( '-' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:8:7: ( '.' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:8:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:9:7: ( '/' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:9:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:10:7: ( ';' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:10:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:11:7: ( '=' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:11:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:12:7: ( 'String' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:12:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:13:7: ( 'System' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:13:9: 'System'
			{
			match("System"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:14:7: ( 'else' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:14:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:15:7: ( 'for' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:15:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:16:7: ( 'if' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:16:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:17:7: ( 'out' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:17:9: 'out'
			{
			match("out"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:18:7: ( 'print' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:18:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:19:7: ( 'private' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:19:9: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:20:7: ( 'public' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:20:9: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:21:7: ( 'void' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:21:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:22:7: ( 'while' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:22:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:23:7: ( '{' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:23:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:24:7: ( '}' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:24:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "Linecomment"
	public final void mLinecomment() throws RecognitionException {
		try {
			int _type = Linecomment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:145:19: ( '//' (~ ( '\\n' | '\\r' ) )* )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:145:21: '//' (~ ( '\\n' | '\\r' ) )*
			{
			match("//"); 

			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:145:26: (~ ( '\\n' | '\\r' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Linecomment"

	// $ANTLR start "Multiline_comment"
	public final void mMultiline_comment() throws RecognitionException {
		try {
			int _type = Multiline_comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:148:19: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:148:21: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:148:26: ( options {greedy=false; } : . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='*') ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1=='/') ) {
						alt2=2;
					}
					else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:148:53: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			match("*/"); 

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Multiline_comment"

	// $ANTLR start "Int_type"
	public final void mInt_type() throws RecognitionException {
		try {
			int _type = Int_type;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:151:13: ( 'int' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:151:15: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Int_type"

	// $ANTLR start "Double_type"
	public final void mDouble_type() throws RecognitionException {
		try {
			int _type = Double_type;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:152:13: ( 'double' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:152:15: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Double_type"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:155:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:155:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:155:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:158:8: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:158:10: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:158:10: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match('.'); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:158:26: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:161:8: ( ( '0' .. '9' )+ )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:161:10: ( '0' .. '9' )+
			{
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:161:10: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:164:8: ( '\"' (~ ( '\"' ) )* '\"' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:164:10: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:164:14: (~ ( '\"' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "BOPR"
	public final void mBOPR() throws RecognitionException {
		try {
			int _type = BOPR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:167:6: ( '<=' | '>=' | '==' | '!=' | '<' | '>' )
			int alt8=6;
			switch ( input.LA(1) ) {
			case '<':
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='=') ) {
					alt8=1;
				}

				else {
					alt8=5;
				}

				}
				break;
			case '>':
				{
				int LA8_2 = input.LA(2);
				if ( (LA8_2=='=') ) {
					alt8=2;
				}

				else {
					alt8=6;
				}

				}
				break;
			case '=':
				{
				alt8=3;
				}
				break;
			case '!':
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:167:8: '<='
					{
					match("<="); 

					}
					break;
				case 2 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:167:15: '>='
					{
					match(">="); 

					}
					break;
				case 3 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:167:22: '=='
					{
					match("=="); 

					}
					break;
				case 4 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:167:29: '!='
					{
					match("!="); 

					}
					break;
				case 5 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:167:36: '<'
					{
					match('<'); 
					}
					break;
				case 6 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:167:42: '>'
					{
					match('>'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOPR"

	// $ANTLR start "INC"
	public final void mINC() throws RecognitionException {
		try {
			int _type = INC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:170:6: ( '++' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:170:8: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INC"

	// $ANTLR start "DEC"
	public final void mDEC() throws RecognitionException {
		try {
			int _type = DEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:171:6: ( '--' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:171:8: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:174:6: ( '&&' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:174:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:175:6: ( '||' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:175:8: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:176:6: ( '^' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:176:8: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:179:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:179:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:179:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | Linecomment | Multiline_comment | Int_type | Double_type | ID | DOUBLE | INT | STRING | BOPR | INC | DEC | AND | OR | XOR | WS )
		int alt10=38;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:46: T__25
				{
				mT__25(); 

				}
				break;
			case 8 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:52: T__26
				{
				mT__26(); 

				}
				break;
			case 9 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:58: T__27
				{
				mT__27(); 

				}
				break;
			case 10 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:64: T__28
				{
				mT__28(); 

				}
				break;
			case 11 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:70: T__29
				{
				mT__29(); 

				}
				break;
			case 12 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:76: T__30
				{
				mT__30(); 

				}
				break;
			case 13 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:82: T__31
				{
				mT__31(); 

				}
				break;
			case 14 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:88: T__32
				{
				mT__32(); 

				}
				break;
			case 15 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:94: T__33
				{
				mT__33(); 

				}
				break;
			case 16 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:100: T__34
				{
				mT__34(); 

				}
				break;
			case 17 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:106: T__35
				{
				mT__35(); 

				}
				break;
			case 18 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:112: T__36
				{
				mT__36(); 

				}
				break;
			case 19 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:118: T__37
				{
				mT__37(); 

				}
				break;
			case 20 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:124: T__38
				{
				mT__38(); 

				}
				break;
			case 21 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:130: T__39
				{
				mT__39(); 

				}
				break;
			case 22 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:136: T__40
				{
				mT__40(); 

				}
				break;
			case 23 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:142: T__41
				{
				mT__41(); 

				}
				break;
			case 24 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:148: Linecomment
				{
				mLinecomment(); 

				}
				break;
			case 25 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:160: Multiline_comment
				{
				mMultiline_comment(); 

				}
				break;
			case 26 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:178: Int_type
				{
				mInt_type(); 

				}
				break;
			case 27 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:187: Double_type
				{
				mDouble_type(); 

				}
				break;
			case 28 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:199: ID
				{
				mID(); 

				}
				break;
			case 29 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:202: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 30 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:209: INT
				{
				mINT(); 

				}
				break;
			case 31 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:213: STRING
				{
				mSTRING(); 

				}
				break;
			case 32 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:220: BOPR
				{
				mBOPR(); 

				}
				break;
			case 33 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:225: INC
				{
				mINC(); 

				}
				break;
			case 34 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:229: DEC
				{
				mDEC(); 

				}
				break;
			case 35 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:233: AND
				{
				mAND(); 

				}
				break;
			case 36 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:237: OR
				{
				mOR(); 

				}
				break;
			case 37 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:240: XOR
				{
				mXOR(); 

				}
				break;
			case 38 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:1:244: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\4\uffff\1\37\1\uffff\1\41\1\uffff\1\44\1\uffff\1\45\10\26\2\uffff\1\26"+
		"\1\uffff\1\63\16\uffff\4\26\1\70\7\26\2\uffff\3\26\1\103\1\uffff\1\104"+
		"\1\105\7\26\1\116\3\uffff\3\26\1\122\4\26\1\uffff\1\127\2\26\1\uffff\1"+
		"\132\1\26\1\134\1\135\1\uffff\1\26\1\137\1\uffff\1\140\2\uffff\1\141\3"+
		"\uffff";
	static final String DFA10_eofS =
		"\142\uffff";
	static final String DFA10_minS =
		"\1\11\3\uffff\1\53\1\uffff\1\55\1\uffff\1\52\1\uffff\1\75\1\164\1\154"+
		"\1\157\1\146\1\165\1\162\1\157\1\150\2\uffff\1\157\1\uffff\1\56\16\uffff"+
		"\1\162\2\163\1\162\1\60\2\164\1\151\1\142\2\151\1\165\2\uffff\1\151\1"+
		"\164\1\145\1\60\1\uffff\2\60\1\156\1\154\1\144\1\154\1\142\1\156\1\145"+
		"\1\60\3\uffff\1\164\1\141\1\151\1\60\1\145\1\154\1\147\1\155\1\uffff\1"+
		"\60\1\164\1\143\1\uffff\1\60\1\145\2\60\1\uffff\1\145\1\60\1\uffff\1\60"+
		"\2\uffff\1\60\3\uffff";
	static final String DFA10_maxS =
		"\1\175\3\uffff\1\53\1\uffff\1\55\1\uffff\1\57\1\uffff\1\75\1\171\1\154"+
		"\1\157\1\156\2\165\1\157\1\150\2\uffff\1\157\1\uffff\1\71\16\uffff\1\162"+
		"\2\163\1\162\1\172\2\164\1\151\1\142\2\151\1\165\2\uffff\1\151\1\164\1"+
		"\145\1\172\1\uffff\2\172\1\166\1\154\1\144\1\154\1\142\1\156\1\145\1\172"+
		"\3\uffff\1\164\1\141\1\151\1\172\1\145\1\154\1\147\1\155\1\uffff\1\172"+
		"\1\164\1\143\1\uffff\1\172\1\145\2\172\1\uffff\1\145\1\172\1\uffff\1\172"+
		"\2\uffff\1\172\3\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\7\1\uffff\1\11\11\uffff\1\26"+
		"\1\27\1\uffff\1\34\1\uffff\1\37\1\40\1\43\1\44\1\45\1\46\1\41\1\4\1\42"+
		"\1\6\1\30\1\31\1\10\1\12\14\uffff\1\35\1\36\4\uffff\1\17\12\uffff\1\16"+
		"\1\32\1\20\10\uffff\1\15\3\uffff\1\24\4\uffff\1\21\2\uffff\1\25\1\uffff"+
		"\1\13\1\14\1\uffff\1\23\1\33\1\22";
	static final String DFA10_specialS =
		"\142\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\35\2\uffff\1\35\22\uffff\1\35\1\31\1\30\3\uffff\1\32\1\uffff\1\1\1"+
			"\2\1\3\1\4\1\5\1\6\1\7\1\10\12\27\1\uffff\1\11\1\31\1\12\1\31\2\uffff"+
			"\22\26\1\13\7\26\3\uffff\1\34\1\26\1\uffff\3\26\1\25\1\14\1\15\2\26\1"+
			"\16\5\26\1\17\1\20\5\26\1\21\1\22\3\26\1\23\1\33\1\24",
			"",
			"",
			"",
			"\1\36",
			"",
			"\1\40",
			"",
			"\1\43\4\uffff\1\42",
			"",
			"\1\31",
			"\1\46\4\uffff\1\47",
			"\1\50",
			"\1\51",
			"\1\52\7\uffff\1\53",
			"\1\54",
			"\1\55\2\uffff\1\56",
			"\1\57",
			"\1\60",
			"",
			"",
			"\1\61",
			"",
			"\1\62\1\uffff\12\27",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"",
			"",
			"\1\100",
			"\1\101",
			"\1\102",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\106\7\uffff\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"",
			"",
			"\1\117",
			"\1\120",
			"\1\121",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\130",
			"\1\131",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\133",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\1\136",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | Linecomment | Multiline_comment | Int_type | Double_type | ID | DOUBLE | INT | STRING | BOPR | INC | DEC | AND | OR | XOR | WS );";
		}
	}

}
