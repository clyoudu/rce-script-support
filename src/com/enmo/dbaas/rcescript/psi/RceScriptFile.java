package com.enmo.dbaas.rcescript.psi;

import com.enmo.dbaas.rcescript.RceScriptFileType;
import com.enmo.dbaas.rcescript.RceScriptLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/8/21 16:45
 * @description RceScriptFile
 */
public class RceScriptFile extends PsiFileBase {

    public RceScriptFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, RceScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return RceScriptFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "RceScript File";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
