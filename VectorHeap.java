import java.util.*;
import java.util.PriorityQueue;
import java.util.Vector;
public class VectorHeap <E extends Comparable<E>>  extends PriorityQueue<E>{
	protected Vector<E> data;
	//public VectorHeap(){ 
	//	data = new Vector<E>();
	// }
	public VectorHeap(Vector<E> v){
		int i;
		data = new Vector<E>(v.size());
		for (i = 0; i < v.size();i++){
			add(v.get(i));
		}
	}
	protected static int parent(int i){
		return (i-1)/2;
	}
	protected static int left(int i){
		return (2*i+1);
	}
	protected static int right(int i){
		return (i+1)*2;
	}
}
