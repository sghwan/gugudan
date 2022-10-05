import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanMain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputValue = br.readLine().split(",");
		
		int n = Integer.parseInt(inputValue[0]);
		int m = Integer.parseInt(inputValue[1]);
		
		for(int i = 2; i <= n; i++) {
			int[] result = Gugudan.calculate(i, m);
			Gugudan.print(result, m);
		}
	}
}
