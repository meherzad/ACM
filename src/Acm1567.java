import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1567 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String message = bReader.readLine();

		int cost = 0;

		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) >= 97) {
				cost += (message.charAt(i) - 97) % 3 + 1;
			} else if (message.charAt(i) == ' ' || message.charAt(i) == 46) {
				cost++;
			} else if (message.charAt(i) == 44) {
				cost += 2;
			} else {
				cost += 3;
			}
		}

		System.out.println(cost);
	}
}
