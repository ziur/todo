package org.fundacion.todo.interpreter.token;

import org.fundacion.todo.interpreter.Token;
import org.fundacion.todo.interpreter.TokenType;

public class AbstractValueToken implements Token {
    private final String value;
    private final TokenType type;

    public AbstractValueToken(String value, TokenType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public TokenType getType() {
        return type;
    }
}
