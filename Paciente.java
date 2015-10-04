public class Paciente  implements Comparable<Paciente>{
	String nombre;
	String enfermedad;
	char prioridad;
	@Override
	public int compareTo(Paciente x) {
		// TODO Auto-generated method stub
		int resultado=0;
        if (this.prioridad < x.prioridad) {   resultado = -1;      }
        else if (this.prioridad > x.prioridad) {    resultado = 1;      }
        else {   resultado = 0;   }
        return resultado;
	}
}
