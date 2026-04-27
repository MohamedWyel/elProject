// $ANTLR null D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g 2026-04-27 21:06:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class reParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "ID", "INT", "PRINT", 
		"PROG", "WS", "';'", "'='", "'print'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public reParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public reParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return reParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:6:1: prog : ( stmt )* EOF -> ^( PROG ( stmt )* ) ;
	public final reParser.prog_return prog() throws RecognitionException {
		reParser.prog_return retval = new reParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope stmt1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");

		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:7:5: ( ( stmt )* EOF -> ^( PROG ( stmt )* ) )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:7:7: ( stmt )* EOF
			{
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:7:7: ( stmt )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==12) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:7:7: stmt
					{
					pushFollow(FOLLOW_stmt_in_prog27);
					stmt1=stmt();
					state._fsp--;

					stream_stmt.add(stmt1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog30);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: stmt
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 7:17: -> ^( PROG ( stmt )* )
			{
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:7:20: ^( PROG ( stmt )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROG, "PROG"), root_1);
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:7:27: ( stmt )*
				while ( stream_stmt.hasNext() ) {
					adaptor.addChild(root_1, stream_stmt.nextTree());
				}
				stream_stmt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stmt"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:10:1: stmt : ( assign | printStmt );
	public final reParser.stmt_return stmt() throws RecognitionException {
		reParser.stmt_return retval = new reParser.stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assign3 =null;
		ParserRuleReturnScope printStmt4 =null;


		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:11:5: ( assign | printStmt )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID) ) {
				alt2=1;
			}
			else if ( (LA2_0==12) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:11:7: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_stmt56);
					assign3=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign3.getTree());

					}
					break;
				case 2 :
					// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:12:7: printStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_printStmt_in_stmt64);
					printStmt4=printStmt();
					state._fsp--;

					adaptor.addChild(root_0, printStmt4.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmt"


	public static class assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:15:1: assign : ID '=' INT ';' -> ^( ASSIGN ID INT ) ;
	public final reParser.assign_return assign() throws RecognitionException {
		reParser.assign_return retval = new reParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID5=null;
		Token char_literal6=null;
		Token INT7=null;
		Token char_literal8=null;

		Object ID5_tree=null;
		Object char_literal6_tree=null;
		Object INT7_tree=null;
		Object char_literal8_tree=null;
		RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");

		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:16:5: ( ID '=' INT ';' -> ^( ASSIGN ID INT ) )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:16:7: ID '=' INT ';'
			{
			ID5=(Token)match(input,ID,FOLLOW_ID_in_assign81);  
			stream_ID.add(ID5);

			char_literal6=(Token)match(input,11,FOLLOW_11_in_assign83);  
			stream_11.add(char_literal6);

			INT7=(Token)match(input,INT,FOLLOW_INT_in_assign85);  
			stream_INT.add(INT7);

			char_literal8=(Token)match(input,10,FOLLOW_10_in_assign87);  
			stream_10.add(char_literal8);

			// AST REWRITE
			// elements: INT, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 16:22: -> ^( ASSIGN ID INT )
			{
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:16:25: ^( ASSIGN ID INT )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_INT.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign"


	public static class printStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "printStmt"
	// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:19:1: printStmt : 'print' ID ';' -> ^( PRINT ID ) ;
	public final reParser.printStmt_return printStmt() throws RecognitionException {
		reParser.printStmt_return retval = new reParser.printStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal9=null;
		Token ID10=null;
		Token char_literal11=null;

		Object string_literal9_tree=null;
		Object ID10_tree=null;
		Object char_literal11_tree=null;
		RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");

		try {
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:20:5: ( 'print' ID ';' -> ^( PRINT ID ) )
			// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:20:7: 'print' ID ';'
			{
			string_literal9=(Token)match(input,12,FOLLOW_12_in_printStmt114);  
			stream_12.add(string_literal9);

			ID10=(Token)match(input,ID,FOLLOW_ID_in_printStmt116);  
			stream_ID.add(ID10);

			char_literal11=(Token)match(input,10,FOLLOW_10_in_printStmt118);  
			stream_10.add(char_literal11);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 20:22: -> ^( PRINT ID )
			{
				// D:\\university\\term 8\\407\\lab\\el project\\src\\grammer\\re.g:20:25: ^( PRINT ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRINT, "PRINT"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "printStmt"

	// Delegated rules



	public static final BitSet FOLLOW_stmt_in_prog27 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_EOF_in_prog30 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_stmt56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStmt_in_stmt64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign81 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_assign83 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_assign85 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_assign87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_printStmt114 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_printStmt116 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_printStmt118 = new BitSet(new long[]{0x0000000000000002L});
}
