package org.fundacion.todo.interpreter;

import org.fundacion.todo.interpreter.imp.ScannerImp;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ScannerTest {

    @Test
    void evaluateSimpleExpression() {
        String input = "add \"my zuper task\"";
        Scanner scanner = new ScannerImp(input);
        assertEquals(Arrays.asList(TokenType.LITERAL, TokenType.STRING), scanner.getTokens());

    }

    @Test
    void evaluateAddCommandWithDescription() {
        String input = "add \"my zuper task\" priority:high due:tomorrow";
        Scanner scanner = new ScannerImp(input);
        List<Token> expectedTokens = Arrays.asList(TokenBuilder.buildLiteral("add"), TokenBuilder.buildString("\"my zuper task\""), TokenBuilder.buildLiteral("priority"), TokenBuilder.buildPropertySeparator(), TokenBuilder.buildLiteral("high"));
        assertIterableEquals(,
                scanner.getTokens());

    }

    @Test
    void evaluateAddCommandWithProperty() {
        String input = "add \"my zuper task\" priority:high due:tomorrow";
        Scanner scanner = new ScannerImp(input);
        assertEquals(Arrays.asList(TokenBuilder.buildLiteral("add"), TokenBuilder.buildString("\"my zuper task\""), TokenBuilder.buildLiteral("priority"), TokenBuilder.buildPropertySeparator(), TokenBuilder.buildLiteral("high")), scanner.getTokens());

    }

    @Test
    void evaluateCommandWithMultipleProperties() {
        String input = "add \"my zuper task\" priority:high due:tomorrow";
        Scanner scanner = new ScannerImp(input);
        assertEquals(Arrays.asList(TokenType.LITERAL, TokenType.STRING, TokenType.LITERAL, TokenType.PROPERTY_SEPARATOR, TokenType.LITERAL, TokenType.LITERAL, TokenType.PROPERTY_SEPARATOR, TokenType.LITERAL), scanner.getTokens());

    }

    @Test
    void evaluateCommandWithFilters() {
        String input = "priority:high modify due:tomorrow";
        Scanner scanner = new ScannerImp(input);
        assertEquals(Arrays.asList(TokenType.LITERAL, TokenType.PROPERTY_SEPARATOR, TokenType.LITERAL, TokenType.LITERAL, TokenType.LITERAL, TokenType.PROPERTY_SEPARATOR, TokenType.LITERAL), scanner.getTokens());
    }
}