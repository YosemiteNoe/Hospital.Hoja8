
public class Paciente<E>  implements Comparable<E>{
	String nombre;
	String enfermedad;
	String prioridad;
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

