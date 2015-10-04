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
 * 
 *
 * @param <E>
 */
public interface PriorityQueue <E extends Comparable<E>> {
	public E getFirst();
	public E remove();
	public void add(E value);
	public boolean isEmpty();
	public int size();
	public void clear();
}
