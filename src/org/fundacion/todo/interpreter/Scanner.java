package org.fundacion.todo.interpreter;

import java.util.Collection;

public interface Scanner {
    Collection<TokenType> getTokens();
}
