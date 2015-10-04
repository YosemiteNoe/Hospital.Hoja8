/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de trabajo 8
 * 
 * @author Yosemite Meléndez	14413
 * @author Jonathan Aguirre		14349	
 * 
 */

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class VectorHeap2Test extends TestCase {
	
	VectorHeap2 vh = new VectorHeap2();
	@Test
	public void testAdd() {
		vh.add("John");
		vh.add("Noe");
		assertEquals("John",vh.remove());
	}

	public void testRemove() {
		vh.clear();
		vh.add("A");
		vh.add("B");
		vh.add("C");
		vh.add("E");
		
		assertEquals("A", vh.remove());
		
		
	}
}
