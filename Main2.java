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
 * 
<<<<<<< HEAD
 *
=======
 * Main para el segundo progrma que utiliza la implementación de la Priority
>>>>>>> origin/master
 */
public class Main2 {
	

	static int contador = 0; 
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
		        	contador++;
		        }
		        b.close();
		     }
		        catch (IOException e) {
					e.printStackTrace();
				}
		    }
/**
 * 
 * Main para el segundo programa que llama a la lectura del programa e imprime el resultado
 */
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			leer("pacientes.txt"); // lectura del archivo pacientes
			System.out.println("Jonathan Aguirre 14349 y Yosmith Melendez 14413");
			VectorHeap2 heap = new VectorHeap2 (v);
			for(int i=0; i<contador; i++){
				Paciente paciente = (Paciente)heap.remove();
				System.out.println(paciente.nombre+" "+","+paciente.enfermedad+" "+","+paciente.prioridad);
			}

			
		}
	}
