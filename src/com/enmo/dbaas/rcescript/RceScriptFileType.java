package com.enmo.dbaas.rcescript;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Create by IntelliJ IDEA
 *
 * @author chenlei
 * @dateTime 2019/8/16 16:33
 * @description RceScriptFileType
 */
public class RceScriptFileType extends LanguageFileType {

    public static final RceScriptFileType INSTANCE = new RceScriptFileType();

    protected RceScriptFileType() {
        super(RceScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "script file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Rce script file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "script";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return RceScriptIcons.ICON;
    }
}
