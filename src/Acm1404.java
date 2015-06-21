import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1404 {
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String input = READER.readLine();
		char[] output = new char[input.length()];
		int mult = 0, offset = 5;
		// output[0] = (char) (input.charAt(0) - 5);
		// for (int i = 1; i < input.length(); i++) {
		// output[i] = (char) (input.charAt(i) <= input.charAt(i - 1) ? ++mult *
		// 26 + input.charAt(i) - output[i - 1] + 97 - offset : mult * 26 +
		// input.charAt(i) - output[i - 1] + 97 - offset);
		// offset = 0;
		// }

		for (int i = 0; i < input.length(); i++) {
			output[i] = (char) (input.charAt(i) - 97);
		}

		offset = -5;
		for (int i = 1; i < input.length(); i++) {
			output[i] = (char) (output[i] <= output[i - 1] ? ++mult * 26 + output[i] + offset : mult * 26 + output[i] + offset);
			offset = 0;
		}

		output[0] += 92;
		for (int i = 1; i < input.length(); i++) {
			output[i] = (char) (output[i] - output[i - 1] + 97 + 97);
		}
		System.out.println(new String(output));
	}
}
