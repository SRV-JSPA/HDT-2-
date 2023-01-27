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


public class calculadora implements InterfazCalcu {
    

    public calculadora() {
        Stack s = new Stack();
    }

  

    public Double parsear(String caracter) {
        return Double.parseDouble(caracter);
    }

    public double evaluate(String c) {
       
        int len = caracter.length();
        Double resultado = 0.0;
        for (int i = 0; i < len; i++) {
            char cContexto = expresion.charAt(i);

            String comando = String.valueOf(cContexto);
            if (cContexto != '\n') {
                if (Character.isDigit(cContexto)) {

                    stack.push(parsear(comando));
                } else {
                    double a = stack.pop(), b = stack.pop();
                    if(cContexto=='+'){resultado=a+b;}else if(cContexto=='-'){resultado=a-b;}else if(cContexto=='*'){resultado=a*b;}else if(cContexto=='/'){if(b!=0){a/b}else{throw new ArithmeticException()}}

            
                    stack.push(resultado);
                }
            }
        }

        return stack.pop();
    }

    public double getPrevious() {
        return 0.0;
    }


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


}
