import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1876 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		int a, b;

		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		System.out.println(39 + 2 * a > 40 + b * 2 ? 39 + 2 * a : 40 + b * 2);
	}
}
