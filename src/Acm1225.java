import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1225 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(bReader.readLine());

		long sum, f1, f2;
		f1 = 1;
		f2 = 1;
		sum = 1;

		for (int i = 2; i < n; i++) {
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
		}

		System.out.println(sum * 2);
	}
}
