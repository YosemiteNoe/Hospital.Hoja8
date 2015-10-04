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
import java.util.Vector;


/**
 * 
 * Segundo Vector Heap que implementa del la interfase PriorityQueue
 * @param <E>
 */
public class VectorHeap2 <E extends Comparable<E>>  implements PriorityQueue<E> {

		protected Vector<E> data;
		public VectorHeap2(){ 
			data = new Vector<E>();
		 }
		
		/**
		 * @param v  Segundo Constructor de la clase 
		 */
		public VectorHeap2(Vector<E> v){
			int i;
			data = new Vector<E>(v.size());
			for (i = 0; i < v.size();i++){
				add(v.get(i));
			}
		}
		/**
		 * @param i
		 * @return obtenida del libro de texto
		 */
		protected static int parent(int i){
			return (i-1)/2;
		}
		/**
		 * @param i
		 * @return obtenida del libro de texto
		 */
		protected static int left(int i){
			return (2*i+1);
		}
		/**
		 * @param i
		 * @return obtenida del libro de texto
		 */
		protected static int right(int i){
			return (i+1)*2;
		}
		/**
		 * @param leaf
		 */ obtenida del libro de texto
		protected void percolateUp(int leaf)
		{
			int parent = parent(leaf);
			E value = data.get(leaf);
			while (leaf > 0 && (value.compareTo(data.get(parent)) < 0))
			{
				data.set(leaf,data.get(parent));
				leaf = parent;
				parent = parent(leaf);
			}
			data.set(leaf,value);
		}
		/**
		 * @param root
		 */ obtenida del libro de texto
		protected void pushDownRoot(int root)
		{
			int heapSize = data.size();
			E value = data.get(root);
			while (root < heapSize) 
			{
				int childpos = left(root);
				if (childpos < heapSize)
				{
					if ((right(root) < heapSize) && ((data.get(childpos+1)).compareTo (data.get(childpos)) < 0))
					{
						childpos++;
					}
					if ((data.get(childpos)).compareTo (value) < 0)
					{
						data.set(root,data.get(childpos));
						root = childpos; 
				} else { 
					data.set(root,value);
					return;
				}
				} else { 
					data.set(root,value);
					return;
				}
			}
		}
		
		public void add(E value)

		{
			data.add(value);
			percolateUp(data.size()-1);
		}

		@Override
		public E remove() {
			E minVal = getFirst();
			data.set(0,data.get(data.size()-1));
			data.setSize(data.size()-1);
			if(data.size()>1){pushDownRoot(0);};
			return minVal;
		}

		@Override
		public boolean isEmpty() {
			return false;
		}

		@Override
		public int size() {
			return 0;
		}

		@Override
		public E getFirst() {
			return data.get(0);
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
	}
