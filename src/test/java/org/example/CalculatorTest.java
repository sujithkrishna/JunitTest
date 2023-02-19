package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void addTest1(){
        String messageIfAssertFails = "Expected NullPointerException";
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.add(null, 4);
        }, messageIfAssertFails);
    }

    @Test
    void addTest2(){
        String messageIfAssertFails = "Expected NullPointerException";
        Exception exception = assertThrows(NullPointerException.class, () -> {
            Calculator.add(null, 4);
        }, messageIfAssertFails);

        String expectedExceptionMessage = "Method arguments cannot be null";
        assertEquals(expectedExceptionMessage, exception.getMessage());
    }

    @Test
    void addTestAdd(){
        assertEquals(Calculator.add(8, 4), 12);
    }
}