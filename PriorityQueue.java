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


/**
 * 
<<<<<<< HEAD
 *
=======
 * Interface de PriotityQueue que contiene los metodos que se utilizaran en el VectorHeap, esto extiende de la Comparable
>>>>>>> origin/master
 * @param <E>
 */
public interface PriorityQueue <E extends Comparable<E>> {
/**
	 * @return elemento para devolver la primera posicion del Queue
	 */
	public E getFirst();
	
	/**
	 * @return remueve el utilimo elemento del arbol 
	 */
	public E remove();
	/**
	 * @param value agrega un valor al arbol 
	 */
	public void add(E value);
	/**
	 * @return revisa si esta vacio el arbol
	 */
	public boolean isEmpty();
	/**
	 * @return delvuelve el tamaño del arbol
	 */
	public int size();
	/**
	 * limpia el arbol
	 */
	public void clear();
}
