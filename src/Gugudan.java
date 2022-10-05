public class Gugudan {
	public static int[] calculate(int times, int m) {
		int[] result = new int[m];
		
		for(int i = 0; i < m; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}
	
	public static void print(int[] result, int m) {
		for(int i = 0; i < m; i++) {
			System.out.println(result[i]);
		}
	}
}
