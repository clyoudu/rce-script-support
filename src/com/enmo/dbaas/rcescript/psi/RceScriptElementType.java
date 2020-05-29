package com.enmo.dbaas.rcescript.psi;

import com.enmo.dbaas.rcescript.RceScriptLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/8/20 17:55
 * @description RceScriptElementType
 */
public class RceScriptElementType extends IElementType {
    public RceScriptElementType(@NotNull String debugName) {
        super(debugName, RceScriptLanguage.INSTANCE);
    }
}
