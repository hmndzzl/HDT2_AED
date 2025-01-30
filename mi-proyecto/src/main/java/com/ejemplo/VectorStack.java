/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * @author: Luis Chon, Andrés Ismalej y Hugo Mendez.
 * Creación: 27/01/25
 * Última modificación: 29/01/25
 * @FileName: VectorStack.java
 * Descripción: Clase VectorStack que proporciona operaciones estándar de una pila, como push, pop, peek, empty y size.
 */
package com.ejemplo;

import java.util.ArrayList; //ArrayList para almacenar los datos que se obtienen del archivo .txt

public class VectorStack<E> implements Stack<E> {
    private ArrayList<E> elementos;

    //Constructor para iniciar stack
    public VectorStack() {
        this.elementos = new ArrayList<>();
    }

    //Override de los metodos de Stack

    //Override del metodo push
    @Override
    public void push(E item) {
        elementos.add(item);
    }

    //Override del metodo pop
    @Override
    public E pop() {
        if (empty()) {
            throw new IllegalStateException("Stack está vacío");
        }
        return elementos.remove(elementos.size() - 1);
    }
    
    //Override del metodo peak
    @Override
    public E peek() {
        if (empty()) {
            throw new IllegalStateException("Stack está vacío");
        }
        return elementos.get(elementos.size() - 1);
    }
    
    //Override del metodo isEmpty
    @Override
    public boolean empty() {
        return elementos.isEmpty();
    }

    //Override del metodo size
    @Override
    public int size() {
        return elementos.size();
    }

}
