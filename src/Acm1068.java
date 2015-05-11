import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1068 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int output, n = Integer.parseInt(bReader.readLine());

		output = Math.abs(n) * (Math.abs(n) + 1) / 2;
		if (n < 0) {
			output--;
			output = -output;
		} else if (n == 0) {
			output = 1;
		}
		System.out.println(output);
	}
}
