import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1877 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String pass1, pass2;

		pass1 = bReader.readLine();
		pass2 = bReader.readLine();

		System.out.println(Integer.parseInt(pass1) % 2 == 0 || Integer.parseInt(pass2) % 2 != 0 ? "yes" : "no");
	}
}
