import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1349 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int a, b, c, n;
		n = Integer.parseInt(bReader.readLine());
		
		if(n==1) {
			System.out.println("1 2 3");
		} else if (n==2) {
			System.out.println("3 4 5");
		} else {
			System.out.println(-1);
		}
	}
}
