import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1820 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());

		int n, k;
		int output;
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		if ((2 * n) <= k) {
			output = 2;
		} else if ((2 * n) % k == 0) {
			output = (2 * n) / k;
		} else {
			output = (2 * n) / k + 1;
		}
		System.out.println(output);
	}

}
