package org.fundacion.todo.interpreter.token;

import org.fundacion.todo.interpreter.Token;
import org.fundacion.todo.interpreter.TokenType;

public class LiteralToken extends AbstractValueToken {

    public LiteralToken(String value, TokenType type) {
        super(value, type);
    }
}
