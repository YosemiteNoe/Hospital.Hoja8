/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de trabajo 8
 * 
 * @author Yosemite Meléndez	14413
 * @author Jonathan Aguirre		14349	
 * 
 */

/**
 * Esta clase sirve para simular a un paciente en un hospital.
 * Así como cada paciente, este tendrá un nombre, una enfermedad
 * y el grado de ugencia con el que debe ser atendido. 
 *
 * @param <E> Recibe cualquier tipo de dato
 */
public class Paciente<E>  implements Comparable<E>{
	String nombre;
	String enfermedad;
	String prioridad;
	
	/**
	 * Este es el construcotr de objetos y crea el nombre, la enfermedad 
	 * y la prioridad.
	 * 
	 * @param nombrePaciente	el nombre del paciente que se antiende
	 * @param enfermedad		la enfermedad que tiene el paciente	
	 * @param prioridad			qué tan urgente es que se atiena al paciente (A-E)
	 * 							siendo A la llamada más urgente y E la menos urgente
	 */
	public Paciente(String nombrePaciente, String enfermedad, String prioridad) {
		super();
		this.nombre = nombrePaciente;
		this.enfermedad = enfermedad;
		this.prioridad = prioridad;
	}

	
	public int compareTo(E paciente) {
		// TODO Auto-generated method stub
		return this.prioridad.compareTo(((Paciente) paciente).prioridad);
	}
}

