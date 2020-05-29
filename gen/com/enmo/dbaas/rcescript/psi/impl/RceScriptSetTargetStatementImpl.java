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

public class RceScriptSetTargetStatementImpl extends ASTWrapperPsiElement implements RceScriptSetTargetStatement {

  public RceScriptSetTargetStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RceScriptVisitor visitor) {
    visitor.visitSetTargetStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RceScriptVisitor) accept((RceScriptVisitor)visitor);
    else super.accept(visitor);
  }

}
