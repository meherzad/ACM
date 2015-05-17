import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1327 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int a, b, output;

		a = Integer.parseInt(bReader.readLine());
		b = Integer.parseInt(bReader.readLine());

		b = a != b && b % 2 == 0 ? b - 1 : b;
		if (b == a && a % 2 == 0) {
			output = 0;
		} else {
			output = (b - a) / 2 + 1;
		}
		System.out.println(output);
	}
}
