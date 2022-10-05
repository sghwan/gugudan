import java.io.IOException;

public class Gugudan {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		
		for(int i = 0; i < 9; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < 9; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) throws IOException{

		for(int i = 2; i < 10; i++) {
			print(calculate(i));
		}
	}
}
