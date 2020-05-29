// This is a generated file. Not intended for manual editing.
package com.enmo.dbaas.rcescript.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.enmo.dbaas.rcescript.psi.RceScriptTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RceScriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t instanceof IFileElementType) {
      r = parse_root_(t, b, 0);
    }
    else {
      r = false;
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return RceScriptFile(b, l + 1);
  }

  /* ********************************************************** */
  // item_*
  static boolean RceScriptFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RceScriptFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RceScriptFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEY_BREAK
  public static boolean breakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStatement")) return false;
    if (!nextTokenIs(b, KEY_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY_BREAK);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KEY_CONNECT KEY_TARGET VARIABLE_NAME VARIABLE_NAME SEPARATOR (VARIABLE_VALUE|NUMBER)( VARIABLE_NAME SEPARATOR (VARIABLE_VALUE|NUMBER|VARIABLE_NAME))*
  public static boolean connectStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connectStatement")) return false;
    if (!nextTokenIs(b, KEY_CONNECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_CONNECT, KEY_TARGET, VARIABLE_NAME, VARIABLE_NAME, SEPARATOR);
    r = r && connectStatement_5(b, l + 1);
    r = r && connectStatement_6(b, l + 1);
    exit_section_(b, m, CONNECT_STATEMENT, r);
    return r;
  }

  // VARIABLE_VALUE|NUMBER
  private static boolean connectStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connectStatement_5")) return false;
    boolean r;
    r = consumeToken(b, VARIABLE_VALUE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // ( VARIABLE_NAME SEPARATOR (VARIABLE_VALUE|NUMBER|VARIABLE_NAME))*
  private static boolean connectStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connectStatement_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!connectStatement_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "connectStatement_6", c)) break;
    }
    return true;
  }

  // VARIABLE_NAME SEPARATOR (VARIABLE_VALUE|NUMBER|VARIABLE_NAME)
  private static boolean connectStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connectStatement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARIABLE_NAME, SEPARATOR);
    r = r && connectStatement_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VARIABLE_VALUE|NUMBER|VARIABLE_NAME
  private static boolean connectStatement_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connectStatement_6_0_2")) return false;
    boolean r;
    r = consumeToken(b, VARIABLE_VALUE);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, VARIABLE_NAME);
    return r;
  }

  /* ********************************************************** */
  // KEY_EXECUTE RCE_PACHAGE VARIABLE_NAME SEPARATOR (VARIABLE_VALUE|NUMBER)( VARIABLE_NAME SEPARATOR (VARIABLE_VALUE|NUMBER|VARIABLE_NAME))*
  public static boolean executeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "executeStatement")) return false;
    if (!nextTokenIs(b, KEY_EXECUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_EXECUTE, RCE_PACHAGE, VARIABLE_NAME, SEPARATOR);
    r = r && executeStatement_4(b, l + 1);
    r = r && executeStatement_5(b, l + 1);
    exit_section_(b, m, EXECUTE_STATEMENT, r);
    return r;
  }

  // VARIABLE_VALUE|NUMBER
  private static boolean executeStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "executeStatement_4")) return false;
    boolean r;
    r = consumeToken(b, VARIABLE_VALUE);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // ( VARIABLE_NAME SEPARATOR (VARIABLE_VALUE|NUMBER|VARIABLE_NAME))*
  private static boolean executeStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "executeStatement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!executeStatement_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "executeStatement_5", c)) break;
    }
    return true;
  }

  // VARIABLE_NAME SEPARATOR (VARIABLE_VALUE|NUMBER|VARIABLE_NAME)
  private static boolean executeStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "executeStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VARIABLE_NAME, SEPARATOR);
    r = r && executeStatement_5_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VARIABLE_VALUE|NUMBER|VARIABLE_NAME
  private static boolean executeStatement_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "executeStatement_5_0_2")) return false;
    boolean r;
    r = consumeToken(b, VARIABLE_VALUE);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, VARIABLE_NAME);
    return r;
  }

  /* ********************************************************** */
  // KEY_FOR NUMBER item_* KEY_ENDFOR
  public static boolean forBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forBlock")) return false;
    if (!nextTokenIs(b, KEY_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_FOR, NUMBER);
    r = r && forBlock_2(b, l + 1);
    r = r && consumeToken(b, KEY_ENDFOR);
    exit_section_(b, m, FOR_BLOCK, r);
    return r;
  }

  // item_*
  private static boolean forBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "forBlock_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEY_IF IF_CONDITION item_* KEY_ENDIF
  public static boolean ifBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifBlock")) return false;
    if (!nextTokenIs(b, KEY_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_IF, IF_CONDITION);
    r = r && ifBlock_2(b, l + 1);
    r = r && consumeToken(b, KEY_ENDIF);
    exit_section_(b, m, IF_BLOCK, r);
    return r;
  }

  // item_*
  private static boolean ifBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifBlock_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // COMMENT|setVarStatement|setTargetStatement|setControl|executeStatement|ifBlock|forBlock|breakStatement|sleepStatement|connectStatement|returnStatement|printStatement|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = setVarStatement(b, l + 1);
    if (!r) r = setTargetStatement(b, l + 1);
    if (!r) r = setControl(b, l + 1);
    if (!r) r = executeStatement(b, l + 1);
    if (!r) r = ifBlock(b, l + 1);
    if (!r) r = forBlock(b, l + 1);
    if (!r) r = breakStatement(b, l + 1);
    if (!r) r = sleepStatement(b, l + 1);
    if (!r) r = connectStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = printStatement(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // KEY_PRINT VARIABLE_VALUE
  public static boolean printStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "printStatement")) return false;
    if (!nextTokenIs(b, KEY_PRINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_PRINT, VARIABLE_VALUE);
    exit_section_(b, m, PRINT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KEY_RETURN VARIABLE_VALUE
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, KEY_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_RETURN, VARIABLE_VALUE);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KEY_SET KEY_EXEC KEY_EXEC_STATUS KEY_CONTROL_STATUS
  public static boolean setControl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setControl")) return false;
    if (!nextTokenIs(b, KEY_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_SET, KEY_EXEC, KEY_EXEC_STATUS, KEY_CONTROL_STATUS);
    exit_section_(b, m, SET_CONTROL, r);
    return r;
  }

  /* ********************************************************** */
  // KEY_SET KEY_TARGET VARIABLE_NAME
  public static boolean setTargetStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setTargetStatement")) return false;
    if (!nextTokenIs(b, KEY_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_SET, KEY_TARGET, VARIABLE_NAME);
    exit_section_(b, m, SET_TARGET_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KEY_SET KEY_VAR VARIABLE_NAME SEPARATOR VARIABLE_VALUE
  public static boolean setVarStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setVarStatement")) return false;
    if (!nextTokenIs(b, KEY_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_SET, KEY_VAR, VARIABLE_NAME, SEPARATOR, VARIABLE_VALUE);
    exit_section_(b, m, SET_VAR_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KEY_SLEEP NUMBER
  public static boolean sleepStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sleepStatement")) return false;
    if (!nextTokenIs(b, KEY_SLEEP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_SLEEP, NUMBER);
    exit_section_(b, m, SLEEP_STATEMENT, r);
    return r;
  }

}
