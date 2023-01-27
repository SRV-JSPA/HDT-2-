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
import java.util.Map.Entry;

public class calculadora implements Stack{
   
    protected Vector <Integer> data;

    Scanner in = new Scanner(System.in);

    Stack<Integer> s = new Stack<Integer>();

     public String leerArchivo() throws FileNotFoundException {
		// Aqui se indica la ubicacion y nombre de archivo.txt
		File lec = new File("/ubicacion/nombrearchivo.txt");
		Scanner sc = new Scanner(lec);
		while (sc.hasNext()) 
		{
			System.out.println(sc.nextLine());
		}
		return"";
	}
  

    public  void StackVector(){
    data = new Vector<Integer>();
    }

    public void add (Integer item){
        
    }

    @Override
    public void add(Object item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void push(Object item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Object pop() throws EmptyStackException {
        // TODO Auto-generated method stub
        return null;
    }

}
