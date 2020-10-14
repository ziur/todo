package org.fundacion.todo.interpreter;



public enum TokenType {
    PROPERTY_SEPARATOR(":"),
    ADD("add"),
    MODIFY("modify"),
    DELETE("delete"),
    LIST("delete"),
    EXPORT("export"),


     LITERAL("\\w*"), STRING("[\\w\\d]*");

    TokenType(String token) {

    }
}


