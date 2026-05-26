import java.util.ArrayList;
import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		ArrayList<String> unused = new ArrayList<>();
		HashMap<String, Integer> deadCode = new HashMap<>();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
		if(args != null && args.length > 0) {
			String userInput = args[0];
			System.out.println(counter.dangerousMethod(userInput));
		}
		
	}

}
