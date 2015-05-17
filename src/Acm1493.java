import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1493 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Integer ticketNumber = Integer.parseInt(bReader.readLine());
		String num1, num2;
		num1 = String.format("%06d", ticketNumber + 1);
		num2 = String.format("%06d", ticketNumber - 1);

		if (diff(num1) == 0 || diff(num2) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static int diff(String ticketNumber) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += ticketNumber.charAt(i) - 48;
		}
		for (int i = 3; i < 6; i++) {
			sum -= ticketNumber.charAt(i) - 48;
		}
		return sum;
	}
}
