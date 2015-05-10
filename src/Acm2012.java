import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm2012 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int f = Integer.parseInt(bReader.readLine());

		System.out.println((240 - (12 - f) * 45 >= 0) ? "YES" : "NO");
	}
}
