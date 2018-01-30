package query;

// $ANTLR 3.4 C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g 2017-03-29 00:45:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLanguageLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int AS=5;
    public static final int AST_CHILD=6;
    public static final int ATTRIBUTE=7;
    public static final int ATTRIBUTES=8;
    public static final int BIN_OP=9;
    public static final int BLOCK_STATEMENTS=10;
    public static final int BOOL_EXP=11;
    public static final int CALLQUERY=12;
    public static final int CHAIN_ID=13;
    public static final int COLON=14;
    public static final int COMMA=15;
    public static final int COMPOUND_ADD=16;
    public static final int COMP_ADD=17;
    public static final int CONTAINS=18;
    public static final int COUNT=19;
    public static final int DEPTH=20;
    public static final int DIRECTLY=21;
    public static final int DIVIDE=22;
    public static final int DQOUTE=23;
    public static final int ELSE=24;
    public static final int ELSE_BLOCK=25;
    public static final int EPSILON=26;
    public static final int EQUALS=27;
    public static final int ESC_SEQ=28;
    public static final int EXPONENT=29;
    public static final int FILTER=30;
    public static final int FILTER_QUERY=31;
    public static final int FLOAT=32;
    public static final int FOR_QUERY=33;
    public static final int FUNCTION=34;
    public static final int GT=35;
    public static final int GTE=36;
    public static final int HAS=37;
    public static final int HEX_DIGIT=38;
    public static final int ID=39;
    public static final int IF=40;
    public static final int IF_STATEMENT=41;
    public static final int IN=42;
    public static final int INCR=43;
    public static final int INCREMENT=44;
    public static final int INMOST=45;
    public static final int INTEGER=46;
    public static final int IN_CLAUSE=47;
    public static final int IS=48;
    public static final int ISNODETYPE=49;
    public static final int ISPARENT=50;
    public static final int LEFT_BRACKET=51;
    public static final int LEFT_PAREN=52;
    public static final int LEFT_SQ_BRACKET=53;
    public static final int LIMITATION=54;
    public static final int LIMITATION_CLAUSE=55;
    public static final int LINENUMBER=56;
    public static final int LINE_COMMENT=57;
    public static final int LOGIC_EQUALS=58;
    public static final int LOGIC_OP=59;
    public static final int LT=60;
    public static final int LTE=61;
    public static final int MAX=62;
    public static final int METHODBINDING=63;
    public static final int MIN=64;
    public static final int MINUS=65;
    public static final int NESTED=66;
    public static final int NODE=67;
    public static final int NODETYPE=68;
    public static final int NODE_CHAIN=69;
    public static final int NODE_CHAIN_OP=70;
    public static final int NODE_NAME=71;
    public static final int NODE_TYPE=72;
    public static final int NOT=73;
    public static final int NOT_EQUAL=74;
    public static final int OCTAL_ESC=75;
    public static final int OR=76;
    public static final int OUTMOST=77;
    public static final int PERIOD=78;
    public static final int PLUS=79;
    public static final int PRINT=80;
    public static final int PROPERTY=81;
    public static final int QUERIES=82;
    public static final int QUERY=83;
    public static final int QUERY_NAME=84;
    public static final int REPEATER=85;
    public static final int RESERVED_TYPES=86;
    public static final int RIGHT_BRACKET=87;
    public static final int RIGHT_PAREN=88;
    public static final int RIGHT_SQ_BRACKET=89;
    public static final int SELECT=90;
    public static final int SELECT_QUERY=91;
    public static final int SEMICOLON=92;
    public static final int SET=93;
    public static final int SET_TABLE=94;
    public static final int SPACE=95;
    public static final int STAR=96;
    public static final int STATEMENT=97;
    public static final int STATEMENTS=98;
    public static final int STRING=99;
    public static final int TABLE=100;
    public static final int UNICODE_ESC=101;
    public static final int VAR=102;
    public static final int VAR_ASSIGN=103;
    public static final int VAR_NAME=104;
    public static final int VAR_STMT=105;
    public static final int WHERE=106;
    public static final int WHERE_BLOCK=107;
    public static final int WHILE=108;
    public static final int WHILE_STATEMENT=109;
    public static final int WITH=110;
    public static final int WITH_CLAUSE=111;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public QueryLanguageLexer() {} 
    public QueryLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QueryLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:286:2: ( 'select' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:286:5: 'select'
            {
            match("select"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:289:2: ( 'where' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:289:4: 'where'
            {
            match("where"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:292:2: ( 'with' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:292:4: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "OUTMOST"
    public final void mOUTMOST() throws RecognitionException {
        try {
            int _type = OUTMOST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:295:2: ( 'outmost' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:295:4: 'outmost'
            {
            match("outmost"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OUTMOST"

    // $ANTLR start "INMOST"
    public final void mINMOST() throws RecognitionException {
        try {
            int _type = INMOST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:298:2: ( 'inmost' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:298:4: 'inmost'
            {
            match("inmost"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INMOST"

    // $ANTLR start "DIRECTLY"
    public final void mDIRECTLY() throws RecognitionException {
        try {
            int _type = DIRECTLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:301:2: ( 'directly' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:301:4: 'directly'
            {
            match("directly"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIRECTLY"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:304:2: ( 'as' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:304:4: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:307:2: ( 'set' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:307:4: 'set'
            {
            match("set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:310:2: ( 'if' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:310:4: 'if'
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
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:313:2: ( 'else' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:313:4: 'else'
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
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:316:2: ( 'while' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:316:4: 'while'
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
    // $ANTLR end "WHILE"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:318:4: ( 'in' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:318:6: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:321:2: ( '*' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:321:4: '*'
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
    // $ANTLR end "STAR"

    // $ANTLR start "REPEATER"
    public final void mREPEATER() throws RecognitionException {
        try {
            int _type = REPEATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:324:2: ( PERIOD PERIOD PERIOD )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:324:4: PERIOD PERIOD PERIOD
            {
            mPERIOD(); 


            mPERIOD(); 


            mPERIOD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPEATER"

    // $ANTLR start "CONTAINS"
    public final void mCONTAINS() throws RecognitionException {
        try {
            int _type = CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:327:2: ( 'contains' | 'directly_contains' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='c') ) {
                alt1=1;
            }
            else if ( (LA1_0=='d') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:327:4: 'contains'
                    {
                    match("contains"); 



                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:328:6: 'directly_contains'
                    {
                    match("directly_contains"); 



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
    // $ANTLR end "CONTAINS"

    // $ANTLR start "ISPARENT"
    public final void mISPARENT() throws RecognitionException {
        try {
            int _type = ISPARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:331:2: ( 'isparent' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:331:4: 'isparent'
            {
            match("isparent"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISPARENT"

    // $ANTLR start "ISNODETYPE"
    public final void mISNODETYPE() throws RecognitionException {
        try {
            int _type = ISNODETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:334:2: ( 'isnodetype' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:334:4: 'isnodetype'
            {
            match("isnodetype"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISNODETYPE"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:336:4: ( 'is' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:336:6: 'is'
            {
            match("is"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "HAS"
    public final void mHAS() throws RecognitionException {
        try {
            int _type = HAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:338:5: ( 'has' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:338:7: 'has'
            {
            match("has"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAS"

    // $ANTLR start "LINENUMBER"
    public final void mLINENUMBER() throws RecognitionException {
        try {
            int _type = LINENUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:340:12: ( 'linenumber' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:340:17: 'linenumber'
            {
            match("linenumber"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINENUMBER"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:342:7: ( 'count(*)' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:342:9: 'count(*)'
            {
            match("count(*)"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:344:5: ( 'max' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:344:7: 'max'
            {
            match("max"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:346:5: ( 'min' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:346:7: 'min'
            {
            match("min"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "DEPTH"
    public final void mDEPTH() throws RecognitionException {
        try {
            int _type = DEPTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:348:7: ( 'depth' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:348:9: 'depth'
            {
            match("depth"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEPTH"

    // $ANTLR start "NODETYPE"
    public final void mNODETYPE() throws RecognitionException {
        try {
            int _type = NODETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:350:10: ( 'nodetype' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:350:13: 'nodetype'
            {
            match("nodetype"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODETYPE"

    // $ANTLR start "METHODBINDING"
    public final void mMETHODBINDING() throws RecognitionException {
        try {
            int _type = METHODBINDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:352:15: ( 'methodbinding' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:352:17: 'methodbinding'
            {
            match("methodbinding"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "METHODBINDING"

    // $ANTLR start "CALLQUERY"
    public final void mCALLQUERY() throws RecognitionException {
        try {
            int _type = CALLQUERY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:354:11: ( 'callquery' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:354:13: 'callquery'
            {
            match("callquery"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CALLQUERY"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:357:2: ( 'print' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:357:4: 'print'
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
    // $ANTLR end "PRINT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:359:7: ( ',' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:359:9: ','
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
    // $ANTLR end "COMMA"

    // $ANTLR start "FILTER"
    public final void mFILTER() throws RecognitionException {
        try {
            int _type = FILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:362:2: ( '->' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:362:4: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FILTER"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:366:2: ( '(' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:366:4: '('
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
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:369:2: ( ')' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:369:4: ')'
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
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:372:2: ( '{' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:372:4: '{'
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
    // $ANTLR end "LEFT_BRACKET"

    // $ANTLR start "RIGHT_BRACKET"
    public final void mRIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:375:2: ( '}' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:375:4: '}'
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
    // $ANTLR end "RIGHT_BRACKET"

    // $ANTLR start "LEFT_SQ_BRACKET"
    public final void mLEFT_SQ_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_SQ_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:378:2: ( '[' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:378:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_SQ_BRACKET"

    // $ANTLR start "RIGHT_SQ_BRACKET"
    public final void mRIGHT_SQ_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_SQ_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:381:2: ( ']' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:381:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_SQ_BRACKET"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:384:2: ( ';' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:384:4: ';'
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
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:387:2: ( ':' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:387:4: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:390:2: ( '.' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:390:5: '.'
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
    // $ANTLR end "PERIOD"

    // $ANTLR start "DQOUTE"
    public final void mDQOUTE() throws RecognitionException {
        try {
            int _type = DQOUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:393:8: ( '\"' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:393:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DQOUTE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:395:5: ( '>' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:395:7: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:397:5: ( '<' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:397:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:399:5: ( LT EQUALS )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:399:7: LT EQUALS
            {
            mLT(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:401:5: ( GT EQUALS )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:401:7: GT EQUALS
            {
            mGT(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:403:5: ( '&&' | 'AND' | 'and' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case '&':
                {
                alt2=1;
                }
                break;
            case 'A':
                {
                alt2=2;
                }
                break;
            case 'a':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:403:7: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:404:4: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:405:4: 'and'
                    {
                    match("and"); 



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
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:407:4: ( '||' | 'OR' | 'or' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case '|':
                {
                alt3=1;
                }
                break;
            case 'O':
                {
                alt3=2;
                }
                break;
            case 'o':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:407:6: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:408:4: 'OR'
                    {
                    match("OR"); 



                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:409:4: 'or'
                    {
                    match("or"); 



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
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:411:5: ( '!' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:411:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:414:2: ( NOT EQUALS )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:414:4: NOT EQUALS
            {
            mNOT(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LOGIC_EQUALS"
    public final void mLOGIC_EQUALS() throws RecognitionException {
        try {
            int _type = LOGIC_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:416:14: ( EQUALS EQUALS )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:416:16: EQUALS EQUALS
            {
            mEQUALS(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGIC_EQUALS"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:419:8: ( '=' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:419:10: '='
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
    // $ANTLR end "EQUALS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:421:6: ( '+' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:421:8: '+'
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
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:423:7: ( '-' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:423:9: '-'
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
    // $ANTLR end "MINUS"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:425:8: ( '/' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:425:10: '/'
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
    // $ANTLR end "DIVIDE"

    // $ANTLR start "COMPOUND_ADD"
    public final void mCOMPOUND_ADD() throws RecognitionException {
        try {
            int _type = COMPOUND_ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:427:14: ( PLUS EQUALS )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:427:16: PLUS EQUALS
            {
            mPLUS(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPOUND_ADD"

    // $ANTLR start "INCREMENT"
    public final void mINCREMENT() throws RecognitionException {
        try {
            int _type = INCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:429:11: ( PLUS PLUS )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:429:13: PLUS PLUS
            {
            mPLUS(); 


            mPLUS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCREMENT"

    // $ANTLR start "NODE_TYPE"
    public final void mNODE_TYPE() throws RecognitionException {
        try {
            int _type = NODE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:434:2: ( 'package_declaration' | 'body_declarations' | 'variable_declaration' | 'import_declaration' | 'type_declaration' | 'field_declaration' | 'method_declaration' | 'interface_declaration' | 'constructor_declaration' | 'class_declaration' | 'variable_declaration_fragment' | 'variable_declaration_statement' | 'thrown_exceptions' | 'try_statement' | 'catch_clause' | 'initializer' | 'method_invocation' | 'if_statement' | 'vexpression' | 'operator' | 'conditional_expression' | 'continue_expression' | 'assignment' | 'this_expression' | 'class_instance_creation' | 'field_access' | 'instance_of_expression' | 'cast_expression' | 'super_field_access' | 'statement' | 'then_statement' | 'else_statement' | 'do_statement' | 'parameters' | 'vbody' | 'for_statement' | 'enhanced_for_statement' | 'switch_statement' | 'while_statement' | 'null_literal' | 'integer_literal' | 'character_literal' | 'string_literal' | 'boolean_literal' | 'variable' | 'file' | 'directory' )
            int alt4=47;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:434:4: 'package_declaration'
                    {
                    match("package_declaration"); 



                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:435:4: 'body_declarations'
                    {
                    match("body_declarations"); 



                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:436:4: 'variable_declaration'
                    {
                    match("variable_declaration"); 



                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:437:4: 'import_declaration'
                    {
                    match("import_declaration"); 



                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:438:4: 'type_declaration'
                    {
                    match("type_declaration"); 



                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:439:4: 'field_declaration'
                    {
                    match("field_declaration"); 



                    }
                    break;
                case 7 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:440:4: 'method_declaration'
                    {
                    match("method_declaration"); 



                    }
                    break;
                case 8 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:441:4: 'interface_declaration'
                    {
                    match("interface_declaration"); 



                    }
                    break;
                case 9 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:442:4: 'constructor_declaration'
                    {
                    match("constructor_declaration"); 



                    }
                    break;
                case 10 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:443:4: 'class_declaration'
                    {
                    match("class_declaration"); 



                    }
                    break;
                case 11 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:444:4: 'variable_declaration_fragment'
                    {
                    match("variable_declaration_fragment"); 



                    }
                    break;
                case 12 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:445:4: 'variable_declaration_statement'
                    {
                    match("variable_declaration_statement"); 



                    }
                    break;
                case 13 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:446:4: 'thrown_exceptions'
                    {
                    match("thrown_exceptions"); 



                    }
                    break;
                case 14 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:447:4: 'try_statement'
                    {
                    match("try_statement"); 



                    }
                    break;
                case 15 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:448:4: 'catch_clause'
                    {
                    match("catch_clause"); 



                    }
                    break;
                case 16 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:449:4: 'initializer'
                    {
                    match("initializer"); 



                    }
                    break;
                case 17 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:450:4: 'method_invocation'
                    {
                    match("method_invocation"); 



                    }
                    break;
                case 18 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:451:4: 'if_statement'
                    {
                    match("if_statement"); 



                    }
                    break;
                case 19 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:452:4: 'vexpression'
                    {
                    match("vexpression"); 



                    }
                    break;
                case 20 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:453:4: 'operator'
                    {
                    match("operator"); 



                    }
                    break;
                case 21 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:454:4: 'conditional_expression'
                    {
                    match("conditional_expression"); 



                    }
                    break;
                case 22 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:455:4: 'continue_expression'
                    {
                    match("continue_expression"); 



                    }
                    break;
                case 23 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:456:4: 'assignment'
                    {
                    match("assignment"); 



                    }
                    break;
                case 24 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:457:4: 'this_expression'
                    {
                    match("this_expression"); 



                    }
                    break;
                case 25 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:458:4: 'class_instance_creation'
                    {
                    match("class_instance_creation"); 



                    }
                    break;
                case 26 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:459:4: 'field_access'
                    {
                    match("field_access"); 



                    }
                    break;
                case 27 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:460:4: 'instance_of_expression'
                    {
                    match("instance_of_expression"); 



                    }
                    break;
                case 28 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:461:4: 'cast_expression'
                    {
                    match("cast_expression"); 



                    }
                    break;
                case 29 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:462:4: 'super_field_access'
                    {
                    match("super_field_access"); 



                    }
                    break;
                case 30 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:463:4: 'statement'
                    {
                    match("statement"); 



                    }
                    break;
                case 31 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:464:4: 'then_statement'
                    {
                    match("then_statement"); 



                    }
                    break;
                case 32 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:465:4: 'else_statement'
                    {
                    match("else_statement"); 



                    }
                    break;
                case 33 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:466:4: 'do_statement'
                    {
                    match("do_statement"); 



                    }
                    break;
                case 34 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:467:4: 'parameters'
                    {
                    match("parameters"); 



                    }
                    break;
                case 35 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:468:4: 'vbody'
                    {
                    match("vbody"); 



                    }
                    break;
                case 36 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:469:4: 'for_statement'
                    {
                    match("for_statement"); 



                    }
                    break;
                case 37 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:470:4: 'enhanced_for_statement'
                    {
                    match("enhanced_for_statement"); 



                    }
                    break;
                case 38 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:471:4: 'switch_statement'
                    {
                    match("switch_statement"); 



                    }
                    break;
                case 39 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:472:4: 'while_statement'
                    {
                    match("while_statement"); 



                    }
                    break;
                case 40 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:473:4: 'null_literal'
                    {
                    match("null_literal"); 



                    }
                    break;
                case 41 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:474:4: 'integer_literal'
                    {
                    match("integer_literal"); 



                    }
                    break;
                case 42 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:475:4: 'character_literal'
                    {
                    match("character_literal"); 



                    }
                    break;
                case 43 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:476:4: 'string_literal'
                    {
                    match("string_literal"); 



                    }
                    break;
                case 44 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:477:4: 'boolean_literal'
                    {
                    match("boolean_literal"); 



                    }
                    break;
                case 45 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:478:4: 'variable'
                    {
                    match("variable"); 



                    }
                    break;
                case 46 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:479:4: 'file'
                    {
                    match("file"); 



                    }
                    break;
                case 47 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:480:4: 'directory'
                    {
                    match("directory"); 



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
    // $ANTLR end "NODE_TYPE"

    // $ANTLR start "ATTRIBUTES"
    public final void mATTRIBUTES() throws RecognitionException {
        try {
            int _type = ATTRIBUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:484:2: ( 'vname' | 'type_old' | 'return_type' | 'parameter_types' | 'is_constructor' | 'is_deprecated' | 'is_parameter' | 'is_field' | 'default_value' | 'modifiers' | 'origin' | 'kind' | 'declared_methods' | 'declared_fields' | 'declared_types' | 'declaring_class' | 'declaring_method' | 'package' | 'interfaces' | 'superclass' | 'boxing' | 'unboxing' | 'parameter_list' | 'modifier' | 'startLine' | 'endLine' | 'totalLines' | 'boolean_value' )
            int alt5=28;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:484:4: 'vname'
                    {
                    match("vname"); 



                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:485:4: 'type_old'
                    {
                    match("type_old"); 



                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:486:4: 'return_type'
                    {
                    match("return_type"); 



                    }
                    break;
                case 4 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:487:4: 'parameter_types'
                    {
                    match("parameter_types"); 



                    }
                    break;
                case 5 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:488:4: 'is_constructor'
                    {
                    match("is_constructor"); 



                    }
                    break;
                case 6 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:489:4: 'is_deprecated'
                    {
                    match("is_deprecated"); 



                    }
                    break;
                case 7 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:490:4: 'is_parameter'
                    {
                    match("is_parameter"); 



                    }
                    break;
                case 8 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:491:4: 'is_field'
                    {
                    match("is_field"); 



                    }
                    break;
                case 9 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:492:4: 'default_value'
                    {
                    match("default_value"); 



                    }
                    break;
                case 10 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:493:4: 'modifiers'
                    {
                    match("modifiers"); 



                    }
                    break;
                case 11 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:494:4: 'origin'
                    {
                    match("origin"); 



                    }
                    break;
                case 12 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:495:4: 'kind'
                    {
                    match("kind"); 



                    }
                    break;
                case 13 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:496:4: 'declared_methods'
                    {
                    match("declared_methods"); 



                    }
                    break;
                case 14 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:497:4: 'declared_fields'
                    {
                    match("declared_fields"); 



                    }
                    break;
                case 15 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:498:4: 'declared_types'
                    {
                    match("declared_types"); 



                    }
                    break;
                case 16 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:499:4: 'declaring_class'
                    {
                    match("declaring_class"); 



                    }
                    break;
                case 17 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:500:4: 'declaring_method'
                    {
                    match("declaring_method"); 



                    }
                    break;
                case 18 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:501:4: 'package'
                    {
                    match("package"); 



                    }
                    break;
                case 19 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:502:4: 'interfaces'
                    {
                    match("interfaces"); 



                    }
                    break;
                case 20 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:503:4: 'superclass'
                    {
                    match("superclass"); 



                    }
                    break;
                case 21 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:504:4: 'boxing'
                    {
                    match("boxing"); 



                    }
                    break;
                case 22 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:505:4: 'unboxing'
                    {
                    match("unboxing"); 



                    }
                    break;
                case 23 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:506:4: 'parameter_list'
                    {
                    match("parameter_list"); 



                    }
                    break;
                case 24 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:507:4: 'modifier'
                    {
                    match("modifier"); 



                    }
                    break;
                case 25 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:508:4: 'startLine'
                    {
                    match("startLine"); 



                    }
                    break;
                case 26 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:509:4: 'endLine'
                    {
                    match("endLine"); 



                    }
                    break;
                case 27 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:510:4: 'totalLines'
                    {
                    match("totalLines"); 



                    }
                    break;
                case 28 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:511:4: 'boolean_value'
                    {
                    match("boolean_value"); 



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
    // $ANTLR end "ATTRIBUTES"

    // $ANTLR start "RESERVED_TYPES"
    public final void mRESERVED_TYPES() throws RecognitionException {
        try {
            int _type = RESERVED_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:514:2: ( 'is_class' | 'is_primitive' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='i') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='s') ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2=='_') ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3=='c') ) {
                            alt6=1;
                        }
                        else if ( (LA6_3=='p') ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:514:4: 'is_class'
                    {
                    match("is_class"); 



                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:515:4: 'is_primitive'
                    {
                    match("is_primitive"); 



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
    // $ANTLR end "RESERVED_TYPES"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:519:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:519:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:519:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
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
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:522:9: ( ( '0' .. '9' )+ )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:522:11: ( '0' .. '9' )+
            {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:522:11: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:525:9: ( '\"' ( . )* '\"' )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:525:11: '\"' ( . )* '\"'
            {
            match('\"'); 

            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:525:15: ( . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\"') ) {
                    alt9=2;
                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:525:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:529:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:529:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:529:9: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    match('.'); 

                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:529:25: ( '0' .. '9' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
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
                    	    break loop11;
                        }
                    } while (true);


                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:529:37: ( EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:529:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:530:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:530:13: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
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
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:530:25: ( EXPONENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:530:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:531:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:531:9: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
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
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    mEXPONENT(); 


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
    // $ANTLR end "FLOAT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:536:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:536:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:536:22: ( '+' | '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='+'||LA17_0=='-') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:536:33: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:539:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:543:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt19=1;
                    }
                    break;
                case 'u':
                    {
                    alt19=2;
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
                    {
                    alt19=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:543:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:544:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:545:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:550:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1 >= '0' && LA20_1 <= '3')) ) {
                    int LA20_2 = input.LA(3);

                    if ( ((LA20_2 >= '0' && LA20_2 <= '7')) ) {
                        int LA20_4 = input.LA(4);

                        if ( ((LA20_4 >= '0' && LA20_4 <= '7')) ) {
                            alt20=1;
                        }
                        else {
                            alt20=2;
                        }
                    }
                    else {
                        alt20=3;
                    }
                }
                else if ( ((LA20_1 >= '4' && LA20_1 <= '7')) ) {
                    int LA20_3 = input.LA(3);

                    if ( ((LA20_3 >= '0' && LA20_3 <= '7')) ) {
                        alt20=2;
                    }
                    else {
                        alt20=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:550:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:551:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:552:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:557:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:557:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:559:8: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:559:10: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:559:10: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= '\t' && LA21_0 <= '\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:561:14: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:562:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); 



            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:563:13: (~ ( '\\n' | '\\r' ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\t')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
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
            	    break loop22;
                }
            } while (true);


            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:564:13: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n') ) {
                alt24=1;
            }
            else if ( (LA24_0=='\r') ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:564:15: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:564:20: '\\r' ( '\\n' )?
                    {
                    match('\r'); 

                    // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:564:24: ( '\\n' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\n') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:564:25: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:8: ( SELECT | WHERE | WITH | OUTMOST | INMOST | DIRECTLY | AS | SET | IF | ELSE | WHILE | IN | STAR | REPEATER | CONTAINS | ISPARENT | ISNODETYPE | IS | HAS | LINENUMBER | COUNT | MAX | MIN | DEPTH | NODETYPE | METHODBINDING | CALLQUERY | PRINT | COMMA | FILTER | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_SQ_BRACKET | RIGHT_SQ_BRACKET | SEMICOLON | COLON | PERIOD | DQOUTE | GT | LT | LTE | GTE | AND | OR | NOT | NOT_EQUAL | LOGIC_EQUALS | EQUALS | PLUS | MINUS | DIVIDE | COMPOUND_ADD | INCREMENT | NODE_TYPE | ATTRIBUTES | RESERVED_TYPES | ID | INTEGER | STRING | FLOAT | SPACE | LINE_COMMENT )
        int alt25=64;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:10: SELECT
                {
                mSELECT(); 


                }
                break;
            case 2 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:17: WHERE
                {
                mWHERE(); 


                }
                break;
            case 3 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:23: WITH
                {
                mWITH(); 


                }
                break;
            case 4 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:28: OUTMOST
                {
                mOUTMOST(); 


                }
                break;
            case 5 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:36: INMOST
                {
                mINMOST(); 


                }
                break;
            case 6 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:43: DIRECTLY
                {
                mDIRECTLY(); 


                }
                break;
            case 7 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:52: AS
                {
                mAS(); 


                }
                break;
            case 8 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:55: SET
                {
                mSET(); 


                }
                break;
            case 9 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:59: IF
                {
                mIF(); 


                }
                break;
            case 10 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:62: ELSE
                {
                mELSE(); 


                }
                break;
            case 11 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:67: WHILE
                {
                mWHILE(); 


                }
                break;
            case 12 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:73: IN
                {
                mIN(); 


                }
                break;
            case 13 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:76: STAR
                {
                mSTAR(); 


                }
                break;
            case 14 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:81: REPEATER
                {
                mREPEATER(); 


                }
                break;
            case 15 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:90: CONTAINS
                {
                mCONTAINS(); 


                }
                break;
            case 16 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:99: ISPARENT
                {
                mISPARENT(); 


                }
                break;
            case 17 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:108: ISNODETYPE
                {
                mISNODETYPE(); 


                }
                break;
            case 18 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:119: IS
                {
                mIS(); 


                }
                break;
            case 19 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:122: HAS
                {
                mHAS(); 


                }
                break;
            case 20 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:126: LINENUMBER
                {
                mLINENUMBER(); 


                }
                break;
            case 21 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:137: COUNT
                {
                mCOUNT(); 


                }
                break;
            case 22 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:143: MAX
                {
                mMAX(); 


                }
                break;
            case 23 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:147: MIN
                {
                mMIN(); 


                }
                break;
            case 24 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:151: DEPTH
                {
                mDEPTH(); 


                }
                break;
            case 25 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:157: NODETYPE
                {
                mNODETYPE(); 


                }
                break;
            case 26 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:166: METHODBINDING
                {
                mMETHODBINDING(); 


                }
                break;
            case 27 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:180: CALLQUERY
                {
                mCALLQUERY(); 


                }
                break;
            case 28 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:190: PRINT
                {
                mPRINT(); 


                }
                break;
            case 29 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:196: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 30 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:202: FILTER
                {
                mFILTER(); 


                }
                break;
            case 31 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:209: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 32 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:220: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 33 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:232: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 


                }
                break;
            case 34 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:245: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 


                }
                break;
            case 35 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:259: LEFT_SQ_BRACKET
                {
                mLEFT_SQ_BRACKET(); 


                }
                break;
            case 36 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:275: RIGHT_SQ_BRACKET
                {
                mRIGHT_SQ_BRACKET(); 


                }
                break;
            case 37 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:292: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 38 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:302: COLON
                {
                mCOLON(); 


                }
                break;
            case 39 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:308: PERIOD
                {
                mPERIOD(); 


                }
                break;
            case 40 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:315: DQOUTE
                {
                mDQOUTE(); 


                }
                break;
            case 41 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:322: GT
                {
                mGT(); 


                }
                break;
            case 42 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:325: LT
                {
                mLT(); 


                }
                break;
            case 43 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:328: LTE
                {
                mLTE(); 


                }
                break;
            case 44 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:332: GTE
                {
                mGTE(); 


                }
                break;
            case 45 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:336: AND
                {
                mAND(); 


                }
                break;
            case 46 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:340: OR
                {
                mOR(); 


                }
                break;
            case 47 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:343: NOT
                {
                mNOT(); 


                }
                break;
            case 48 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:347: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 49 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:357: LOGIC_EQUALS
                {
                mLOGIC_EQUALS(); 


                }
                break;
            case 50 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:370: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 51 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:377: PLUS
                {
                mPLUS(); 


                }
                break;
            case 52 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:382: MINUS
                {
                mMINUS(); 


                }
                break;
            case 53 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:388: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 54 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:395: COMPOUND_ADD
                {
                mCOMPOUND_ADD(); 


                }
                break;
            case 55 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:408: INCREMENT
                {
                mINCREMENT(); 


                }
                break;
            case 56 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:418: NODE_TYPE
                {
                mNODE_TYPE(); 


                }
                break;
            case 57 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:428: ATTRIBUTES
                {
                mATTRIBUTES(); 


                }
                break;
            case 58 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:439: RESERVED_TYPES
                {
                mRESERVED_TYPES(); 


                }
                break;
            case 59 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:454: ID
                {
                mID(); 


                }
                break;
            case 60 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:457: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 61 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:465: STRING
                {
                mSTRING(); 


                }
                break;
            case 62 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:472: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 63 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:478: SPACE
                {
                mSPACE(); 


                }
                break;
            case 64 :
                // C:\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:484: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA4_eotS =
        "\125\uffff\1\131\16\uffff\1\146\4\uffff";
    static final String DFA4_eofS =
        "\151\uffff";
    static final String DFA4_minS =
        "\2\141\1\157\1\141\1\146\1\150\1\151\1\145\1\141\2\uffff\1\164\1"+
        "\154\1\151\2\uffff\1\143\1\144\1\162\3\uffff\1\151\2\uffff\1\145"+
        "\1\uffff\1\145\1\uffff\1\164\1\156\1\141\1\163\2\uffff\1\141\11"+
        "\uffff\1\151\1\145\5\uffff\1\154\1\uffff\1\150\1\144\1\163\4\uffff"+
        "\1\141\1\147\1\144\1\157\3\uffff\1\163\1\142\2\uffff\1\137\1\144"+
        "\1\137\1\154\1\141\1\137\1\144\1\145\2\uffff\1\144\2\uffff\1\137"+
        "\2\uffff\1\144\1\uffff\1\145\1\143\1\154\1\141\1\162\1\141\1\164"+
        "\1\151\1\157\1\156\1\137\1\146\3\uffff";
    static final String DFA4_maxS =
        "\1\167\1\141\1\157\1\145\1\156\1\171\1\157\1\145\1\157\2\uffff\1"+
        "\167\1\156\1\157\2\uffff\1\162\1\157\1\162\3\uffff\1\164\2\uffff"+
        "\1\162\1\uffff\1\154\1\uffff\1\164\1\156\1\141\1\164\2\uffff\1\162"+
        "\11\uffff\1\151\1\145\5\uffff\1\154\1\uffff\1\150\1\164\1\163\4"+
        "\uffff\1\141\1\162\1\144\1\157\3\uffff\1\163\1\142\2\uffff\1\137"+
        "\1\144\1\137\1\154\1\144\1\137\1\151\1\145\2\uffff\1\151\2\uffff"+
        "\1\137\2\uffff\1\144\1\uffff\1\145\1\143\1\154\1\141\1\162\1\141"+
        "\1\164\1\151\1\157\1\156\1\137\1\163\3\uffff";
    static final String DFA4_acceptS =
        "\11\uffff\1\24\1\27\3\uffff\1\47\1\50\3\uffff\1\23\1\43\1\4\1\uffff"+
        "\1\22\1\5\1\uffff\1\16\1\uffff\1\44\4\uffff\1\52\1\35\1\uffff\1"+
        "\46\1\40\1\45\1\41\1\57\1\1\1\42\1\2\1\54\2\uffff\1\20\1\33\1\15"+
        "\1\30\1\37\1\uffff\1\56\3\uffff\1\17\1\34\1\36\1\53\4\uffff\1\11"+
        "\1\25\1\26\2\uffff\1\10\1\51\10\uffff\1\6\1\32\1\uffff\1\12\1\31"+
        "\1\uffff\1\7\1\21\1\uffff\1\55\14\uffff\1\3\1\13\1\14";
    static final String DFA4_specialS =
        "\151\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\12\1\2\1\10\1\15\1\14\1\6\2\uffff\1\4\3\uffff\1\7\1\17\1"+
            "\11\1\1\2\uffff\1\13\1\5\1\uffff\1\3\1\16",
            "\1\20",
            "\1\21",
            "\1\22\1\24\2\uffff\1\23",
            "\1\27\6\uffff\1\25\1\26",
            "\1\31\11\uffff\1\32\6\uffff\1\30",
            "\1\33\5\uffff\1\34",
            "\1\35",
            "\1\40\6\uffff\1\41\3\uffff\1\37\2\uffff\1\36",
            "",
            "",
            "\1\43\1\42\1\uffff\1\44",
            "\1\45\1\uffff\1\46",
            "\1\50\5\uffff\1\47",
            "",
            "",
            "\1\51\16\uffff\1\52",
            "\1\53\12\uffff\1\54",
            "\1\55",
            "",
            "",
            "",
            "\1\57\11\uffff\1\60\1\56",
            "",
            "",
            "\1\63\3\uffff\1\62\10\uffff\1\61",
            "",
            "\1\64\6\uffff\1\65",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\1\71",
            "",
            "",
            "\1\73\20\uffff\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "",
            "\1\100",
            "\1\102\16\uffff\1\101\1\103",
            "\1\104",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\107\12\uffff\1\106",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\121\2\uffff\1\120",
            "\1\122",
            "\1\123\4\uffff\1\124",
            "\1\125",
            "",
            "",
            "\1\126\4\uffff\1\127",
            "",
            "",
            "\1\130",
            "",
            "",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\147\14\uffff\1\150",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "433:1: NODE_TYPE : ( 'package_declaration' | 'body_declarations' | 'variable_declaration' | 'import_declaration' | 'type_declaration' | 'field_declaration' | 'method_declaration' | 'interface_declaration' | 'constructor_declaration' | 'class_declaration' | 'variable_declaration_fragment' | 'variable_declaration_statement' | 'thrown_exceptions' | 'try_statement' | 'catch_clause' | 'initializer' | 'method_invocation' | 'if_statement' | 'vexpression' | 'operator' | 'conditional_expression' | 'continue_expression' | 'assignment' | 'this_expression' | 'class_instance_creation' | 'field_access' | 'instance_of_expression' | 'cast_expression' | 'super_field_access' | 'statement' | 'then_statement' | 'else_statement' | 'do_statement' | 'parameters' | 'vbody' | 'for_statement' | 'enhanced_for_statement' | 'switch_statement' | 'while_statement' | 'null_literal' | 'integer_literal' | 'character_literal' | 'string_literal' | 'boolean_literal' | 'variable' | 'file' | 'directory' );";
        }
    }
    static final String DFA5_eotS =
        "\64\uffff\1\71\16\uffff";
    static final String DFA5_eofS =
        "\103\uffff";
    static final String DFA5_minS =
        "\1\142\1\uffff\1\157\1\uffff\1\141\1\156\1\145\1\157\2\uffff\1\164"+
        "\1\157\4\uffff\1\143\1\137\1\uffff\1\143\1\144\2\uffff\1\157\1\141"+
        "\1\uffff\1\143\1\uffff\1\154\1\151\2\uffff\1\155\4\uffff\1\141\1"+
        "\146\1\145\1\162\1\151\1\164\3\145\1\144\1\156\2\162\1\137\1\147"+
        "\1\163\1\137\1\146\1\137\2\uffff\1\154\3\uffff\1\143\4\uffff";
    static final String DFA5_maxS =
        "\1\166\1\uffff\1\171\1\uffff\1\141\1\163\1\145\1\157\2\uffff\1\165"+
        "\1\157\4\uffff\1\162\1\137\1\uffff\1\146\1\144\2\uffff\1\170\1\141"+
        "\1\uffff\1\160\1\uffff\1\154\1\151\2\uffff\1\155\4\uffff\1\141\1"+
        "\146\1\145\1\162\1\151\1\164\1\151\2\145\1\144\1\156\2\162\1\137"+
        "\1\147\1\163\1\137\1\164\1\137\2\uffff\1\164\3\uffff\1\155\4\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\4\uffff\1\13\1\14\2\uffff\1\26\1\32\1\2"+
        "\1\33\2\uffff\1\23\2\uffff\1\24\1\31\2\uffff\1\22\1\uffff\1\11\2"+
        "\uffff\1\25\1\34\1\uffff\1\5\1\6\1\7\1\10\23\uffff\1\12\1\30\1\uffff"+
        "\1\15\1\16\1\17\1\uffff\1\4\1\27\1\20\1\21";
    static final String DFA5_specialS =
        "\103\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\13\1\uffff\1\6\1\15\3\uffff\1\5\1\uffff\1\11\1\uffff\1\7"+
            "\1\uffff\1\10\1\4\1\uffff\1\3\1\12\1\2\1\14\1\1",
            "",
            "\1\17\11\uffff\1\16",
            "",
            "\1\20",
            "\1\22\4\uffff\1\21",
            "\1\23",
            "\1\24",
            "",
            "",
            "\1\26\1\25",
            "\1\27",
            "",
            "",
            "",
            "",
            "\1\31\16\uffff\1\30",
            "\1\32",
            "",
            "\1\34\2\uffff\1\33",
            "\1\35",
            "",
            "",
            "\1\37\10\uffff\1\36",
            "\1\40",
            "",
            "\1\41\1\42\1\uffff\1\44\11\uffff\1\43",
            "",
            "\1\45",
            "\1\46",
            "",
            "",
            "\1\47",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56\3\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72",
            "\1\74\6\uffff\1\73\6\uffff\1\75",
            "\1\76",
            "",
            "",
            "\1\100\7\uffff\1\77",
            "",
            "",
            "",
            "\1\101\11\uffff\1\102",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "483:1: ATTRIBUTES : ( 'vname' | 'type_old' | 'return_type' | 'parameter_types' | 'is_constructor' | 'is_deprecated' | 'is_parameter' | 'is_field' | 'default_value' | 'modifiers' | 'origin' | 'kind' | 'declared_methods' | 'declared_fields' | 'declared_types' | 'declaring_class' | 'declaring_method' | 'package' | 'interfaces' | 'superclass' | 'boxing' | 'unboxing' | 'parameter_list' | 'modifier' | 'startLine' | 'endLine' | 'totalLines' | 'boolean_value' );";
        }
    }
    static final String DFA16_eotS =
        "\5\uffff";
    static final String DFA16_eofS =
        "\5\uffff";
    static final String DFA16_minS =
        "\2\56\3\uffff";
    static final String DFA16_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA16_specialS =
        "\5\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "528:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA25_eotS =
        "\1\uffff\7\54\1\uffff\1\103\6\54\1\uffff\1\125\10\uffff\1\126\1"+
        "\130\1\132\1\uffff\1\54\1\uffff\1\54\1\136\1\140\1\142\1\146\7\54"+
        "\1\uffff\1\165\1\uffff\7\54\1\37\1\54\1\u0086\1\u0088\1\u008c\4"+
        "\54\1\u0094\3\54\3\uffff\16\54\10\uffff\1\54\1\37\11\uffff\16\54"+
        "\1\uffff\1\54\1\u00c0\16\54\1\uffff\1\54\1\uffff\3\54\1\uffff\7"+
        "\54\1\uffff\1\35\12\54\1\u00ea\1\54\1\u00ec\1\u00ed\7\54\1\35\24"+
        "\54\1\uffff\7\54\1\u0110\25\54\1\u012a\13\54\1\uffff\1\54\2\uffff"+
        "\25\54\1\u014d\2\54\1\u0150\7\54\1\u0159\1\u015b\1\uffff\23\54\1"+
        "\u016f\5\54\1\uffff\21\54\1\u0186\7\54\1\u014d\1\u0150\7\54\1\uffff"+
        "\2\54\1\uffff\1\54\1\u0199\6\54\1\uffff\1\54\1\uffff\1\54\1\u0150"+
        "\1\54\1\u01a3\17\54\1\uffff\13\54\1\uffff\12\54\1\uffff\4\54\1\u0150"+
        "\15\54\1\uffff\7\54\1\u01e5\1\54\1\uffff\27\54\1\u0150\20\54\1\u0150"+
        "\30\54\1\uffff\1\u014d\5\54\1\u022d\2\54\1\u0230\3\54\1\u0150\1"+
        "\54\1\u0236\10\54\1\u023f\15\54\1\u0150\1\u024e\5\54\1\u014d\2\54"+
        "\1\u0150\11\54\1\u0150\2\54\1\u014d\1\u0150\10\54\1\uffff\2\54\1"+
        "\uffff\5\54\1\uffff\1\u014d\7\54\1\uffff\3\54\1\u027f\11\54\1\u0150"+
        "\1\uffff\23\54\1\u0150\4\54\1\u0150\4\54\1\u02a5\14\54\1\u014d\5"+
        "\54\1\uffff\5\54\1\u02bd\5\54\1\u014d\13\54\1\u0150\12\54\1\u014d"+
        "\2\54\1\uffff\27\54\1\uffff\13\54\1\u014d\10\54\1\u0150\7\54\1\u014d"+
        "\2\54\1\u0150\1\u0230\10\54\1\u014d\5\54\1\u014d\7\54\1\u014d\15"+
        "\54\1\u014d\11\54\1\u0150\2\54\1\u0150\16\54\1\u0348\7\54\1\u0150"+
        "\5\54\1\u014d\1\54\1\u014d\1\54\1\u014d\5\54\1\u0150\4\54\1\u0150"+
        "\2\54\1\u014d\10\54\1\uffff\4\54\1\u0150\6\54\1\u014d\3\54\1\u014d"+
        "\1\54\1\u014d\4\54\2\u0150\5\54\1\u014d\6\54\1\u0150\1\54\1\u014d"+
        "\3\54\1\u014d\2\54\1\u014d\4\54\2\u0150\14\54\1\u014d\6\54\1\u023f"+
        "\4\54\1\u014d\1\54\1\u014d\1\54\1\u014d\1\54\1\u014d\1\54\3\u014d"+
        "\2\54\1\u014d\5\54\1\u014d\5\54\1\u014d\3\54\1\u014d\7\54\2\u014d"+
        "\6\54\2\u014d\1\54\1\u014d\3\54\2\u014d\14\54\1\u014d\1\54\1\u014d";
    static final String DFA25_eofS =
        "\u03da\uffff";
    static final String DFA25_minS =
        "\1\11\1\145\1\150\1\160\1\146\1\145\1\156\1\154\1\uffff\1\56\2\141"+
        "\1\151\1\141\1\157\1\141\1\uffff\1\76\10\uffff\1\0\2\75\1\uffff"+
        "\1\116\1\uffff\1\122\2\75\1\53\1\57\1\157\1\141\1\150\1\151\1\145"+
        "\1\151\1\156\1\uffff\1\56\1\uffff\1\154\1\160\1\141\1\151\1\145"+
        "\2\164\1\60\1\145\3\60\1\160\1\162\1\143\1\137\1\60\1\144\1\163"+
        "\1\144\3\uffff\1\156\1\154\2\141\1\163\1\156\1\170\1\156\1\164\2"+
        "\144\1\154\1\151\1\143\10\uffff\1\104\1\60\11\uffff\1\144\1\162"+
        "\1\170\1\157\1\141\1\160\1\145\1\171\1\164\1\145\1\162\1\164\1\156"+
        "\1\142\1\uffff\1\145\1\60\1\145\1\162\1\151\1\164\1\162\1\154\1"+
        "\150\1\155\1\147\1\162\1\157\1\145\2\164\1\uffff\1\163\1\uffff\1"+
        "\141\1\157\1\143\1\uffff\1\157\1\145\1\164\1\141\1\154\1\163\1\151"+
        "\1\uffff\1\60\1\145\1\141\1\114\1\144\1\156\1\154\1\143\1\164\1"+
        "\163\1\162\1\60\1\145\2\60\1\150\1\151\1\145\1\154\1\156\1\153\1"+
        "\141\1\60\1\171\1\154\2\151\1\160\1\144\1\155\1\145\1\157\1\163"+
        "\1\156\1\137\1\141\1\154\1\145\1\137\1\165\1\144\1\157\1\143\1\uffff"+
        "\1\162\1\145\1\164\1\156\1\143\2\145\1\60\1\157\1\151\1\141\1\163"+
        "\1\147\1\151\1\141\1\164\1\162\1\144\1\154\1\145\1\141\1\151\1\162"+
        "\1\143\1\150\1\165\1\141\1\164\1\147\1\60\1\156\1\151\1\141\1\164"+
        "\1\151\1\164\1\161\1\150\1\137\1\163\1\141\1\uffff\1\156\2\uffff"+
        "\1\157\1\146\1\164\1\137\1\164\1\141\1\155\1\137\1\145\1\156\1\141"+
        "\1\162\1\171\1\145\1\137\1\167\2\137\1\163\1\154\1\144\1\60\1\163"+
        "\1\162\1\60\1\170\1\164\1\137\1\155\1\114\1\147\1\150\2\60\1\uffff"+
        "\1\163\1\156\2\164\1\146\1\145\1\141\1\156\1\141\2\145\1\156\1\141"+
        "\1\160\1\162\1\151\1\145\2\164\1\60\1\154\1\162\1\141\1\156\1\163"+
        "\1\uffff\1\143\1\156\1\151\1\156\1\162\1\164\1\50\1\165\1\137\1"+
        "\145\1\137\1\143\1\165\1\144\1\151\1\171\1\154\1\60\1\147\1\145"+
        "\1\144\1\141\1\147\1\142\1\145\2\60\1\144\1\156\1\145\1\163\1\164"+
        "\1\114\1\137\1\uffff\1\164\1\156\1\uffff\1\151\1\60\1\146\1\154"+
        "\1\145\1\151\2\137\1\uffff\1\163\1\uffff\1\164\1\60\1\157\1\60\1"+
        "\141\1\162\1\154\1\143\1\164\1\156\1\164\2\163\1\162\1\141\1\155"+
        "\1\154\1\137\1\154\1\uffff\1\164\1\145\1\164\1\155\1\164\2\145\1"+
        "\156\2\165\1\151\1\uffff\1\145\1\143\1\170\1\144\1\164\1\155\1\137"+
        "\1\145\1\160\1\151\1\uffff\1\145\1\164\1\145\1\156\1\60\1\154\1"+
        "\163\1\145\1\154\1\137\1\170\1\164\1\141\1\151\2\141\1\137\1\156"+
        "\1\uffff\1\151\1\141\2\156\1\154\1\163\1\164\1\60\1\162\1\uffff"+
        "\1\143\1\137\1\151\2\145\1\164\1\171\1\164\1\163\1\145\1\155\1\151"+
        "\2\144\1\171\1\162\1\137\1\144\1\156\2\145\1\141\1\144\1\60\1\163"+
        "\1\145\1\143\1\157\1\162\1\154\1\160\1\145\1\156\1\145\1\142\1\151"+
        "\1\144\1\162\1\145\1\164\1\60\1\145\1\143\1\137\1\145\1\163\1\143"+
        "\1\144\1\145\1\160\1\141\1\164\1\156\1\145\1\143\2\164\1\147\1\145"+
        "\1\163\1\164\1\145\1\151\1\164\1\141\1\uffff\1\60\1\145\1\154\1"+
        "\172\1\137\1\155\1\60\1\160\1\162\1\60\1\143\1\145\1\164\1\60\1"+
        "\145\1\60\1\171\1\166\1\137\1\147\1\155\1\156\1\164\1\137\1\60\1"+
        "\137\1\164\1\156\1\171\1\141\1\162\1\143\1\163\1\162\1\145\1\156"+
        "\1\145\1\156\2\60\1\145\1\144\1\162\2\154\1\60\1\151\1\154\1\60"+
        "\1\170\1\162\1\164\2\145\2\143\1\145\1\171\1\60\1\154\1\163\2\60"+
        "\1\164\1\141\1\164\1\137\1\151\1\145\1\157\1\145\1\uffff\1\145\1"+
        "\165\1\uffff\1\141\1\164\1\151\2\143\1\uffff\1\60\1\141\1\146\1"+
        "\137\1\145\1\164\1\145\1\146\1\uffff\1\145\1\157\1\141\1\60\1\165"+
        "\1\145\1\154\1\164\1\137\1\162\1\144\1\143\1\166\1\60\1\uffff\1"+
        "\162\1\145\1\137\1\141\1\151\1\141\1\144\1\157\1\141\1\143\2\145"+
        "\1\155\1\163\1\154\1\145\1\155\1\160\1\144\1\60\1\145\1\164\1\145"+
        "\1\144\1\60\1\164\1\162\1\146\1\156\1\60\1\143\1\164\1\145\1\166"+
        "\1\154\1\157\1\154\1\145\1\151\1\171\1\143\1\156\1\60\1\155\1\157"+
        "\1\170\1\162\1\154\1\uffff\2\163\2\141\1\154\1\60\1\151\1\154\1"+
        "\157\1\141\1\143\1\60\1\154\1\162\1\164\1\154\1\145\1\156\1\162"+
        "\1\145\1\163\1\155\1\145\1\60\1\141\1\163\2\145\1\137\1\162\1\145"+
        "\1\155\2\145\1\60\1\137\1\164\1\uffff\1\164\1\145\1\162\1\145\1"+
        "\141\1\156\1\165\1\164\1\145\1\160\1\154\1\145\1\164\1\145\1\162"+
        "\1\160\2\137\1\145\1\163\1\162\1\156\1\151\1\uffff\1\156\1\141\1"+
        "\143\2\154\1\171\1\151\1\141\1\145\1\165\1\143\1\60\1\141\1\160"+
        "\1\163\1\145\1\156\1\162\1\163\1\156\1\60\2\141\1\155\1\145\1\143"+
        "\1\162\1\145\1\60\1\157\1\144\2\60\1\162\1\164\1\145\1\150\1\154"+
        "\1\145\1\141\1\164\1\60\1\156\1\137\1\162\1\144\1\145\1\60\1\151"+
        "\1\141\1\143\1\164\1\147\1\162\1\141\1\60\1\141\1\160\1\163\1\164"+
        "\1\162\1\145\1\154\2\164\1\151\1\156\1\164\1\141\1\60\1\164\1\143"+
        "\1\154\1\145\1\156\1\154\1\141\1\170\1\162\1\60\2\141\1\60\1\157"+
        "\1\144\2\163\1\150\1\164\1\163\2\145\1\170\1\157\1\164\2\145\1\60"+
        "\1\141\1\164\1\162\1\145\1\164\1\151\1\141\1\60\1\141\2\151\1\157"+
        "\1\164\1\60\1\164\1\60\1\143\1\60\1\156\1\164\1\141\1\154\1\160"+
        "\1\60\1\164\1\151\1\144\1\163\1\60\1\163\1\157\1\60\1\164\1\163"+
        "\1\143\1\160\1\156\1\151\1\137\1\162\1\uffff\1\164\1\151\1\141\1"+
        "\163\1\60\1\157\1\154\1\162\2\157\1\156\1\60\1\151\1\145\1\164\1"+
        "\60\1\162\1\60\1\162\1\151\1\156\1\163\2\60\1\144\1\141\1\163\1"+
        "\154\1\162\1\60\1\157\1\143\1\141\1\151\1\157\1\164\1\60\1\156\1"+
        "\60\1\141\2\156\1\60\1\157\1\163\1\60\1\141\1\145\1\157\1\163\2"+
        "\60\1\164\1\151\1\141\1\145\1\156\1\162\1\154\1\157\1\156\1\151"+
        "\1\163\1\164\1\60\1\163\1\156\1\163\1\164\1\163\1\156\1\60\1\145"+
        "\1\157\1\162\1\163\1\60\1\145\1\60\1\156\1\60\1\157\1\60\1\151\3"+
        "\60\1\151\1\163\1\60\1\155\1\156\1\141\1\163\1\141\1\60\1\156\2"+
        "\157\1\151\1\145\1\60\1\164\1\151\1\164\1\60\2\156\1\157\1\156\1"+
        "\151\1\157\1\151\2\60\1\156\1\164\1\157\1\156\1\157\1\146\2\60\1"+
        "\156\1\60\1\156\1\162\1\164\2\60\2\141\1\147\1\164\1\155\2\145\1"+
        "\155\1\156\1\145\1\164\1\156\1\60\1\164\1\60";
    static final String DFA25_maxS =
        "\1\175\1\167\1\151\1\165\1\163\1\157\1\163\1\156\1\uffff\1\71\1"+
        "\157\1\141\1\151\1\157\1\165\1\162\1\uffff\1\76\10\uffff\1\uffff"+
        "\2\75\1\uffff\1\116\1\uffff\1\122\3\75\1\57\1\157\1\156\1\171\1"+
        "\157\1\145\1\151\1\156\1\uffff\1\145\1\uffff\1\164\1\160\1\162\2"+
        "\151\2\164\1\172\1\145\3\172\1\160\1\162\1\160\1\137\1\172\1\144"+
        "\1\163\1\150\3\uffff\1\165\1\164\2\141\1\163\1\156\1\170\1\156\1"+
        "\164\2\144\1\154\1\151\1\162\10\uffff\1\104\1\172\11\uffff\1\170"+
        "\1\162\1\170\1\157\1\141\1\160\1\162\1\171\1\164\1\154\1\162\1\164"+
        "\1\156\1\142\1\uffff\1\145\1\172\1\145\1\164\1\151\1\164\1\162\1"+
        "\154\1\150\1\155\1\147\1\162\1\157\1\145\2\164\1\uffff\1\163\1\uffff"+
        "\1\141\1\157\1\160\1\uffff\1\157\1\145\1\164\1\141\1\154\1\163\1"+
        "\151\1\uffff\1\172\1\145\1\141\1\114\1\164\1\156\1\154\1\143\1\164"+
        "\1\163\1\162\1\172\1\145\2\172\1\150\1\151\1\145\1\154\1\156\1\153"+
        "\1\141\1\172\1\171\1\154\2\151\1\160\1\144\1\155\1\145\1\157\1\163"+
        "\1\156\1\137\1\141\1\154\1\145\1\137\1\165\1\144\1\157\1\143\1\uffff"+
        "\1\162\1\145\1\164\1\156\1\143\2\145\1\172\1\157\1\151\1\141\1\163"+
        "\1\162\1\151\1\141\1\164\1\162\1\144\1\157\1\145\1\162\1\151\1\162"+
        "\1\143\1\150\1\165\1\141\1\164\1\147\1\172\1\156\2\151\1\164\1\151"+
        "\1\164\1\161\1\150\1\137\1\163\1\141\1\uffff\1\156\2\uffff\1\157"+
        "\1\146\1\164\1\137\1\164\1\141\1\155\1\137\1\145\1\156\1\141\1\162"+
        "\1\171\1\145\1\137\1\167\2\137\1\163\1\154\1\144\1\172\1\163\1\162"+
        "\1\172\1\170\1\164\1\143\1\155\1\114\1\147\1\150\2\172\1\uffff\1"+
        "\163\1\156\2\164\1\146\1\145\1\141\1\156\1\141\2\145\1\156\1\141"+
        "\1\160\1\162\1\151\1\145\2\164\1\172\1\154\1\162\1\141\1\156\1\163"+
        "\1\uffff\1\143\1\156\1\151\1\156\1\162\1\164\1\50\1\165\1\137\1"+
        "\145\1\137\1\143\1\165\1\144\1\151\1\171\1\154\1\172\1\147\1\145"+
        "\1\144\1\141\1\147\1\142\1\145\2\172\1\157\1\156\1\145\1\163\1\164"+
        "\1\114\1\137\1\uffff\1\164\1\156\1\uffff\1\151\1\172\1\146\1\154"+
        "\1\145\1\151\2\137\1\uffff\1\163\1\uffff\1\164\1\172\1\157\1\172"+
        "\1\141\1\162\1\154\1\143\1\164\1\156\1\164\2\163\1\162\1\141\1\155"+
        "\1\154\1\137\1\157\1\uffff\1\164\1\151\1\164\1\155\1\164\2\145\1"+
        "\156\2\165\1\151\1\uffff\1\145\1\143\1\170\1\151\1\164\1\155\1\142"+
        "\1\145\1\160\1\151\1\uffff\1\145\1\164\1\145\1\156\1\172\1\154\1"+
        "\163\1\145\1\154\1\137\1\170\1\164\1\141\1\151\1\144\1\141\1\137"+
        "\1\156\1\uffff\1\151\1\141\2\156\1\154\1\163\1\164\1\172\1\162\1"+
        "\uffff\1\143\1\137\1\151\2\145\1\164\1\171\1\164\1\163\1\145\1\155"+
        "\1\151\2\144\1\171\1\162\1\137\1\144\1\156\2\145\1\141\1\144\1\172"+
        "\1\163\1\145\1\143\1\157\1\162\1\154\1\160\1\145\1\156\1\145\1\142"+
        "\2\151\1\162\1\145\1\164\1\172\1\145\1\143\1\137\1\145\1\163\1\143"+
        "\1\144\1\145\1\160\1\141\1\164\1\156\1\145\1\143\2\164\1\147\1\145"+
        "\1\163\1\164\1\145\1\151\1\164\1\141\1\uffff\1\172\1\145\1\154\1"+
        "\172\1\137\1\155\1\172\1\160\1\162\1\172\1\143\1\145\1\164\1\172"+
        "\1\145\1\172\1\171\1\166\1\137\1\147\1\155\1\156\1\164\1\137\1\172"+
        "\1\137\1\164\1\156\1\171\1\141\1\162\1\143\1\163\1\162\1\145\1\156"+
        "\1\145\1\156\2\172\1\145\1\144\1\162\1\154\1\166\1\172\1\151\1\154"+
        "\1\172\1\170\1\162\1\164\2\145\2\143\1\145\1\171\1\172\1\154\1\163"+
        "\2\172\1\164\1\141\1\164\1\163\1\151\1\145\1\157\1\145\1\uffff\1"+
        "\145\1\165\1\uffff\1\141\1\164\1\151\2\143\1\uffff\1\172\1\141\1"+
        "\164\1\137\1\145\1\164\1\145\1\146\1\uffff\1\145\1\157\1\141\1\172"+
        "\1\165\1\145\1\154\1\164\1\137\1\162\1\144\1\143\1\166\1\172\1\uffff"+
        "\1\162\1\145\1\163\1\141\1\151\1\141\1\144\1\157\1\141\1\143\2\145"+
        "\1\155\1\163\1\154\1\145\1\155\1\160\1\144\1\172\1\145\1\164\1\145"+
        "\1\144\1\172\1\164\1\162\1\146\1\156\1\172\1\143\1\164\1\145\1\166"+
        "\1\154\1\157\1\154\1\145\1\151\1\171\1\155\1\156\1\172\1\155\1\157"+
        "\1\170\1\162\1\154\1\uffff\2\163\2\141\1\154\1\172\1\151\1\154\1"+
        "\157\1\141\1\143\1\172\1\164\1\162\1\164\1\154\1\145\1\156\1\162"+
        "\1\145\1\163\1\155\1\145\1\172\1\141\1\163\2\145\1\137\1\162\1\145"+
        "\1\155\2\145\1\172\1\137\1\164\1\uffff\1\164\1\145\1\162\1\145\1"+
        "\141\1\156\1\165\1\164\1\145\1\160\1\154\1\145\1\164\1\145\1\162"+
        "\1\160\2\137\1\145\1\163\1\162\1\156\1\151\1\uffff\1\156\1\141\1"+
        "\143\2\154\1\171\1\151\1\141\1\145\1\165\1\143\1\172\1\141\1\160"+
        "\1\163\1\145\1\156\1\162\1\163\1\156\1\172\2\141\1\155\1\145\1\143"+
        "\1\162\1\145\1\172\1\157\1\144\2\172\1\162\1\164\1\145\1\150\1\154"+
        "\1\145\1\141\1\164\1\172\1\156\1\137\1\162\1\144\1\145\1\172\1\151"+
        "\1\141\1\143\1\164\1\147\1\162\1\141\1\172\1\141\1\160\1\163\1\164"+
        "\1\162\1\145\1\154\2\164\1\151\1\156\1\164\1\141\1\172\1\164\1\143"+
        "\1\154\1\145\1\156\1\154\1\141\1\170\1\162\1\172\2\141\1\172\1\157"+
        "\1\144\2\163\1\150\1\164\1\163\2\145\1\170\1\157\1\164\2\145\1\172"+
        "\1\141\1\164\1\162\1\145\1\164\1\151\1\141\1\172\1\141\2\151\1\157"+
        "\1\164\1\172\1\164\1\172\1\143\1\172\1\156\1\164\1\141\1\154\1\160"+
        "\1\172\1\164\1\151\1\144\1\163\1\172\1\163\1\157\1\172\1\164\1\163"+
        "\1\143\1\160\1\156\1\151\1\137\1\162\1\uffff\1\164\1\151\1\141\1"+
        "\163\1\172\1\157\1\154\1\162\2\157\1\156\1\172\1\151\1\145\1\164"+
        "\1\172\1\162\1\172\1\162\1\151\1\156\1\163\2\172\1\144\1\141\1\163"+
        "\1\154\1\162\1\172\1\157\1\143\1\141\1\151\1\157\1\164\1\172\1\156"+
        "\1\172\1\141\2\156\1\172\1\157\1\163\1\172\1\141\1\145\1\157\1\163"+
        "\2\172\1\164\1\151\1\141\1\145\1\156\1\162\1\154\1\157\1\156\1\151"+
        "\1\163\1\164\1\172\1\163\1\156\1\163\1\164\1\163\1\156\1\172\1\145"+
        "\1\157\1\162\1\163\1\172\1\145\1\172\1\156\1\172\1\157\1\172\1\151"+
        "\3\172\1\151\1\163\1\172\1\155\1\156\1\141\1\163\1\141\1\172\1\156"+
        "\2\157\1\151\1\145\1\172\1\164\1\151\1\164\1\172\2\156\1\157\1\156"+
        "\1\151\1\157\1\151\2\172\1\156\1\164\1\157\1\156\1\157\1\163\2\172"+
        "\1\156\1\172\1\156\1\162\1\164\2\172\2\141\1\147\1\164\1\155\2\145"+
        "\1\155\1\156\1\145\1\164\1\156\1\172\1\164\1\172";
    static final String DFA25_acceptS =
        "\10\uffff\1\15\7\uffff\1\35\1\uffff\1\37\1\40\1\41\1\42\1\43\1\44"+
        "\1\45\1\46\3\uffff\1\55\1\uffff\1\56\14\uffff\1\73\1\uffff\1\77"+
        "\24\uffff\1\47\1\16\1\76\16\uffff\1\36\1\64\1\50\1\75\1\51\1\54"+
        "\1\52\1\53\2\uffff\1\57\1\60\1\62\1\61\1\63\1\66\1\67\1\100\1\65"+
        "\16\uffff\1\74\20\uffff\1\14\1\uffff\1\11\3\uffff\1\22\7\uffff\1"+
        "\7\53\uffff\1\10\51\uffff\1\23\1\uffff\1\26\1\27\42\uffff\1\3\31"+
        "\uffff\1\12\42\uffff\1\70\2\uffff\1\71\10\uffff\1\2\1\uffff\1\13"+
        "\23\uffff\1\30\13\uffff\1\25\12\uffff\1\34\22\uffff\1\1\11\uffff"+
        "\1\5\101\uffff\1\4\107\uffff\1\20\2\uffff\1\72\5\uffff\1\6\10\uffff"+
        "\1\17\16\uffff\1\31\60\uffff\1\33\45\uffff\1\21\27\uffff\1\24\u008a"+
        "\uffff\1\32\u0091\uffff";
    static final String DFA25_specialS =
        "\32\uffff\1\0\u03bf\uffff}>";
    static final String[] DFA25_transitionS = {
            "\2\56\2\uffff\1\56\22\uffff\1\56\1\41\1\32\3\uffff\1\35\1\uffff"+
            "\1\22\1\23\1\10\1\43\1\20\1\21\1\11\1\44\12\55\1\31\1\30\1\34"+
            "\1\42\1\33\2\uffff\1\36\15\54\1\40\13\54\1\26\1\uffff\1\27\1"+
            "\uffff\1\54\1\uffff\1\6\1\45\1\12\1\5\1\7\1\50\1\54\1\13\1\4"+
            "\1\54\1\52\1\14\1\15\1\16\1\3\1\17\1\54\1\51\1\1\1\47\1\53\1"+
            "\46\1\2\3\54\1\24\1\37\1\25",
            "\1\57\16\uffff\1\61\1\60\1\uffff\1\62",
            "\1\63\1\64",
            "\1\67\1\uffff\1\66\2\uffff\1\65",
            "\1\71\6\uffff\1\73\1\70\4\uffff\1\72",
            "\1\75\3\uffff\1\74\5\uffff\1\76",
            "\1\100\4\uffff\1\77",
            "\1\101\1\uffff\1\102",
            "",
            "\1\104\1\uffff\12\105",
            "\1\107\6\uffff\1\111\3\uffff\1\110\2\uffff\1\106",
            "\1\112",
            "\1\113",
            "\1\114\3\uffff\1\116\3\uffff\1\115\5\uffff\1\117",
            "\1\120\5\uffff\1\121",
            "\1\123\20\uffff\1\122",
            "",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\127",
            "\1\131",
            "\1\133",
            "",
            "\1\134",
            "",
            "\1\135",
            "\1\137",
            "\1\141",
            "\1\144\21\uffff\1\143",
            "\1\145",
            "\1\147",
            "\1\150\1\152\2\uffff\1\151\10\uffff\1\153",
            "\1\155\6\uffff\1\157\2\uffff\1\156\6\uffff\1\154",
            "\1\160\5\uffff\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\105\1\uffff\12\55\13\uffff\1\105\37\uffff\1\105",
            "",
            "\1\166\7\uffff\1\167",
            "\1\170",
            "\1\171\20\uffff\1\172",
            "\1\173",
            "\1\174\3\uffff\1\175",
            "\1\176",
            "\1\177",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u0080\21"+
            "\54",
            "\1\u0081",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u0084\3\54"+
            "\1\u0082\5\54\1\u0085\1\u0083\6\54",
            "\12\54\7\uffff\32\54\4\uffff\1\u0087\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\u008b\1\uffff\15\54\1\u008a"+
            "\1\54\1\u0089\12\54",
            "\1\u008d",
            "\1\u008e",
            "\1\u0091\2\uffff\1\u0090\11\uffff\1\u008f",
            "\1\u0092",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u0093\7\54",
            "\1\u0095",
            "\1\u0096",
            "\1\u0098\3\uffff\1\u0097",
            "",
            "",
            "",
            "\1\u0099\6\uffff\1\u009a",
            "\1\u009b\6\uffff\1\u009d\1\u009c",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\16\uffff\1\u00aa",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ab",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ac\12\uffff\1\u00ad\10\uffff\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b6\3\uffff\1\u00b5\10\uffff\1\u00b4",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\6\uffff\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c1",
            "\1\u00c3\1\uffff\1\u00c2",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3\1\u00d4\1\uffff\1\u00d6\11\uffff\1\u00d5",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e3\16\uffff\1\u00e2\1\u00e1",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00eb",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0116\12\uffff\1\u0115",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011d\2\uffff\1\u011c",
            "\1\u011e",
            "\1\u011f\20\uffff\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\12\54\7\uffff\32\54\4\uffff\1\u0129\1\uffff\32\54",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d\7\uffff\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "\1\u0137",
            "",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u014e",
            "\1\u014f",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153\3\uffff\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\u015a\1\uffff\32\54",
            "",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u018e\12\uffff\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "",
            "\1\u0196",
            "\1\u0197",
            "",
            "\1\u0198",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "\1\u01a0",
            "",
            "\1\u01a1",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01a2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2\2\uffff\1\u01b3",
            "",
            "\1\u01b4",
            "\1\u01b5\3\uffff\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3\4\uffff\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c8\2\uffff\1\u01c7",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01da\2\uffff\1\u01d9",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01e6",
            "",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a\4\uffff\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\12\54\7\uffff\32\54\4\uffff\1\u020f\1\uffff\32\54",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u022e",
            "\1\u022f",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0234",
            "\12\54\7\uffff\32\54\4\uffff\1\u0235\1\uffff\32\54",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u024d\7\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253\11\uffff\1\u0254",
            "\12\54\7\uffff\32\54\4\uffff\1\u0255\1\uffff\32\54",
            "\1\u0256",
            "\1\u0257",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0261",
            "\1\u0262",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266\23\uffff\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "",
            "\1\u026c",
            "\1\u026d",
            "",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0273",
            "\1\u0275\6\uffff\1\u0274\6\uffff\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0289",
            "\1\u028a",
            "\1\u028c\23\uffff\1\u028b",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0\11\uffff\1\u02b1",
            "\1\u02b2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02c4\7\uffff\1\u02c3",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02d9",
            "\1\u02da",
            "",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u030c",
            "\1\u030d",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "\1\u0321",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0338",
            "\1\u0339",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0355",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0356",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0357",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0360",
            "\1\u0361",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0362",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365",
            "\1\u0366",
            "\1\u0367",
            "\1\u0368",
            "\1\u0369",
            "",
            "\1\u036a",
            "\1\u036b",
            "\1\u036c",
            "\1\u036d",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0377",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f",
            "\1\u0380",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0387",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u038b",
            "\1\u038c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "\1\u0396",
            "\1\u0397",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\1\u039c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u039d",
            "\1\u039e",
            "\1\u039f",
            "\1\u03a0",
            "\1\u03a1",
            "\1\u03a2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03a3",
            "\1\u03a4",
            "\1\u03a5",
            "\1\u03a6",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03a7",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03a8",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03a9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03aa",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03ab",
            "\1\u03ac",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\1\u03b0",
            "\1\u03b1",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03b2",
            "\1\u03b3",
            "\1\u03b4",
            "\1\u03b5",
            "\1\u03b6",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03b7",
            "\1\u03b8",
            "\1\u03b9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03ba",
            "\1\u03bb",
            "\1\u03bc",
            "\1\u03bd",
            "\1\u03be",
            "\1\u03bf",
            "\1\u03c0",
            "\12\54\7\uffff\32\54\4\uffff\1\u03c1\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03c2",
            "\1\u03c3",
            "\1\u03c4",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c7\14\uffff\1\u03c8",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03c9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03ca",
            "\1\u03cb",
            "\1\u03cc",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03cd",
            "\1\u03ce",
            "\1\u03cf",
            "\1\u03d0",
            "\1\u03d1",
            "\1\u03d2",
            "\1\u03d3",
            "\1\u03d4",
            "\1\u03d5",
            "\1\u03d6",
            "\1\u03d7",
            "\1\u03d8",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u03d9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | WHERE | WITH | OUTMOST | INMOST | DIRECTLY | AS | SET | IF | ELSE | WHILE | IN | STAR | REPEATER | CONTAINS | ISPARENT | ISNODETYPE | IS | HAS | LINENUMBER | COUNT | MAX | MIN | DEPTH | NODETYPE | METHODBINDING | CALLQUERY | PRINT | COMMA | FILTER | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_SQ_BRACKET | RIGHT_SQ_BRACKET | SEMICOLON | COLON | PERIOD | DQOUTE | GT | LT | LTE | GTE | AND | OR | NOT | NOT_EQUAL | LOGIC_EQUALS | EQUALS | PLUS | MINUS | DIVIDE | COMPOUND_ADD | INCREMENT | NODE_TYPE | ATTRIBUTES | RESERVED_TYPES | ID | INTEGER | STRING | FLOAT | SPACE | LINE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_26 = input.LA(1);

                        s = -1;
                        if ( ((LA25_26 >= '\u0000' && LA25_26 <= '\uFFFF')) ) {s = 87;}

                        else s = 86;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}