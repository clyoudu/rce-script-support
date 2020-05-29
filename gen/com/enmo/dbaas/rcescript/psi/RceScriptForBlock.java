// This is a generated file. Not intended for manual editing.
package com.enmo.dbaas.rcescript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RceScriptForBlock extends PsiElement {

  @NotNull
  List<RceScriptBreakStatement> getBreakStatementList();

  @NotNull
  List<RceScriptConnectStatement> getConnectStatementList();

  @NotNull
  List<RceScriptExecuteStatement> getExecuteStatementList();

  @NotNull
  List<RceScriptForBlock> getForBlockList();

  @NotNull
  List<RceScriptIfBlock> getIfBlockList();

  @NotNull
  List<RceScriptPrintStatement> getPrintStatementList();

  @NotNull
  List<RceScriptReturnStatement> getReturnStatementList();

  @NotNull
  List<RceScriptSetControl> getSetControlList();

  @NotNull
  List<RceScriptSetTargetStatement> getSetTargetStatementList();

  @NotNull
  List<RceScriptSetVarStatement> getSetVarStatementList();

  @NotNull
  List<RceScriptSleepStatement> getSleepStatementList();

}
