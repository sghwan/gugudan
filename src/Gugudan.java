import java.io.IOException;

public class Gugudan {
	public static void main(String[] args) throws IOException{
		int[] result = new int[9];
		
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				result[j - 1] = i * j;
				System.out.println(i + " * " + j + " = " + result[j - 1]);
			}
			System.out.println("=================");
		}
	}
}
