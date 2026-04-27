// $ANTLR null D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g 2026-04-27 19:48:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class projectParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BOPR", "DEC", "DOUBLE", 
		"Double_type", "ID", "INC", "INT", "Int_type", "Linecomment", "Multiline_comment", 
		"OR", "STRING", "WS", "XOR", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.'", "'/'", "';'", "'='", "'String'", "'System'", "'else'", "'for'", 
		"'if'", "'out'", "'print'", "'private'", "'public'", "'void'", "'while'", 
		"'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public projectParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public projectParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return projectParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g"; }



	// $ANTLR start "program"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:5:1: program : ( ( statement )+ | quiz );
	public final void program() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:5:9: ( ( statement )+ | quiz )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= Double_type && LA2_0 <= ID)||LA2_0==Int_type||(LA2_0 >= 29 && LA2_0 <= 30)||(LA2_0 >= 32 && LA2_0 <= 33)||(LA2_0 >= 36 && LA2_0 <= 39)) ) {
				alt2=1;
			}
			else if ( (LA2_0==INT) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:5:11: ( statement )+
					{
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:5:11: ( statement )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= Double_type && LA1_0 <= ID)||LA1_0==Int_type||(LA1_0 >= 29 && LA1_0 <= 30)||(LA1_0 >= 32 && LA1_0 <= 33)||(LA1_0 >= 36 && LA1_0 <= 39)) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:5:12: statement
							{
							pushFollow(FOLLOW_statement_in_program13);
							statement();
							state._fsp--;

							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					}
					break;
				case 2 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:5:26: quiz
					{
					pushFollow(FOLLOW_quiz_in_program19);
					quiz();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "quiz"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:7:1: quiz returns [int v] : a= INT ( '+' b= INT | '-' c= INT )* ;
	public final int quiz() throws RecognitionException {
		int v = 0;


		Token a=null;
		Token b=null;
		Token c=null;

		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:8:5: (a= INT ( '+' b= INT | '-' c= INT )* )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:8:7: a= INT ( '+' b= INT | '-' c= INT )*
			{
			a=(Token)match(input,INT,FOLLOW_INT_in_quiz38); 
			 int sum = Integer.parseInt((a!=null?a.getText():null)); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:10:7: ( '+' b= INT | '-' c= INT )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==22) ) {
					alt3=1;
				}
				else if ( (LA3_0==24) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:11:9: '+' b= INT
					{
					match(input,22,FOLLOW_22_in_quiz64); 
					b=(Token)match(input,INT,FOLLOW_INT_in_quiz68); 
					 sum += Integer.parseInt((b!=null?b.getText():null)); 
					}
					break;
				case 2 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:12:9: '-' c= INT
					{
					match(input,24,FOLLOW_24_in_quiz80); 
					c=(Token)match(input,INT,FOLLOW_INT_in_quiz84); 
					 sum -= Integer.parseInt((c!=null?c.getText():null)); 
					}
					break;

				default :
					break loop3;
				}
			}

			 v=sum ; System.out.println(v); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "quiz"



	// $ANTLR start "statement"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:18:1: statement : ( dec | if_ | while_ | for_loop | func_def | func_call );
	public final void statement() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:18:12: ( dec | if_ | while_ | for_loop | func_def | func_call )
			int alt4=6;
			switch ( input.LA(1) ) {
			case Int_type:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==ID) ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10==23||(LA4_10 >= 27 && LA4_10 <= 28)) ) {
						alt4=1;
					}
					else if ( (LA4_10==19) ) {
						alt4=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Double_type:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==ID) ) {
					int LA4_11 = input.LA(3);
					if ( (LA4_11==23||(LA4_11 >= 27 && LA4_11 <= 28)) ) {
						alt4=1;
					}
					else if ( (LA4_11==19) ) {
						alt4=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 30:
				{
				alt4=1;
				}
				break;
			case 29:
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4==ID) ) {
					int LA4_12 = input.LA(3);
					if ( (LA4_12==28) ) {
						alt4=1;
					}
					else if ( (LA4_12==19) ) {
						alt4=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 33:
				{
				alt4=2;
				}
				break;
			case 39:
				{
				alt4=3;
				}
				break;
			case 32:
				{
				alt4=4;
				}
				break;
			case 36:
			case 37:
			case 38:
				{
				alt4=5;
				}
				break;
			case ID:
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:18:14: dec
					{
					pushFollow(FOLLOW_dec_in_statement118);
					dec();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:19:14: if_
					{
					pushFollow(FOLLOW_if__in_statement143);
					if_();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:20:14: while_
					{
					pushFollow(FOLLOW_while__in_statement168);
					while_();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:21:14: for_loop
					{
					pushFollow(FOLLOW_for_loop_in_statement190);
					for_loop();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:22:14: func_def
					{
					pushFollow(FOLLOW_func_def_in_statement210);
					func_def();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:23:14: func_call
					{
					pushFollow(FOLLOW_func_call_in_statement230);
					func_call();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "dec"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:28:1: dec : ( dec1 | dec2 | dec3 | dec4 | sOUT | string_dec );
	public final void dec() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:28:12: ( dec1 | dec2 | dec3 | dec4 | sOUT | string_dec )
			int alt5=6;
			switch ( input.LA(1) ) {
			case Int_type:
				{
				int LA5_1 = input.LA(2);
				if ( (LA5_1==ID) ) {
					int LA5_5 = input.LA(3);
					if ( (LA5_5==28) ) {
						int LA5_7 = input.LA(4);
						if ( (LA5_7==INT) ) {
							alt5=1;
						}
						else if ( (LA5_7==ID) ) {
							alt5=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA5_5==23||LA5_5==27) ) {
						alt5=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Double_type:
				{
				int LA5_2 = input.LA(2);
				if ( (LA5_2==ID) ) {
					int LA5_6 = input.LA(3);
					if ( (LA5_6==28) ) {
						int LA5_9 = input.LA(4);
						if ( (LA5_9==DOUBLE) ) {
							alt5=2;
						}
						else if ( (LA5_9==ID) ) {
							alt5=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA5_6==23||LA5_6==27) ) {
						alt5=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 30:
				{
				alt5=5;
				}
				break;
			case 29:
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:28:14: dec1
					{
					pushFollow(FOLLOW_dec1_in_dec263);
					dec1();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:28:21: dec2
					{
					pushFollow(FOLLOW_dec2_in_dec267);
					dec2();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:28:28: dec3
					{
					pushFollow(FOLLOW_dec3_in_dec271);
					dec3();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:28:35: dec4
					{
					pushFollow(FOLLOW_dec4_in_dec275);
					dec4();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:28:42: sOUT
					{
					pushFollow(FOLLOW_sOUT_in_dec279);
					sOUT();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:28:49: string_dec
					{
					pushFollow(FOLLOW_string_dec_in_dec283);
					string_dec();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dec"



	// $ANTLR start "dec1"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:31:1: dec1 : Int_type ID '=' INT ';' ;
	public final void dec1() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:31:12: ( Int_type ID '=' INT ';' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:31:14: Int_type ID '=' INT ';'
			{
			match(input,Int_type,FOLLOW_Int_type_in_dec1299); 
			match(input,ID,FOLLOW_ID_in_dec1301); 
			match(input,28,FOLLOW_28_in_dec1303); 
			match(input,INT,FOLLOW_INT_in_dec1305); 
			match(input,27,FOLLOW_27_in_dec1307); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dec1"



	// $ANTLR start "dec2"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:34:1: dec2 : Double_type ID '=' DOUBLE ';' ;
	public final void dec2() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:34:12: ( Double_type ID '=' DOUBLE ';' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:34:14: Double_type ID '=' DOUBLE ';'
			{
			match(input,Double_type,FOLLOW_Double_type_in_dec2323); 
			match(input,ID,FOLLOW_ID_in_dec2325); 
			match(input,28,FOLLOW_28_in_dec2327); 
			match(input,DOUBLE,FOLLOW_DOUBLE_in_dec2329); 
			match(input,27,FOLLOW_27_in_dec2331); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dec2"



	// $ANTLR start "dec3"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:37:1: dec3 : ( Int_type | Double_type ) ID ( ',' ID )* ';' ;
	public final void dec3() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:37:12: ( ( Int_type | Double_type ) ID ( ',' ID )* ';' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:37:14: ( Int_type | Double_type ) ID ( ',' ID )* ';'
			{
			if ( input.LA(1)==Double_type||input.LA(1)==Int_type ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,ID,FOLLOW_ID_in_dec3355); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:37:42: ( ',' ID )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==23) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:37:43: ',' ID
					{
					match(input,23,FOLLOW_23_in_dec3358); 
					match(input,ID,FOLLOW_ID_in_dec3360); 
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,27,FOLLOW_27_in_dec3364); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dec3"



	// $ANTLR start "dec4"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:40:1: dec4 : ( Int_type | Double_type ) ID '=' ID ( ( '+' | '-' | '*' | '/' ) ID )* ';' ;
	public final void dec4() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:40:12: ( ( Int_type | Double_type ) ID '=' ID ( ( '+' | '-' | '*' | '/' ) ID )* ';' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:40:14: ( Int_type | Double_type ) ID '=' ID ( ( '+' | '-' | '*' | '/' ) ID )* ';'
			{
			if ( input.LA(1)==Double_type||input.LA(1)==Int_type ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,ID,FOLLOW_ID_in_dec4388); 
			match(input,28,FOLLOW_28_in_dec4390); 
			match(input,ID,FOLLOW_ID_in_dec4392); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:40:49: ( ( '+' | '-' | '*' | '/' ) ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 21 && LA7_0 <= 22)||LA7_0==24||LA7_0==26) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:40:50: ( '+' | '-' | '*' | '/' ) ID
					{
					if ( (input.LA(1) >= 21 && input.LA(1) <= 22)||input.LA(1)==24||input.LA(1)==26 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,ID,FOLLOW_ID_in_dec4411); 
					}
					break;

				default :
					break loop7;
				}
			}

			match(input,27,FOLLOW_27_in_dec4415); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dec4"



	// $ANTLR start "if_"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:45:1: if_ : 'if' '(' c= logical_cond ')' '{' ( statement )* '}' ( else_ )? ;
	public final void if_() throws RecognitionException {
		boolean c =false;

		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:46:5: ( 'if' '(' c= logical_cond ')' '{' ( statement )* '}' ( else_ )? )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:46:7: 'if' '(' c= logical_cond ')' '{' ( statement )* '}' ( else_ )?
			{
			match(input,33,FOLLOW_33_in_if_431); 
			match(input,19,FOLLOW_19_in_if_433); 
			pushFollow(FOLLOW_logical_cond_in_if_437);
			c=logical_cond();
			state._fsp--;

			match(input,20,FOLLOW_20_in_if_439); 
			match(input,40,FOLLOW_40_in_if_441); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:46:39: ( statement )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= Double_type && LA8_0 <= ID)||LA8_0==Int_type||(LA8_0 >= 29 && LA8_0 <= 30)||(LA8_0 >= 32 && LA8_0 <= 33)||(LA8_0 >= 36 && LA8_0 <= 39)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:46:39: statement
					{
					pushFollow(FOLLOW_statement_in_if_443);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			match(input,41,FOLLOW_41_in_if_446); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:46:54: ( else_ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==31) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:46:55: else_
					{
					pushFollow(FOLLOW_else__in_if_449);
					else_();
					state._fsp--;

					}
					break;

			}


			          if (c){
			       		System.out.println("a7a");
			       	  }else{
			          	System.out.println("7ankresha");
			          }
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_"



	// $ANTLR start "else_"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:57:1: else_ : 'else' '{' ( statement )* '}' ;
	public final void else_() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:57:12: ( 'else' '{' ( statement )* '}' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:57:14: 'else' '{' ( statement )* '}'
			{
			match(input,31,FOLLOW_31_in_else_478); 
			match(input,40,FOLLOW_40_in_else_480); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:57:25: ( statement )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= Double_type && LA10_0 <= ID)||LA10_0==Int_type||(LA10_0 >= 29 && LA10_0 <= 30)||(LA10_0 >= 32 && LA10_0 <= 33)||(LA10_0 >= 36 && LA10_0 <= 39)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:57:25: statement
					{
					pushFollow(FOLLOW_statement_in_else_482);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			match(input,41,FOLLOW_41_in_else_485); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "else_"



	// $ANTLR start "while_"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:60:1: while_ : 'while' '(' logical_cond ')' '{' ( statement )* '}' ;
	public final void while_() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:60:12: ( 'while' '(' logical_cond ')' '{' ( statement )* '}' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:60:14: 'while' '(' logical_cond ')' '{' ( statement )* '}'
			{
			match(input,39,FOLLOW_39_in_while_499); 
			match(input,19,FOLLOW_19_in_while_501); 
			pushFollow(FOLLOW_logical_cond_in_while_503);
			logical_cond();
			state._fsp--;

			match(input,20,FOLLOW_20_in_while_505); 
			match(input,40,FOLLOW_40_in_while_507); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:60:47: ( statement )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= Double_type && LA11_0 <= ID)||LA11_0==Int_type||(LA11_0 >= 29 && LA11_0 <= 30)||(LA11_0 >= 32 && LA11_0 <= 33)||(LA11_0 >= 36 && LA11_0 <= 39)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:60:47: statement
					{
					pushFollow(FOLLOW_statement_in_while_509);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			match(input,41,FOLLOW_41_in_while_512); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_"



	// $ANTLR start "for_loop"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:63:1: for_loop : 'for' '(' init ';' cond ';' step ')' '{' ( statement )* '}' ;
	public final void for_loop() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:63:12: ( 'for' '(' init ';' cond ';' step ')' '{' ( statement )* '}' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:63:14: 'for' '(' init ';' cond ';' step ')' '{' ( statement )* '}'
			{
			match(input,32,FOLLOW_32_in_for_loop524); 
			match(input,19,FOLLOW_19_in_for_loop526); 
			pushFollow(FOLLOW_init_in_for_loop528);
			init();
			state._fsp--;

			match(input,27,FOLLOW_27_in_for_loop530); 
			pushFollow(FOLLOW_cond_in_for_loop532);
			cond();
			state._fsp--;

			match(input,27,FOLLOW_27_in_for_loop534); 
			pushFollow(FOLLOW_step_in_for_loop536);
			step();
			state._fsp--;

			match(input,20,FOLLOW_20_in_for_loop538); 
			match(input,40,FOLLOW_40_in_for_loop540); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:63:55: ( statement )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= Double_type && LA12_0 <= ID)||LA12_0==Int_type||(LA12_0 >= 29 && LA12_0 <= 30)||(LA12_0 >= 32 && LA12_0 <= 33)||(LA12_0 >= 36 && LA12_0 <= 39)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:63:55: statement
					{
					pushFollow(FOLLOW_statement_in_for_loop542);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			match(input,41,FOLLOW_41_in_for_loop545); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_loop"



	// $ANTLR start "init"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:66:1: init : Int_type ID '=' INT ;
	public final void init() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:66:12: ( Int_type ID '=' INT )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:66:14: Int_type ID '=' INT
			{
			match(input,Int_type,FOLLOW_Int_type_in_init561); 
			match(input,ID,FOLLOW_ID_in_init563); 
			match(input,28,FOLLOW_28_in_init565); 
			match(input,INT,FOLLOW_INT_in_init567); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "init"



	// $ANTLR start "step"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:69:1: step : ( ID '=' expr | ID INC | ID DEC );
	public final void step() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:69:12: ( ID '=' expr | ID INC | ID DEC )
			int alt13=3;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				switch ( input.LA(2) ) {
				case 28:
					{
					alt13=1;
					}
					break;
				case INC:
					{
					alt13=2;
					}
					break;
				case DEC:
					{
					alt13=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:69:14: ID '=' expr
					{
					match(input,ID,FOLLOW_ID_in_step583); 
					match(input,28,FOLLOW_28_in_step585); 
					pushFollow(FOLLOW_expr_in_step587);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:69:28: ID INC
					{
					match(input,ID,FOLLOW_ID_in_step591); 
					match(input,INC,FOLLOW_INC_in_step593); 
					}
					break;
				case 3 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:69:37: ID DEC
					{
					match(input,ID,FOLLOW_ID_in_step597); 
					match(input,DEC,FOLLOW_DEC_in_step599); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "step"



	// $ANTLR start "cond"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:71:1: cond returns [boolean value] : a= ( ID | INT | DOUBLE ) op= BOPR b= ( ID | INT | DOUBLE ) ;
	public final boolean cond() throws RecognitionException {
		boolean value = false;


		Token a=null;
		Token op=null;
		Token b=null;

		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:72:5: (a= ( ID | INT | DOUBLE ) op= BOPR b= ( ID | INT | DOUBLE ) )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:72:7: a= ( ID | INT | DOUBLE ) op= BOPR b= ( ID | INT | DOUBLE )
			{
			a=input.LT(1);
			if ( input.LA(1)==DOUBLE||input.LA(1)==ID||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			op=(Token)match(input,BOPR,FOLLOW_BOPR_in_cond632); 
			b=input.LT(1);
			if ( input.LA(1)==DOUBLE||input.LA(1)==ID||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			          double left = Double.parseDouble((a!=null?a.getText():null));
			          double right = Double.parseDouble((b!=null?b.getText():null));

			          if      ((op!=null?op.getText():null).equals("<=")) value = left <= right;
			          else if ((op!=null?op.getText():null).equals(">=")) value = left >= right;
			          else if ((op!=null?op.getText():null).equals("==")) value = left == right;
			          else if ((op!=null?op.getText():null).equals("!=")) value = left != right;
			          else if ((op!=null?op.getText():null).equals("<"))  value = left < right;
			          else if ((op!=null?op.getText():null).equals(">"))  value = left > right;
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "cond"



	// $ANTLR start "logical_cond"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:86:1: logical_cond returns [boolean value] : c1= cond (op= ( AND | OR | XOR ) c2= cond )* ;
	public final boolean logical_cond() throws RecognitionException {
		boolean value = false;


		Token op=null;
		boolean c1 =false;
		boolean c2 =false;

		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:87:5: (c1= cond (op= ( AND | OR | XOR ) c2= cond )* )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:87:7: c1= cond (op= ( AND | OR | XOR ) c2= cond )*
			{
			pushFollow(FOLLOW_cond_in_logical_cond681);
			c1=cond();
			state._fsp--;


			          value = c1;
			      
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:91:7: (op= ( AND | OR | XOR ) c2= cond )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==AND||LA14_0==OR||LA14_0==XOR) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:92:11: op= ( AND | OR | XOR ) c2= cond
					{
					op=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR||input.LA(1)==XOR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_cond_in_logical_cond725);
					c2=cond();
					state._fsp--;


					              if ((op!=null?op.getText():null).equals("&&"))
					                  value = value && c2;
					              else if ((op!=null?op.getText():null).equals("||"))
					                  value = value || c2;
					              else if ((op!=null?op.getText():null).equals("^"))
					                  value = value ^ c2;
					          
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "logical_cond"



	// $ANTLR start "expr"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:108:1: expr : term ( ( '+' | '-' ) term )* ;
	public final void expr() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:108:12: ( term ( ( '+' | '-' ) term )* )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:108:14: term ( ( '+' | '-' ) term )*
			{
			pushFollow(FOLLOW_term_in_expr769);
			term();
			state._fsp--;

			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:108:19: ( ( '+' | '-' ) term )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==22||LA15_0==24) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:108:20: ( '+' | '-' ) term
					{
					if ( input.LA(1)==22||input.LA(1)==24 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_expr780);
					term();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "term"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:111:1: term : factor ( ( '*' | '/' ) factor )* ;
	public final void term() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:111:12: ( factor ( ( '*' | '/' ) factor )* )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:111:14: factor ( ( '*' | '/' ) factor )*
			{
			pushFollow(FOLLOW_factor_in_term798);
			factor();
			state._fsp--;

			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:111:21: ( ( '*' | '/' ) factor )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==21||LA16_0==26) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:111:22: ( '*' | '/' ) factor
					{
					if ( input.LA(1)==21||input.LA(1)==26 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_term809);
					factor();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:114:1: factor : ( ID | INT | DOUBLE | '(' expr ')' );
	public final void factor() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:114:12: ( ID | INT | DOUBLE | '(' expr ')' )
			int alt17=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt17=1;
				}
				break;
			case INT:
				{
				alt17=2;
				}
				break;
			case DOUBLE:
				{
				alt17=3;
				}
				break;
			case 19:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:114:14: ID
					{
					match(input,ID,FOLLOW_ID_in_factor825); 
					}
					break;
				case 2 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:114:19: INT
					{
					match(input,INT,FOLLOW_INT_in_factor829); 
					}
					break;
				case 3 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:114:25: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_factor833); 
					}
					break;
				case 4 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:114:34: '(' expr ')'
					{
					match(input,19,FOLLOW_19_in_factor837); 
					pushFollow(FOLLOW_expr_in_factor839);
					expr();
					state._fsp--;

					match(input,20,FOLLOW_20_in_factor841); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "factor"



	// $ANTLR start "func_def"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:119:1: func_def : ( iden )? func_type ID '(' ( param_list )? ')' '{' ( statement )* '}' ;
	public final void func_def() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:119:12: ( ( iden )? func_type ID '(' ( param_list )? ')' '{' ( statement )* '}' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:119:14: ( iden )? func_type ID '(' ( param_list )? ')' '{' ( statement )* '}'
			{
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:119:14: ( iden )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( ((LA18_0 >= 36 && LA18_0 <= 37)) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:119:14: iden
					{
					pushFollow(FOLLOW_iden_in_func_def855);
					iden();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_func_type_in_func_def858);
			func_type();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_func_def860); 
			match(input,19,FOLLOW_19_in_func_def862); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:119:37: ( param_list )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==Double_type||LA19_0==Int_type||LA19_0==29||LA19_0==38) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:119:37: param_list
					{
					pushFollow(FOLLOW_param_list_in_func_def864);
					param_list();
					state._fsp--;

					}
					break;

			}

			match(input,20,FOLLOW_20_in_func_def867); 
			match(input,40,FOLLOW_40_in_func_def869); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:119:57: ( statement )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= Double_type && LA20_0 <= ID)||LA20_0==Int_type||(LA20_0 >= 29 && LA20_0 <= 30)||(LA20_0 >= 32 && LA20_0 <= 33)||(LA20_0 >= 36 && LA20_0 <= 39)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:119:57: statement
					{
					pushFollow(FOLLOW_statement_in_func_def871);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			match(input,41,FOLLOW_41_in_func_def874); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "func_def"



	// $ANTLR start "func_type"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:122:1: func_type : ( 'int' | 'double' | 'void' | 'String' );
	public final void func_type() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:122:12: ( 'int' | 'double' | 'void' | 'String' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:
			{
			if ( input.LA(1)==Double_type||input.LA(1)==Int_type||input.LA(1)==29||input.LA(1)==38 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "func_type"



	// $ANTLR start "iden"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:123:1: iden : ( 'private' | 'public' );
	public final void iden() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:123:7: ( 'private' | 'public' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:
			{
			if ( (input.LA(1) >= 36 && input.LA(1) <= 37) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "iden"



	// $ANTLR start "param_list"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:125:1: param_list : func_type ID ( ',' func_type ID )* ;
	public final void param_list() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:125:12: ( func_type ID ( ',' func_type ID )* )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:125:14: func_type ID ( ',' func_type ID )*
			{
			pushFollow(FOLLOW_func_type_in_param_list917);
			func_type();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_param_list919); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:125:27: ( ',' func_type ID )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==23) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:125:28: ',' func_type ID
					{
					match(input,23,FOLLOW_23_in_param_list922); 
					pushFollow(FOLLOW_func_type_in_param_list924);
					func_type();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_param_list926); 
					}
					break;

				default :
					break loop21;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param_list"



	// $ANTLR start "func_call"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:128:1: func_call : ID '(' ( arg_list )? ')' ';' ;
	public final void func_call() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:128:11: ( ID '(' ( arg_list )? ')' ';' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:128:13: ID '(' ( arg_list )? ')' ';'
			{
			match(input,ID,FOLLOW_ID_in_func_call938); 
			match(input,19,FOLLOW_19_in_func_call940); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:128:20: ( arg_list )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==DOUBLE||LA22_0==ID||LA22_0==INT||LA22_0==19) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:128:20: arg_list
					{
					pushFollow(FOLLOW_arg_list_in_func_call942);
					arg_list();
					state._fsp--;

					}
					break;

			}

			match(input,20,FOLLOW_20_in_func_call945); 
			match(input,27,FOLLOW_27_in_func_call947); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "func_call"



	// $ANTLR start "arg_list"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:131:1: arg_list : expr ( ',' expr )* ;
	public final void arg_list() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:131:12: ( expr ( ',' expr )* )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:131:14: expr ( ',' expr )*
			{
			pushFollow(FOLLOW_expr_in_arg_list959);
			expr();
			state._fsp--;

			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:131:19: ( ',' expr )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==23) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:131:20: ',' expr
					{
					match(input,23,FOLLOW_23_in_arg_list962); 
					pushFollow(FOLLOW_expr_in_arg_list964);
					expr();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arg_list"



	// $ANTLR start "string_dec"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:136:1: string_dec : 'String' ID '=' STRING ( '+' STRING )* ';' ;
	public final void string_dec() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:136:12: ( 'String' ID '=' STRING ( '+' STRING )* ';' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:136:14: 'String' ID '=' STRING ( '+' STRING )* ';'
			{
			match(input,29,FOLLOW_29_in_string_dec978); 
			match(input,ID,FOLLOW_ID_in_string_dec980); 
			match(input,28,FOLLOW_28_in_string_dec982); 
			match(input,STRING,FOLLOW_STRING_in_string_dec984); 
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:136:37: ( '+' STRING )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==22) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:136:38: '+' STRING
					{
					match(input,22,FOLLOW_22_in_string_dec987); 
					match(input,STRING,FOLLOW_STRING_in_string_dec989); 
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,27,FOLLOW_27_in_string_dec993); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "string_dec"



	// $ANTLR start "sOUT"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:139:1: sOUT : 'System' '.' 'out' '.' 'print' '(' STRING ')' ';' ;
	public final void sOUT() throws RecognitionException {
		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:139:12: ( 'System' '.' 'out' '.' 'print' '(' STRING ')' ';' )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\project.g:139:14: 'System' '.' 'out' '.' 'print' '(' STRING ')' ';'
			{
			match(input,30,FOLLOW_30_in_sOUT1009); 
			match(input,25,FOLLOW_25_in_sOUT1011); 
			match(input,34,FOLLOW_34_in_sOUT1013); 
			match(input,25,FOLLOW_25_in_sOUT1015); 
			match(input,35,FOLLOW_35_in_sOUT1017); 
			match(input,19,FOLLOW_19_in_sOUT1019); 
			match(input,STRING,FOLLOW_STRING_in_sOUT1021); 
			match(input,20,FOLLOW_20_in_sOUT1023); 
			match(input,27,FOLLOW_27_in_sOUT1025); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sOUT"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program13 = new BitSet(new long[]{0x000000F360001302L});
	public static final BitSet FOLLOW_quiz_in_program19 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_quiz38 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_22_in_quiz64 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_quiz68 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_24_in_quiz80 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_quiz84 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_dec_in_statement118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_statement143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_statement168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_loop_in_statement190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_def_in_statement210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_call_in_statement230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dec1_in_dec263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dec2_in_dec267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dec3_in_dec271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dec4_in_dec275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sOUT_in_dec279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_dec_in_dec283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_type_in_dec1299 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_dec1301 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_dec1303 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_dec1305 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_dec1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Double_type_in_dec2323 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_dec2325 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_dec2327 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DOUBLE_in_dec2329 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_dec2331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_dec3347 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_dec3355 = new BitSet(new long[]{0x0000000008800000L});
	public static final BitSet FOLLOW_23_in_dec3358 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_dec3360 = new BitSet(new long[]{0x0000000008800000L});
	public static final BitSet FOLLOW_27_in_dec3364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_dec4380 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_dec4388 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_dec4390 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_dec4392 = new BitSet(new long[]{0x000000000D600000L});
	public static final BitSet FOLLOW_set_in_dec4395 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_dec4411 = new BitSet(new long[]{0x000000000D600000L});
	public static final BitSet FOLLOW_27_in_dec4415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_if_431 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_if_433 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_logical_cond_in_if_437 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_if_439 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_if_441 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_statement_in_if_443 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_41_in_if_446 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_else__in_if_449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_else_478 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_else_480 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_statement_in_else_482 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_41_in_else_485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_while_499 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_while_501 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_logical_cond_in_while_503 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_while_505 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_while_507 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_statement_in_while_509 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_41_in_while_512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_for_loop524 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_for_loop526 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_init_in_for_loop528 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_for_loop530 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_cond_in_for_loop532 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_for_loop534 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_step_in_for_loop536 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_for_loop538 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_for_loop540 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_statement_in_for_loop542 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_41_in_for_loop545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_type_in_init561 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_init563 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_init565 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_init567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_step583 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_step585 = new BitSet(new long[]{0x0000000000080A80L});
	public static final BitSet FOLLOW_expr_in_step587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_step591 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INC_in_step593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_step597 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_DEC_in_step599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_cond618 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BOPR_in_cond632 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_set_in_cond636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cond_in_logical_cond681 = new BitSet(new long[]{0x0000000000048012L});
	public static final BitSet FOLLOW_set_in_logical_cond711 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_cond_in_logical_cond725 = new BitSet(new long[]{0x0000000000048012L});
	public static final BitSet FOLLOW_term_in_expr769 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_set_in_expr772 = new BitSet(new long[]{0x0000000000080A80L});
	public static final BitSet FOLLOW_term_in_expr780 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_factor_in_term798 = new BitSet(new long[]{0x0000000004200002L});
	public static final BitSet FOLLOW_set_in_term801 = new BitSet(new long[]{0x0000000000080A80L});
	public static final BitSet FOLLOW_factor_in_term809 = new BitSet(new long[]{0x0000000004200002L});
	public static final BitSet FOLLOW_ID_in_factor825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_factor829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_factor833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_factor837 = new BitSet(new long[]{0x0000000000080A80L});
	public static final BitSet FOLLOW_expr_in_factor839 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_factor841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iden_in_func_def855 = new BitSet(new long[]{0x0000004020001100L});
	public static final BitSet FOLLOW_func_type_in_func_def858 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_func_def860 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_func_def862 = new BitSet(new long[]{0x0000004020101100L});
	public static final BitSet FOLLOW_param_list_in_func_def864 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_func_def867 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_func_def869 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_statement_in_func_def871 = new BitSet(new long[]{0x000002F360001300L});
	public static final BitSet FOLLOW_41_in_func_def874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_type_in_param_list917 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_param_list919 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_param_list922 = new BitSet(new long[]{0x0000004020001100L});
	public static final BitSet FOLLOW_func_type_in_param_list924 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_param_list926 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_ID_in_func_call938 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_func_call940 = new BitSet(new long[]{0x0000000000180A80L});
	public static final BitSet FOLLOW_arg_list_in_func_call942 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_func_call945 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_func_call947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_arg_list959 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_arg_list962 = new BitSet(new long[]{0x0000000000080A80L});
	public static final BitSet FOLLOW_expr_in_arg_list964 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_29_in_string_dec978 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_string_dec980 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_string_dec982 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_string_dec984 = new BitSet(new long[]{0x0000000008400000L});
	public static final BitSet FOLLOW_22_in_string_dec987 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_string_dec989 = new BitSet(new long[]{0x0000000008400000L});
	public static final BitSet FOLLOW_27_in_string_dec993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_sOUT1009 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_sOUT1011 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_sOUT1013 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_sOUT1015 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_sOUT1017 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_sOUT1019 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_sOUT1021 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_sOUT1023 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_sOUT1025 = new BitSet(new long[]{0x0000000000000002L});
}
