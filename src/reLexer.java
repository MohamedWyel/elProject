// $ANTLR null D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g 2026-04-27 21:06:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class reLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int ASSIGN=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int PRINT=7;
	public static final int PROG=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public reLexer() {} 
	public reLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public reLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:2:7: ( ';' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:2:9: ';'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:3:7: ( '=' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:3:9: '='
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:4:7: ( 'print' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:4:9: 'print'
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
	// $ANTLR end "T__12"

	// $ANTLR start "PROG"
	public final void mPROG() throws RecognitionException {
		try {
			int _type = PROG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:23:8: ( 'PROG' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:23:10: 'PROG'
			{
			match("PROG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROG"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:24:8: ( 'ASSIGN' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:24:10: 'ASSIGN'
			{
			match("ASSIGN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:25:8: ( 'PRINT' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:25:10: 'PRINT'
			{
			match("PRINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:27:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:27:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:27:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:
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
					break loop1;
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:28:5: ( ( '0' .. '9' )+ )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:28:7: ( '0' .. '9' )+
			{
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:28:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:29:5: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:29:7: ( ' ' | '\\t' | '\\n' | '\\r' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
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
		// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:8: ( T__10 | T__11 | T__12 | PROG | ASSIGN | PRINT | ID | INT | WS )
		int alt3=9;
		switch ( input.LA(1) ) {
		case ';':
			{
			alt3=1;
			}
			break;
		case '=':
			{
			alt3=2;
			}
			break;
		case 'p':
			{
			int LA3_3 = input.LA(2);
			if ( (LA3_3=='r') ) {
				int LA3_9 = input.LA(3);
				if ( (LA3_9=='i') ) {
					int LA3_12 = input.LA(4);
					if ( (LA3_12=='n') ) {
						int LA3_16 = input.LA(5);
						if ( (LA3_16=='t') ) {
							int LA3_20 = input.LA(6);
							if ( ((LA3_20 >= '0' && LA3_20 <= '9')||(LA3_20 >= 'A' && LA3_20 <= 'Z')||LA3_20=='_'||(LA3_20 >= 'a' && LA3_20 <= 'z')) ) {
								alt3=7;
							}

							else {
								alt3=3;
							}

						}

						else {
							alt3=7;
						}

					}

					else {
						alt3=7;
					}

				}

				else {
					alt3=7;
				}

			}

			else {
				alt3=7;
			}

			}
			break;
		case 'P':
			{
			int LA3_4 = input.LA(2);
			if ( (LA3_4=='R') ) {
				switch ( input.LA(3) ) {
				case 'O':
					{
					int LA3_13 = input.LA(4);
					if ( (LA3_13=='G') ) {
						int LA3_17 = input.LA(5);
						if ( ((LA3_17 >= '0' && LA3_17 <= '9')||(LA3_17 >= 'A' && LA3_17 <= 'Z')||LA3_17=='_'||(LA3_17 >= 'a' && LA3_17 <= 'z')) ) {
							alt3=7;
						}

						else {
							alt3=4;
						}

					}

					else {
						alt3=7;
					}

					}
					break;
				case 'I':
					{
					int LA3_14 = input.LA(4);
					if ( (LA3_14=='N') ) {
						int LA3_18 = input.LA(5);
						if ( (LA3_18=='T') ) {
							int LA3_22 = input.LA(6);
							if ( ((LA3_22 >= '0' && LA3_22 <= '9')||(LA3_22 >= 'A' && LA3_22 <= 'Z')||LA3_22=='_'||(LA3_22 >= 'a' && LA3_22 <= 'z')) ) {
								alt3=7;
							}

							else {
								alt3=6;
							}

						}

						else {
							alt3=7;
						}

					}

					else {
						alt3=7;
					}

					}
					break;
				default:
					alt3=7;
				}
			}

			else {
				alt3=7;
			}

			}
			break;
		case 'A':
			{
			int LA3_5 = input.LA(2);
			if ( (LA3_5=='S') ) {
				int LA3_11 = input.LA(3);
				if ( (LA3_11=='S') ) {
					int LA3_15 = input.LA(4);
					if ( (LA3_15=='I') ) {
						int LA3_19 = input.LA(5);
						if ( (LA3_19=='G') ) {
							int LA3_23 = input.LA(6);
							if ( (LA3_23=='N') ) {
								int LA3_26 = input.LA(7);
								if ( ((LA3_26 >= '0' && LA3_26 <= '9')||(LA3_26 >= 'A' && LA3_26 <= 'Z')||LA3_26=='_'||(LA3_26 >= 'a' && LA3_26 <= 'z')) ) {
									alt3=7;
								}

								else {
									alt3=5;
								}

							}

							else {
								alt3=7;
							}

						}

						else {
							alt3=7;
						}

					}

					else {
						alt3=7;
					}

				}

				else {
					alt3=7;
				}

			}

			else {
				alt3=7;
			}

			}
			break;
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=7;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt3=8;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt3=9;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:28: PROG
				{
				mPROG(); 

				}
				break;
			case 5 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:33: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 6 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:40: PRINT
				{
				mPRINT(); 

				}
				break;
			case 7 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:46: ID
				{
				mID(); 

				}
				break;
			case 8 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:49: INT
				{
				mINT(); 

				}
				break;
			case 9 :
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:1:53: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
