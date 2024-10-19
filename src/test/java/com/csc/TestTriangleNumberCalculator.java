package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

    TriangleNumberCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new TriangleNumberCalculator();
    }

    @Test
    public void testValue() {
        assertEquals(1, calculator.value(1));
        assertEquals(3, calculator.value(2));
        assertEquals(6, calculator.value(3));
        assertEquals(0, calculator.value(0)); // Assuming this is expected
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.value(-1); // Test for negative input
        });
    }

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(3, 4));
        assertEquals(21, calculator.add(5, 6));
        assertEquals(-1, calculator.add(-4, 3));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, calculator.subtract(4, 1));
        assertEquals(0, calculator.subtract(3, 3));
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(36, calculator.multiply(6, 6));
        assertEquals(-18, calculator.multiply(-3, 6));
    }

    @Test
    public void testDivide() {
        assertEquals(1.5, calculator.divide(3, 2), 0.001);
        assertEquals(3.0, calculator.divide(3, 1), 0.001);
        assertEquals(-1.5, calculator.divide(-3, 2), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });
    }
}
