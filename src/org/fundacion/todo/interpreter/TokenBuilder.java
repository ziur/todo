package org.fundacion.todo.interpreter;

import org.fundacion.todo.interpreter.token.LiteralToken;

public class TokenBuilder {
    public static Token buildLiteral(String literal) {
        return new LiteralToken(literal, TokenType.LITERAL);
    }

    public static Token buildPropertySeparator() {
    }

    public static Token buildString(String text) {
    }
}
