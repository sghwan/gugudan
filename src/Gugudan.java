import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Gugudan {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num < 2 || num > 9) {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
			return;
		}
		
		for(int i = 1; i <= 9; i++) {
			int result = num * i;
			System.out.println(result);
		}
	}
}
