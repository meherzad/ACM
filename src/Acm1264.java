import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1264 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());

		int n, m;

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		System.out.println(n * (m + 1));
	}

}
