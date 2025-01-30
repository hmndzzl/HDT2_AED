/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * @author: Luis Chon, Andrés Ismalej y Hugo Mendez.
 * Creación: 27/01/25
 * Última modificación: 29/01/25
 * @FileName: Main.java
 * Descripción: Clase Main que inicializa el programa abriendo el archivo .txt y crea una pila de enteros.
 */
package com.ejemplo;

import java.io.BufferedReader; //Biblioteca con el proposito de que haga lectura de la primera linea del archivo .txt
import java.io.FileReader; //Abre el archivo .txt
import java.util.Objects; //Comprueba la nulidad.

public class Main {
    public static void main(String[] args) throws Exception {
        //Abre el archivo .txt y lee la primera linea de este para obtener la expresion postfix.
        BufferedReader reader = new BufferedReader(new FileReader("Value.txt")); 
        String expression = reader.readLine();
        reader.close();

        //Crea una pila de enteros y una instancia de la clase PostfixCalc para evaluar la expresion postfix.
        Stack<Integer> stack = new VectorStack<>();
        PostfixCalc calc = new PostfixCalc(stack);
        int Resultado = calc.evaluar(Objects.requireNonNull(expression)); 
        System.out.println("Resultado: " + Resultado); //Retorna el resultado de la expresion postfix

    }
}
