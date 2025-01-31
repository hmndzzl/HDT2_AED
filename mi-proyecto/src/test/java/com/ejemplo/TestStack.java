/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * @author: Luis Chon, Andrés Ismalej y Hugo Mendez.
 * Creación: 30/01/25
 * Última modificación: 30/01/25
 * @FileName: TestStack.java
 */
package com.ejemplo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestStack {

    @Test
    public void testPushAndPop() {
        VectorStack<Integer> stack = new VectorStack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(20, (int) stack.pop());
        assertEquals(10, (int) stack.pop());
    }

    @Test
    public void testPeek() {
        VectorStack<Integer> stack = new VectorStack<>();
        stack.push(30);
        stack.push(40);
        assertEquals(40, (int) stack.peek());
        assertEquals(40, (int) stack.pop());
        assertEquals(30, (int) stack.peek());
    }

    @Test
    public void testEmpty() {
        VectorStack<String> stack = new VectorStack<>();
        assertTrue(stack.empty());
        stack.push("Hello");
        assertFalse(stack.empty());
        stack.pop();
        assertTrue(stack.empty());
    }

    @Test
    public void testSize() {
        VectorStack<Double> stack = new VectorStack<>();
        assertEquals(0, stack.size());
        stack.push(1.1);
        stack.push(2.2);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }

}