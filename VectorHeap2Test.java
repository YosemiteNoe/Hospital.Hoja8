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
