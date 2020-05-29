package com.enmo.dbaas.rcescript;

import com.enmo.dbaas.rcescript.constants.GlobalConstants;
import com.intellij.lang.Language;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/8/16 16:07
 * @description RceScriptLanguage
 */
public class RceScriptLanguage extends Language {

    public static final RceScriptLanguage INSTANCE = new RceScriptLanguage();

    protected RceScriptLanguage() {
        super(GlobalConstants.LANGUAGE_NAME);
    }
}
