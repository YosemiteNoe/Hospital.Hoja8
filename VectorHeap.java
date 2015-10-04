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

import java.util.*;
import java.util.PriorityQueue;
import java.util.Vector;



/**
<<<<<<< HEAD
 * 
=======
 *  Classe vectorheap que se extiende de Comparable y cuya clase super es PriotityQueue
>>>>>>> origin/master
 *
 * @param <E>
 */
public class VectorHeap <E extends Comparable<E>>  extends PriorityQueue<E>{
	
	
	/**
<<<<<<< HEAD
	 * 
=======
	 *  Generación de un objeto de tipo Vector llamado data
>>>>>>> origin/master
	 */
	protected Vector<E> data;
	//public VectorHeap(){ 
	//	data = new Vector<E>();
	// }
	
	
	/**
<<<<<<< HEAD
	 * @param v
=======
	 * @param v Consructor  que agrega los datos al Vector
>>>>>>> origin/master
	 */
	public VectorHeap(Vector<E> v){
		int i;
		data = new Vector<E>(v.size());
		for (i = 0; i < v.size();i++){
			add(v.get(i));
		}
	}
	
	/**
<<<<<<< HEAD
	 * @param i
=======
	 * @param i Obtenida de libro de texto
>>>>>>> origin/master
	 * @return
	 */
	protected static int parent(int i){
		return (i-1)/2;
	}
	
	/**
<<<<<<< HEAD
	 * @param i
=======
	 * @param i Obtenida de libro de texto
>>>>>>> origin/master
	 * @return
	 */
	protected static int left(int i){
		return (2*i+1);
	}
	
	/**
<<<<<<< HEAD
	 * @param i
=======
	 * @param i Obtenida de libro de texto
>>>>>>> origin/master
	 * @return
	 */
	protected static int right(int i){
		return (i+1)*2;
	}
}
