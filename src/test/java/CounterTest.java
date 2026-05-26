import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class CounterTest {

	@Test
	public void testReset() {
		Counter testCounter = new Counter();
		
		for(int i = 0; i <10; i++) {
			testCounter.increment();
		}
		
		testCounter.reset();
		
		assertEquals(0, testCounter.getCount());
	}

	@Test
	public void testIncrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i <10; i++) {
			testCounter.increment();
			assertEquals(i, testCounter.getCount());
		}
	}

	@Test
	public void testDecrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i <10; i++) {
			testCounter.decrement();
			assertEquals(i * -1, testCounter.getCount());
		}
	}
	
	@Test
	public void testFlakiness() {
		Random random = new Random();
		int value = random.nextInt(100);
		Counter testCounter = new Counter();
		if(value > 50) {
			testCounter.increment();
		}
		testCounter.increment();
		assertEquals(value > 50 ? 92 : 91, testCounter.getCount());
	}
	
	@Test
	public void incompleteTest() {
		Counter counter = new Counter();
		counter.multiplyBy(5);
		assertNotNull(counter);
	}

}
