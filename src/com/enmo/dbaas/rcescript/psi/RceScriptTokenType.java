package com.enmo.dbaas.rcescript.psi;

import com.enmo.dbaas.rcescript.RceScriptLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/8/20 17:53
 * @description RceScriptTokenType
 */
public class RceScriptTokenType extends IElementType {
    public RceScriptTokenType(@NotNull String debugName) {
        super(debugName, RceScriptLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "RceScriptTokenType." + super.toString();
    }
}
