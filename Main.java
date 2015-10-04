import java.io.*;
public class Main {
static int contador = 0; 
static Paciente v[] = new Paciente[1000];
	  public static void leer(String archivo) throws FileNotFoundException, IOException {
	        String cadena; 
	        FileReader f = new FileReader(archivo);
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) { 
	        	v[contador].nombre = cadena.substring(0,cadena.indexOf(',')); // se guarda el nombre en el vector 1
	        	v[contador].enfermedad = cadena.substring(cadena.indexOf(',')+2,cadena.lastIndexOf(',')); // se guarda el nombre en el vector 2
	        	v[contador].prioridad = cadena.charAt(cadena.length()); // se guarda el nombre en el vector 3
	        	contador = contador + 1;
	        }
	        b.close();
	    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		leer("pacientes.txt"); // lectura del archivo pacientes
		
	}
}
