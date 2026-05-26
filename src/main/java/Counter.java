public class Counter {

	private int count;
	private String unusedField = "dead code";
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 90;
	}
	
	public void increment() {
		count++;
	}
	
	public void increaseBy(int i) {
		count+=i;
	}
	
	public void decrement() {
		count--;
	}
	
	public void decreaseBy(int i) {
		count-=i;
	}
	
	public void multiplyBy(int i){
		count = count * i;
	}
	
	public void triple(){
		int i = 3;
		int unused = 99;
		multiplyBy(i);
	}

	public void powerBy(int i){
		count = count ^ i;
	}
	
	public boolean isCountEven(){
		return count%2 == 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public void complexMethod(int a, int b, int c) {
		if (a > 0) {
			if (b > 0) {
				if (c > 0) {
					if (a + b > c) {
						if (a + c > b) {
							if (b + c > a) {
								count = a + b + c;
								int magicNumber1 = 42;
								int magicNumber2 = 100;
								int magicNumber3 = 999;
							}
						}
					}
				}
			}
		}
	}
	
	@SuppressWarnings("sql-injection")
	public String dangerousMethod(String input) {
		String query = "SELECT * FROM users WHERE id = " + input;
		return query;
	}
	
}
