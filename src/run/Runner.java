package run;

public class Runner {
	public static void main(String[] args) {
		Double[] vel = { 6.0, 7.0, 8.0 };
		Integer[] seed = {0, 1, 2, 3, 4};
		for (Double v : vel) {
//			for(Integer s : seed) {
				new EscapeRunner(1, v);		
//			}
		}
		
	}
}
