/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de trabajo 8
 * 
<<<<<<< HEAD
 * @author Yosemite Mel�ndez	14413
=======
 * @author Yosemite Meléndez	14413
>>>>>>> origin/master
 * @author Jonathan Aguirre		14349	
 * 
 */

import java.io.*;
import java.util.Vector;


/**
 * Esta es la clase main y se encarga de ejecutar el programa
 *
 */
public class Main {
static int contador = 0; 


/**
 * 
<<<<<<< HEAD
=======
 *Se utiliza un Vector de tipo Paciente, que posee los atributos de nombre, enfermedad y Prioridad
>>>>>>> origin/master
 */
static Vector<Paciente> v = new Vector<Paciente>();
	  public static void leer(String archivo) throws FileNotFoundException, IOException {
	        String cadena; 
	        String nombre; 
	        String enfermedad; 
	        String prioridad; 
	        FileReader f = new FileReader(archivo);
	        BufferedReader b = new BufferedReader(f);
	     try {
	        while((cadena = b.readLine())!=null) { 
	        	nombre = cadena.substring(0,cadena.indexOf(',')); // se guarda el nombre en el vector 1
	        	enfermedad = cadena.substring(cadena.indexOf(',')+2,cadena.lastIndexOf(',')); // se guarda el nombre en el vector 2
	        	prioridad = cadena.substring(cadena.lastIndexOf(',')+1,cadena.length()); // se guarda el nombre en el vector 3
	        	v.add(new Paciente(nombre,enfermedad,prioridad));
	        }
	        b.close();
	     }
	        catch (IOException e) {
				e.printStackTrace();
			}
	    }
	  

<<<<<<< HEAD
=======
/**
 * 
 * este metodo llama a la lectura del archivo e imprime el resultado ordenado según su prioridad
 */
>>>>>>> origin/master
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		leer("pacientes.txt"); // lectura del archivo pacientes
		System.out.println("Jonathan Aguirre 14349 y Yosmith Melendez 14413");
		VectorHeap heap = new VectorHeap(v);
		while(heap.iterator().hasNext()){
			Paciente paciente = (Paciente) heap.poll();
			System.out.println(paciente.nombre+" "+","+paciente.enfermedad+" "+","+paciente.prioridad);
		}

		
	}
}

