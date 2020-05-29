package com.enmo.dbaas.rcescript;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.enmo.dbaas.rcescript.psi.RceScriptTypes;
import com.intellij.psi.TokenType;

%%

%class RceScriptLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

INLINE_WHITE_SPACE=[\ \t\f]
KEY_SET=set
KEY_EXEC=exec
KEY_EXECUTE=execute
KEY_TARGET=target
KEY_IF=if
KEY_ENDIF=endif
KEY_BREAK=break
KEY_SLEEP=sleep
KEY_FOR=for
KEY_ENDFOR=endfor
KEY_RETURN=return
KEY_CONNECT=connect
KEY_PRINT=print
KEY_EXEC_STATUS=(failed|successful)
KEY_CONTROL_STATUS=(continue|stop)
KEY_VAR=var
NUMBER=\d+
CRLF=\R
WHITE_SPACE=[\ \n\t\f]
VARIABLE_NAME=([a-z]|[A-Z])+([a-z]|[A-Z]|[0-9]|_)*
VARIABLE_VALUE=((\"[^\"]*\")|(`.*[^`]*`)|(\$\{\{[^\}]*\}\})|(\$\{[^\}]*\}))
SEPARATOR="="
COMPAIRE_OPERATOR=("==")|("!=")|(">=")|("<=")|(">")|("<")
LOGICAL_OPERATOR=(and)|("or")|("not")|("||")|("&&")
SINGLE_IF_CONDITION=({VARIABLE_NAME}|{VARIABLE_VALUE}){INLINE_WHITE_SPACE}*{COMPAIRE_OPERATOR}{INLINE_WHITE_SPACE}*({VARIABLE_VALUE}|({VARIABLE_NAME}))
IF_CONDITION={SINGLE_IF_CONDITION}({INLINE_WHITE_SPACE}+{LOGICAL_OPERATOR}{INLINE_WHITE_SPACE}+{SINGLE_IF_CONDITION})*
END_OF_LINE_COMMENT="#"[^\r\n]*
RCE_PACHAGE={VARIABLE_NAME}(\.{VARIABLE_NAME})+

%state WAITING_VALUE

%%

<YYINITIAL> {KEY_SET}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_SET; }
<YYINITIAL> {KEY_EXEC}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_EXEC; }
<YYINITIAL> {KEY_EXEC_STATUS}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_EXEC_STATUS; }
<YYINITIAL> {KEY_CONTROL_STATUS}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_CONTROL_STATUS; }
<YYINITIAL> {KEY_VAR}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_VAR; }
<YYINITIAL> {KEY_TARGET}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_TARGET; }
<YYINITIAL> {KEY_IF}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_IF; }
<YYINITIAL> {KEY_ENDIF}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_ENDIF; }
<YYINITIAL> {KEY_EXECUTE}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_EXECUTE; }
<YYINITIAL> {KEY_BREAK}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_BREAK; }
<YYINITIAL> {KEY_SLEEP}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_SLEEP; }
<YYINITIAL> {KEY_FOR}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_FOR; }
<YYINITIAL> {KEY_ENDFOR}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_ENDFOR; }
<YYINITIAL> {NUMBER}                           { yybegin(YYINITIAL); return RceScriptTypes.NUMBER; }
<YYINITIAL> {KEY_RETURN}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_RETURN; }
<YYINITIAL> {KEY_CONNECT}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_CONNECT; }
<YYINITIAL> {KEY_PRINT}                           { yybegin(YYINITIAL); return RceScriptTypes.KEY_PRINT; }

<YYINITIAL> {VARIABLE_NAME}                           { yybegin(YYINITIAL); return RceScriptTypes.VARIABLE_NAME; }
<YYINITIAL> {SEPARATOR}                           { yybegin(YYINITIAL); return RceScriptTypes.SEPARATOR; }
<YYINITIAL> {VARIABLE_VALUE}                           { yybegin(YYINITIAL); return RceScriptTypes.VARIABLE_VALUE; }
<YYINITIAL> {RCE_PACHAGE}                           { yybegin(YYINITIAL); return RceScriptTypes.RCE_PACHAGE; }
<YYINITIAL> {IF_CONDITION}                           { yybegin(YYINITIAL); return RceScriptTypes.IF_CONDITION; }

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return RceScriptTypes.COMMENT; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
[^]                                                         { return TokenType.BAD_CHARACTER; }
