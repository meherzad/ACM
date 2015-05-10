import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1639 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());

		int m, n;
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		System.out.println((m * n) % 2 == 0 ? "[:=[first]" : "[second]=:]");
	}
}
