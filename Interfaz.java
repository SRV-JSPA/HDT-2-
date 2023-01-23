/*
Profesor: Douglas Leonel Barrios
Auxiliar: Fernanda Esquivel y Francisco Castillo
INTEGRANTES: 
José Santiago Pereira Alvarado, 22318
Gustavo Adolfo Cruz Bardales, 22779
Nancy Gabriela Mazariegos Molina, 22513
27/01/2023
Hoja de Trabajo 2
Curso: Algoritmos y Estructuras de datos
Sección: 20
*/

import java.util.EmptyStackException;

/**
 * Stack
 * 
 * Interface que representa a un Stack.
 */
public interface Stack<E> {

   /**
    * pre:
    * post: item is added to stack
    * will be popped next if no intervening push
    * 
    * @param item item to push to the stack.
    */
   public void push(E item);

   /**
    * pre: stack is not empty
    * post: most recently pushed item is removed and returned
    * 
    * @return the element in the top of the stack.
    * @throws EmptyStackException If the stack is empty.
    */
   public E pop() throws EmptyStackException;

   /**
    * pre: stack is not empty
    * post: top value (next to be popped) is returned
    * 
    * @return the element in the top of the stack.
    * @throws EmptyStackException If the stack is empty.
    */
   public E peek() throws EmptyStackException;

   /**
    * post: returns true if and only if the stack is empty
    * 
    * @return True if empty, false otherwise.
    */
   public boolean empty();

   /**
    * post: returns the number of elements in the stack
    * 
    * @return The number of elements in the stack.
    */
   public int size();

}