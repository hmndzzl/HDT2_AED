package com.ejemplo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class TestCalculadora {

    @Test
    public void testSuma() {
        assertEquals(5, Operaciones("+", 2, 3));
    }
    
    @Test
    public void testResta() {
        assertEquals(1, Operaciones("-", 4, 3));
    }
    
    @Test
    public void testMultiplicacion() {
        assertEquals(6, Operaciones("*", 2, 3));
    }
    
    @Test
    public void testDivision() {
        assertEquals(2, Operaciones("/", 6, 3));
    }
    
    @Test
    public void testModulo() {
        assertEquals(1, Operaciones("%", 5, 2));
    }
    
    @Test
    public void testDivisionPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Operaciones("/", 5, 0);
        });
        assertEquals("Sintaxis error", exception.getMessage());
    }
    
    @Test
    public void testOperadorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Operaciones("^", 2, 3);
        });
        assertEquals("Operador invalido: ", exception.getMessage());
    }
    
    private int Operaciones(String operator, int OperandoA, int OperandoB) {
        switch(operator) {
            case "+": return OperandoA + OperandoB;
            case "-": return OperandoA - OperandoB;
            case "*": return OperandoA * OperandoB;
            case "/":
                if (OperandoB == 0) throw new IllegalArgumentException("Sintaxis error");
                return OperandoA / OperandoB;
            case "%": return OperandoA % OperandoB;
            default: throw new IllegalArgumentException("Operador invalido: ");
        }
    }
}