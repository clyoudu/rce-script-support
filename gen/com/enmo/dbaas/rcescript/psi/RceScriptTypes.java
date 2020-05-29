// This is a generated file. Not intended for manual editing.
package com.enmo.dbaas.rcescript.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.enmo.dbaas.rcescript.psi.impl.*;
import com.intellij.psi.util.PsiUtilCore;

public interface RceScriptTypes {

    IElementType BREAK_STATEMENT = new RceScriptElementType("BREAK_STATEMENT");
    IElementType CONNECT_STATEMENT = new RceScriptElementType("CONNECT_STATEMENT");
    IElementType EXECUTE_STATEMENT = new RceScriptElementType("EXECUTE_STATEMENT");
    IElementType FOR_BLOCK = new RceScriptElementType("FOR_BLOCK");
    IElementType IF_BLOCK = new RceScriptElementType("IF_BLOCK");
    IElementType PRINT_STATEMENT = new RceScriptElementType("PRINT_STATEMENT");
    IElementType RETURN_STATEMENT = new RceScriptElementType("RETURN_STATEMENT");
    IElementType SET_CONTROL = new RceScriptElementType("SET_CONTROL");
    IElementType SET_TARGET_STATEMENT = new RceScriptElementType("SET_TARGET_STATEMENT");
    IElementType SET_VAR_STATEMENT = new RceScriptElementType("SET_VAR_STATEMENT");
    IElementType SLEEP_STATEMENT = new RceScriptElementType("SLEEP_STATEMENT");

    IElementType COMMENT = new RceScriptTokenType("COMMENT");
    IElementType CRLF = new RceScriptTokenType("CRLF");
    IElementType IF_CONDITION = new RceScriptTokenType("IF_CONDITION");
    IElementType KEY_BREAK = new RceScriptTokenType("KEY_BREAK");
    IElementType KEY_CONNECT = new RceScriptTokenType("KEY_CONNECT");
    IElementType KEY_CONTROL_STATUS = new RceScriptTokenType("KEY_CONTROL_STATUS");
    IElementType KEY_ENDFOR = new RceScriptTokenType("KEY_ENDFOR");
    IElementType KEY_ENDIF = new RceScriptTokenType("KEY_ENDIF");
    IElementType KEY_EXEC = new RceScriptTokenType("KEY_EXEC");
    IElementType KEY_EXECUTE = new RceScriptTokenType("KEY_EXECUTE");
    IElementType KEY_EXEC_STATUS = new RceScriptTokenType("KEY_EXEC_STATUS");
    IElementType KEY_FOR = new RceScriptTokenType("KEY_FOR");
    IElementType KEY_IF = new RceScriptTokenType("KEY_IF");
    IElementType KEY_PRINT = new RceScriptTokenType("KEY_PRINT");
    IElementType KEY_RETURN = new RceScriptTokenType("KEY_RETURN");
    IElementType KEY_SET = new RceScriptTokenType("KEY_SET");
    IElementType KEY_SLEEP = new RceScriptTokenType("KEY_SLEEP");
    IElementType KEY_TARGET = new RceScriptTokenType("KEY_TARGET");
    IElementType KEY_VAR = new RceScriptTokenType("KEY_VAR");
    IElementType NUMBER = new RceScriptTokenType("NUMBER");
    IElementType RCE_PACHAGE = new RceScriptTokenType("RCE_PACHAGE");
    IElementType SEPARATOR = new RceScriptTokenType("SEPARATOR");
    IElementType VARIABLE_NAME = new RceScriptTokenType("VARIABLE_NAME");
    IElementType VARIABLE_VALUE = new RceScriptTokenType("VARIABLE_VALUE");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == BREAK_STATEMENT) {
                return new RceScriptBreakStatementImpl(node);
            } else if (type == CONNECT_STATEMENT) {
                return new RceScriptConnectStatementImpl(node);
            } else if (type == EXECUTE_STATEMENT) {
                return new RceScriptExecuteStatementImpl(node);
            } else if (type == FOR_BLOCK) {
                return new RceScriptForBlockImpl(node);
            } else if (type == IF_BLOCK) {
                return new RceScriptIfBlockImpl(node);
            } else if (type == PRINT_STATEMENT) {
                return new RceScriptPrintStatementImpl(node);
            } else if (type == RETURN_STATEMENT) {
                return new RceScriptReturnStatementImpl(node);
            } else if (type == SET_CONTROL) {
                return new RceScriptSetControlImpl(node);
            } else if (type == SET_TARGET_STATEMENT) {
                return new RceScriptSetTargetStatementImpl(node);
            } else if (type == SET_VAR_STATEMENT) {
                return new RceScriptSetVarStatementImpl(node);
            } else if (type == SLEEP_STATEMENT) {
                return new RceScriptSleepStatementImpl(node);
            }
            try {
                PsiElement var10000 = PsiUtilCore.NULL_PSI_ELEMENT;
                if (PsiUtilCore.NULL_PSI_ELEMENT == null) {
                    throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "com/intellij/lang/xml/XMLParserDefinition", "createElement"));
                } else {
                    return var10000;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }
}
