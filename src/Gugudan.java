import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Gugudan {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 9; i++) {
			int result = dan * i;
			System.out.println(result);
		}
	}
}