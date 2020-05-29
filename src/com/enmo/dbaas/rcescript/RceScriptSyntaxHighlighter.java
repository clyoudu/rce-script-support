package com.enmo.dbaas.rcescript;

import com.enmo.dbaas.rcescript.psi.RceScriptTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/8/21 18:39
 * @description RceScriptSyntaxHighlighter
 */
public class RceScriptSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEY =
            createTextAttributesKey("RCE_SCRIPT_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("RCE_SCRIPT_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey CONSTANTS =
            createTextAttributesKey("RCE_SCRIPT_CONSTANTS", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey VARIABLES =
            createTextAttributesKey("RCE_SCRIPT_VARIABLES", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey STRINGS =
            createTextAttributesKey("RCE_SCRIPT_STRINGS", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey CONDITIONS =
            createTextAttributesKey("RCE_SCRIPT_CONDITIONS", DefaultLanguageHighlighterColors.DOC_COMMENT_TAG_VALUE);
    public static final TextAttributesKey NUMBERS =
            createTextAttributesKey("RCE_SCRIPT_NUMBERS", DefaultLanguageHighlighterColors.NUMBER);

    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] CONSTANTS_KEYS = new TextAttributesKey[]{CONSTANTS};
    private static final TextAttributesKey[] VARIABLE_KEYS = new TextAttributesKey[]{VARIABLES};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRINGS};
    private static final TextAttributesKey[] CONDITION_KEYS = new TextAttributesKey[]{CONDITIONS};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBERS};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new RceScriptLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType iElementType) {
        if (iElementType.equals(RceScriptTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (iElementType.equals(RceScriptTypes.KEY_SET)
                || iElementType.equals(RceScriptTypes.KEY_EXEC)
                || iElementType.equals(RceScriptTypes.KEY_VAR)
                || iElementType.equals(RceScriptTypes.KEY_EXECUTE)
                || iElementType.equals(RceScriptTypes.KEY_IF)
                || iElementType.equals(RceScriptTypes.KEY_ENDIF)
                || iElementType.equals(RceScriptTypes.KEY_BREAK)
                || iElementType.equals(RceScriptTypes.KEY_SLEEP)
                || iElementType.equals(RceScriptTypes.KEY_FOR)
                || iElementType.equals(RceScriptTypes.KEY_ENDFOR)
                || iElementType.equals(RceScriptTypes.KEY_TARGET)
                || iElementType.equals(RceScriptTypes.KEY_CONNECT)
                || iElementType.equals(RceScriptTypes.KEY_RETURN)
                || iElementType.equals(RceScriptTypes.KEY_PRINT)
                ) {
            return KEY_KEYS;
        } else if (iElementType.equals(RceScriptTypes.KEY_EXEC_STATUS)
                || iElementType.equals(RceScriptTypes.KEY_CONTROL_STATUS)) {
            return CONSTANTS_KEYS;
        } else if (iElementType.equals(RceScriptTypes.VARIABLE_NAME)) {
            return VARIABLE_KEYS;
        } else if (iElementType.equals(RceScriptTypes.VARIABLE_VALUE)) {
            return STRING_KEYS;
        } else if (iElementType.equals(RceScriptTypes.IF_CONDITION)) {
            return CONDITION_KEYS;
        } else if (iElementType.equals(RceScriptTypes.NUMBER)) {
            return NUMBER_KEYS;
        }

        return new TextAttributesKey[0];

    }
}
