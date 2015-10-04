import java.io.*;
import java.util.Vector;
public class Main {
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
	        }
	        b.close();
	     }
	        catch (IOException e) {
				e.printStackTrace();
			}
	    }
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
