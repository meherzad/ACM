import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm2025 {
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int t, n, k, i, j, output, p;

		t = Integer.parseInt(READER.readLine());
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(READER.readLine());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			j = (int) Math.ceil((double) n / k);
			output = j * (n - j);
			// System.out.println(output);

			for (i = n - j, p = k - 1; i > 0; i -= j, p--) {
				j = (int) Math.round(i / p);
				output += j * (i - j);
				// output+= (k)*(n/k)
				// System.out.println(output);
			}
			System.out.println(output);
		}
	}
}
