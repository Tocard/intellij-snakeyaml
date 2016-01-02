/* The following code was generated by JFlex 1.4.3 on 1/2/16 2:22 PM */

package lv.kid.vermut.intellij.yaml.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static lv.kid.vermut.intellij.yaml.lexer.YamlTokenTypes.*;

/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/2/16 2:22 PM from the specification file
 * <tt>C:/Users/VermutMac/IdeaProjects/intellij-ansible/src/main/java/lv/kid/vermut/intellij/yaml/lexer/yaml.flex</tt>
 */
public class YamlFlexLexer implements FlexLexer {
    /**
     * initial size of the lookahead buffer
     */
    private static final int ZZ_BUFFERSIZE = 16384;
    private static final String ZZ_NL = System.getProperty("line.separator");

    /**
     * lexical states
     */
    public static final int IN_PLAIN = 2;
    public static final int YYINITIAL = 0;
    public static final int IN_PLAIN_FLOW = 4;

    /**
     * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
     * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
     * at the beginning of a line
     * l is of the form l = 2*k, k a non negative integer
     */
    private static final int ZZ_LEXSTATE[] = {
            0, 1, 2, 2, 3, 3
    };

    /**
     * Translates characters to character classes
     */
    private static final String ZZ_CMAP_PACKED =
            "\11\0\1\6\1\2\2\11\1\10\22\0\1\6\1\7\1\22\1\1" +
                    "\1\0\1\5\1\7\1\22\2\0\1\7\1\0\1\16\1\3\1\4" +
                    "\13\0\1\20\3\0\1\21\1\17\1\7\32\0\1\12\1\0\1\13" +
                    "\2\0\1\7\32\0\1\14\1\21\1\15\7\0\1\11\u1fa2\0\2\11" +
                    "\udfd6\0";

    /**
     * Translates characters to character classes
     */
    private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

    /**
     * Translates DFA states to action switch labels.
     */
    private static final int[] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0 =
            "\2\1\2\0\1\2\1\3\1\1\1\4\1\2\1\3" +
                    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14" +
                    "\1\3\1\15\1\3\1\16\2\17\1\20\1\0\2\21" +
                    "\1\0\1\4\2\0\1\15\1\0\2\22\1\23";

