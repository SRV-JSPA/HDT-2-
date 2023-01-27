/*
Profesor: Douglas Leonel Barrios
Auxiliares: Fernanda Esquivel y Francisco Castillo
INTEGRANTES: 
José Santiago Pereira Alvarado, 22318
Gustavo Adolfo Cruz Bardales, 22779
Nancy Gabriela Mazariegos Molina, 22513
27/01/2023
Hoja de Trabajo 2
Curso: Algoritmos y Estructuras de datos
Sección: 20
*/

import java.util.*;

public class Stack implements InterfazStack {

    Stack s = new Stack();

    ArrayList<Double> list = new ArrayList<Double>();
    
    public void push(Integer elemento){
        s.push(elemento);
    }

    public Integer pop () throws EmptyStackException{
        if(empty()){
            System.out.println("La pila esta vacia");
            return null;
        }else{
            Double x=list.get(list.size()-1);
            list.remove(list.size()-1);
            return x;
        }
       
    }

    public Integer peek() throws EmptyStackException{
        if (empty()){
            return true;

        } else{
            Double x=list.get(list.size()-1);
            return x;
        }
        
    }

    public boolean empty (){
        if(list == 0){
            return true;
        }else{
           return false;
        }
    }

    public int size(){
        return list.size();
    }


}
