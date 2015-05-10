import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1924 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n;
		n = Integer.parseInt(bReader.readLine());

		System.out.println((n * (n + 1) / 2) % 2 == 0 ? "black" : "grimy");
	}
}
