package com.enmo.dbaas.rcescript;

import com.intellij.lexer.FlexAdapter;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/8/21 16:39
 * @description RceScriptLexerAdapter
 */
public class RceScriptLexerAdapter extends FlexAdapter {
    public RceScriptLexerAdapter() {
        super(new RceScriptLexer(null));
    }
}