    private static int[] zzUnpackAction() {
        int[] result = new int[37];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Translates a state to a row index in the transition table
     */
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0 =
            "\0\0\0\23\0\46\0\71\0\114\0\137\0\162\0\205" +
                    "\0\230\0\114\0\253\0\276\0\321\0\344\0\367\0\u010a" +
                    "\0\u011d\0\u0130\0\u0143\0\114\0\u0156\0\114\0\114\0\u0169" +
                    "\0\114\0\137\0\114\0\137\0\u017c\0\u018f\0\u01a2\0\u0143" +
                    "\0\u01b5\0\u0156\0\114\0\u0156\0\114";

    private static int[] zzUnpackRowMap() {
        int[] result = new int[37];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int[] result) {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    /**
     * The transition table of the DFA
     */
    private static final int[] ZZ_TRANS = zzUnpackTrans();

    private static final String ZZ_TRANS_PACKED_0 =
            "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\12" +
                    "\2\5\1\14\1\15\1\16\1\17\1\20\1\21\1\22" +
                    "\1\23\1\24\1\5\1\6\1\7\1\10\1\11\1\25" +
                    "\1\13\1\12\2\5\1\14\1\15\1\16\1\17\1\20" +
                    "\1\21\1\22\1\23\1\24\2\26\1\27\5\26\1\30" +
                    "\1\27\13\26\1\27\5\26\1\30\1\27\6\26\1\31" +
                    "\2\26\23\0\2\32\1\33\5\32\2\34\11\32\6\0" +
                    "\1\7\17\0\1\35\2\0\1\36\20\0\1\37\24\0" +
                    "\1\13\22\0\1\14\22\0\1\15\22\0\1\16\22\0" +
                    "\1\17\22\0\1\20\22\0\1\21\22\0\1\22\16\0" +
                    "\1\24\3\0\1\40\1\0\1\41\1\24\11\0\2\42" +
                    "\1\43\5\42\2\44\11\42\2\0\1\27\23\0\1\45" +
                    "\25\0\1\36\20\0\1\45\20\0\1\24\20\0";

    private static int[] zzUnpackTrans() {
        int[] result = new int[456];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;
    private static final char[] EMPTY_BUFFER = new char[0];
    private static final int YYEOF = -1;
    private static java.io.Reader zzReader = null; // Fake

    /* error messages for the codes above */
    private static final String ZZ_ERROR_MSG[] = {
            "Unkown internal scanner error",
            "Error: could not match input",
            "Error: pushback value was too large"
    };

    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
     */
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0 =
            "\2\1\2\0\1\11\4\1\1\11\11\1\1\11\1\1" +
                    "\2\11\1\1\1\11\1\0\1\11\1\1\1\0\1\1" +
                    "\2\0\1\1\1\0\1\11\1\1\1\11";

    private static int[] zzUnpackAttribute() {
        int[] result = new int[37];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }

    /**
     * the current state of the DFA
     */
    private int zzState;

    /**
     * the current lexical state
     */
    private int zzLexicalState = YYINITIAL;

    /**
     * this buffer contains the current text to be matched and is
     * the source of the yytext() string
     */
    private CharSequence zzBuffer = "";

    /**
     * this buffer may contains the current text array to be matched when it is cheap to acquire it
     */
    private char[] zzBufferArray;

    /**
     * the textposition at the last accepting state
     */
    private int zzMarkedPos;

    /**
     * the textposition at the last state to be included in yytext
     */
    private int zzPushbackPos;

    /**
     * the current text position in the buffer
     */
    private int zzCurrentPos;

    /**
     * startRead marks the beginning of the yytext() string in the buffer
     */
    private int zzStartRead;

    /**
     * endRead marks the last character in the buffer, that has been read
     * from input
     */
    private int zzEndRead;

    /**
     * zzAtBOL == true <=> the scanner is currently at the beginning of a line
     */
    private boolean zzAtBOL = true;

    /**
     * zzAtEOF == true <=> the scanner is at the EOF
     */
    private boolean zzAtEOF;

    /* user code: */
    private int yycolumn = 0;
    private int a = 0;

    private void retryInState(int newState) {
        yybegin(newState);
        yypushback(yylength());
    }


    /**
     * Creates a new scanner
     *
     * @param in the java.io.Reader to read input from.
     */
    public YamlFlexLexer(java.io.Reader in) {
        this.zzReader = in;
    }


    /**
     * Unpacks the compressed character translation table.
     *
     * @param packed the packed character translation table
     * @return the unpacked character translation table
     */
    private static char[] zzUnpackCMap(String packed) {
        char[] map = new char[0x10000];
        int i = 0;  /* index in packed string  */
        int j = 0;  /* index in unpacked array */
        while (i < 82) {
            int count = packed.charAt(i++);
            char value = packed.charAt(i++);
            do map[j++] = value; while (--count > 0);
        }
        return map;
    }

    public final int getTokenStart() {
        return zzStartRead;
    }

    public final int getTokenEnd() {
        return getTokenStart() + yylength();
    }

    public void reset(CharSequence buffer, int start, int end, int initialState) {
        zzBuffer = buffer;
        zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
        zzCurrentPos = zzMarkedPos = zzStartRead = start;
        zzPushbackPos = 0;
        zzAtEOF = false;
        zzAtBOL = true;
        zzEndRead = end;
        yybegin(initialState);
    }

    /**
     * Refills the input buffer.
     *
     * @return <code>false</code>, iff there was new input.
     * @throws java.io.IOException if any I/O-Error occurs
     */
    private boolean zzRefill() throws java.io.IOException {
        return true;
    }


    /**
     * Returns the current lexical state.
     */
    public final int yystate() {
        return zzLexicalState;
    }


    /**
     * Enters a new lexical state
     *
     * @param newState the new lexical state
     */
    public final void yybegin(int newState) {
        zzLexicalState = newState;
    }


    /**
     * Returns the text matched by the current regular expression.
     */
    public final CharSequence yytext() {
        return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
    }


    /**
     * Returns the character at position <tt>pos</tt> from the
     * matched text.
     * <p/>
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch.
     *            A value from 0 to yylength()-1.
     * @return the character at position pos
     */
    public final char yycharat(int pos) {
        return zzBufferArray != null ? zzBufferArray[zzStartRead + pos] : zzBuffer.charAt(zzStartRead + pos);
    }


    /**
     * Returns the length of the matched text region.
     */
    public final int yylength() {
        return zzMarkedPos - zzStartRead;
    }


    /**
     * Reports an error that occured while scanning.
     * <p/>
     * In a wellformed scanner (no or only correct usage of
     * yypushback(int) and a match-all fallback rule) this method
     * will only be called with things that "Can't Possibly Happen".
     * If this method is called, something is seriously wrong
     * (e.g. a JFlex bug producing a faulty scanner etc.).
     * <p/>
     * Usual syntax/scanner level error handling should be done
     * in error fallback rules.
     *
     * @param errorCode the code of the errormessage to display
     */
    private void zzScanError(int errorCode) {
        String message;
        try {
            message = ZZ_ERROR_MSG[errorCode];
        } catch (ArrayIndexOutOfBoundsException e) {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }


    /**
     * Pushes the specified amount of characters back into the input stream.
     * <p/>
     * They will be read again by then next call of the scanning method
     *
     * @param number the number of characters to be read again.
     *               This number must not be greater than yylength()!
     */
    public void yypushback(int number) {
        if (number > yylength())
            zzScanError(ZZ_PUSHBACK_2BIG);

        zzMarkedPos -= number;
    }


    /**
     * Resumes scanning until the next regular expression is matched,
     * the end of input is encountered or an I/O-Error occurs.
     *
     * @return the next token
     * @throws java.io.IOException if any I/O-Error occurs
     */
    public IElementType advance() throws java.io.IOException {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        CharSequence zzBufferL = zzBuffer;
        char[] zzBufferArrayL = zzBufferArray;
        char[] zzCMapL = ZZ_CMAP;

        int[] zzTransL = ZZ_TRANS;
        int[] zzRowMapL = ZZ_ROWMAP;
        int[] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
            zzMarkedPosL = zzMarkedPos;

            if (zzMarkedPosL > zzStartRead) {
                switch ((zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL - 1] : zzBufferL.charAt(zzMarkedPosL - 1))) {
                    case '\n':
                    case '\u000B':
                    case '\u000C':
                    case '\u0085':
                    case '\u2028':
                    case '\u2029':
                        zzAtBOL = true;
                        break;
                    case '\r':
                        if (zzMarkedPosL < zzEndReadL)
                            zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
                        else if (zzAtEOF)
                            zzAtBOL = false;
                        else {
                            boolean eof = zzRefill();
                            zzMarkedPosL = zzMarkedPos;
                            zzEndReadL = zzEndRead;
                            zzBufferL = zzBuffer;
                            if (eof)
                                zzAtBOL = false;
                            else
                                zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
                        }
                        break;
                    default:
                        zzAtBOL = false;
                }
            }
            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            if (zzAtBOL)
                zzState = ZZ_LEXSTATE[zzLexicalState + 1];
            else
                zzState = ZZ_LEXSTATE[zzLexicalState];


            zzForAction:
            {
                while (true) {

                    if (zzCurrentPosL < zzEndReadL)
                        zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
                    else if (zzAtEOF) {
                        zzInput = YYEOF;
                        break zzForAction;
                    } else {
                        // store back cached positions
                        zzCurrentPos = zzCurrentPosL;
                        zzMarkedPos = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL = zzCurrentPos;
                        zzMarkedPosL = zzMarkedPos;
                        zzBufferL = zzBuffer;
                        zzEndReadL = zzEndRead;
                        if (eof) {
                            zzInput = YYEOF;
                            break zzForAction;
                        } else {
                            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
                        }
                    }
                    int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
                    if (zzNext == -1) break zzForAction;
                    zzState = zzNext;

                    int zzAttributes = zzAttrL[zzState];
                    if ((zzAttributes & 1) == 1) {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ((zzAttributes & 8) == 8) break zzForAction;
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
                case 1:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [41] { a=101; return YAML_Whitespace; }");
                {
                    a = 101;
                    return YAML_Whitespace;
                }
                case 20:
                    break;
                case 11:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [65] { return YAML_Key; }");
                {
                    return YAML_Key;
                }
                case 21:
                    break;
                case 2:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [82] { yybegin(IN_PLAIN_FLOW); }");
                {
                    yybegin(IN_PLAIN_FLOW);
                }
                case 22:
                    break;
                case 15:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [91] { a=307; retryInState(YYINITIAL); return YAML_Scalar; }");
                {
                    a = 307;
                    retryInState(YYINITIAL);
                    return YAML_Scalar;
                }
                case 23:
                    break;
                case 17:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [38] { return YAML_Comment; }");
                {
                    return YAML_Comment;
                }
                case 24:
                    break;
                case 18:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [44] { return YAML_Directive; }");
                {
                    return YAML_Directive;
                }
                case 25:
                    break;
                case 16:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [96] { a=308; retryInState(YYINITIAL); return YAML_Scalar; }");
                {
                    a = 308;
                    retryInState(YYINITIAL);
                    return YAML_Scalar;
                }
                case 26:
                    break;
                case 12:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [68] { return YAML_Value; }");
                {
                    return YAML_Value;
                }
                case 27:
                    break;
                case 8:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [58] { return YAML_FlowMappingStart; }");
                {
                    return YAML_FlowMappingStart;
                }
                case 28:
                    break;
                case 7:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [55] { return YAML_FlowSequenceEnd; }");
                {
                    return YAML_FlowSequenceEnd;
                }
                case 29:
                    break;
                case 9:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [59] { return YAML_FlowMappingEnd; }");
                {
                    return YAML_FlowMappingEnd;
                }
                case 30:
                    break;
                case 10:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [62] { return YAML_FlowEntry; }");
                {
                    return YAML_FlowEntry;
                }
                case 31:
                    break;
                case 6:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [53] { return YAML_FlowSequenceStart; }");
                {
                    return YAML_FlowSequenceStart;
                }
                case 32:
                    break;
                case 19:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [47] { return YAML_DocumentStart; }");
                {
                    return YAML_DocumentStart;
                }
                case 33:
                    break;
                case 3:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [87] { return YAML_Error; }");
                {
                    return YAML_Error;
                }
                case 34:
                    break;
                case 5:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [37] { a=100; return YAML_Whitespace; }");
                {
                    a = 100;
                    return YAML_Whitespace;
                }
                case 35:
                    break;
                case 4:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [50] { return YAML_BlockEntry; }");
                {
                    return YAML_BlockEntry;
                }
                case 36:
                    break;
                case 14:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [93] {  }");
                {
                }
                case 37:
                    break;
                case 13:
                    System.out.println("match: --" + yytext() + "--");
                    System.out.println("action [77] { return YAML_Scalar; }");
                {
                    return YAML_Scalar;
                }
                case 38:
                    break;
                default:
                    if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
                        zzAtEOF = true;
                        switch (zzLexicalState) {
                            case IN_PLAIN: {
                                System.out.println("match: <<EOF>>");
                                System.out.println("action [92] { a=307; yybegin(YYINITIAL); return YAML_Scalar; }");
                                a = 307;
                                yybegin(YYINITIAL);
                                return YAML_Scalar;
                            }
                            case 38:
                                break;
                            case IN_PLAIN_FLOW: {
                                System.out.println("match: <<EOF>>");
                                System.out.println("action [98] { a=307; yybegin(YYINITIAL); return YAML_Scalar; }");
                                a = 307;
                                yybegin(YYINITIAL);
                                return YAML_Scalar;
                            }
                            case 39:
                                break;
                            default:
                                return null;
                        }
                    } else {
                        zzScanError(ZZ_NO_MATCH);
                    }
            }
        }
    }

    /**
     * Runs the scanner on input files.
     * <p/>
     * This main method is the debugging routine for the scanner.
     * It prints debugging information about each returned token to
     * System.out until the end of file is reached, or an error occured.
     *
     * @param argv the command line, contains the filenames to run
     *             the scanner on.
     */
    public static void main(String argv[]) {
        if (argv.length == 0) {
            System.out.println("Usage : java YamlFlexLexer <inputfile>");
        } else {
            for (int i = 0; i < argv.length; i++) {
                YamlFlexLexer scanner = null;
                try {
                    scanner = new YamlFlexLexer(new java.io.FileReader(argv[i]));
                    do {
                        System.out.println(scanner.advance());
                    } while (!scanner.zzAtEOF);

                } catch (java.io.FileNotFoundException e) {
                    System.out.println("File not found : \"" + argv[i] + "\"");
                } catch (java.io.IOException e) {
                    System.out.println("IO error scanning file \"" + argv[i] + "\"");
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println("Unexpected exception:");
                    e.printStackTrace();
                }
            }
        }
    }


}
