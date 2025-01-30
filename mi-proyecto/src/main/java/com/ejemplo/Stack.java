/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * @author: Luis Chon, Andrés Ismalej y Hugo Mendez.
 * Creación: 27/01/25
 * Última modificación: 29/01/25
 * @FileName: Stack.java
 * Descripción: Clase Interfaz que define las operaciones básicas de una pila (Stack).
 */
package com.ejemplo;

/**@param Tipo de elemento almacenado en el stack*/ 

public interface Stack<E>{

    /**metodo para agregar los valores al stack.
    @param El valor que se va agregar
    */
    public void push(E item);

    /**Metodo para eliminar los valores del stack.
    @return El valor que se va eliminar del stack.
    @throws Expresion incorrecta si el stack esta vacio.
    */
    public E pop();

    /**Obtiene el valor mas reciente del stack sin eliminarlo.
    @return Despliega el valor mas reciente del stack.
    @throws Expresion incorrecta si el stack esta vacio.
    */
    public E peek();

    /**Hace revision si el stack se encuentra vacio.
    @return Se cumple si el stack se encuentra vacio.
    */
    public boolean empty();

    /**Obtiene la cantidad de elementos en el stack.
    @return Despliega la cantidad de elementos en el stack.
    */
    public int size();  
}
