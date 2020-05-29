// This is a generated file. Not intended for manual editing.
package com.enmo.dbaas.rcescript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.enmo.dbaas.rcescript.psi.RceScriptTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.enmo.dbaas.rcescript.psi.*;

public class RceScriptForBlockImpl extends ASTWrapperPsiElement implements RceScriptForBlock {

  public RceScriptForBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RceScriptVisitor visitor) {
    visitor.visitForBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RceScriptVisitor) accept((RceScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RceScriptBreakStatement> getBreakStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptBreakStatement.class);
  }

  @Override
  @NotNull
  public List<RceScriptConnectStatement> getConnectStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptConnectStatement.class);
  }

  @Override
  @NotNull
  public List<RceScriptExecuteStatement> getExecuteStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptExecuteStatement.class);
  }

  @Override
  @NotNull
  public List<RceScriptForBlock> getForBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptForBlock.class);
  }

  @Override
  @NotNull
  public List<RceScriptIfBlock> getIfBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptIfBlock.class);
  }

  @Override
  @NotNull
  public List<RceScriptPrintStatement> getPrintStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptPrintStatement.class);
  }

  @Override
  @NotNull
  public List<RceScriptReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptReturnStatement.class);
  }

  @Override
  @NotNull
  public List<RceScriptSetControl> getSetControlList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptSetControl.class);
  }

  @Override
  @NotNull
  public List<RceScriptSetTargetStatement> getSetTargetStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptSetTargetStatement.class);
  }

  @Override
  @NotNull
  public List<RceScriptSetVarStatement> getSetVarStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptSetVarStatement.class);
  }

  @Override
  @NotNull
  public List<RceScriptSleepStatement> getSleepStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RceScriptSleepStatement.class);
  }

}
