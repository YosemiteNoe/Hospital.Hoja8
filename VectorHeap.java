/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de trabajo 8
 * 
 * @author Yosemite Meléndez	14413
 * @author Jonathan Aguirre		14349	
 * 
 */

import java.util.*;
import java.util.PriorityQueue;
import java.util.Vector;



/**
 * 
 *
 * @param <E>
 */
public class VectorHeap <E extends Comparable<E>>  extends PriorityQueue<E>{
	
	
	/**
	 * 
	 */
	protected Vector<E> data;
	//public VectorHeap(){ 
	//	data = new Vector<E>();
	// }
	
	
	/**
	 * @param v
	 */
	public VectorHeap(Vector<E> v){
		int i;
		data = new Vector<E>(v.size());
		for (i = 0; i < v.size();i++){
			add(v.get(i));
		}
	}
	
	/**
	 * @param i
	 * @return
	 */
	protected static int parent(int i){
		return (i-1)/2;
	}
	
	/**
	 * @param i
	 * @return
	 */
	protected static int left(int i){
		return (2*i+1);
	}
	
	/**
	 * @param i
	 * @return
	 */
	protected static int right(int i){
		return (i+1)*2;
	}
}
