import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1787 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());

		int n, k, tmp, sum;

		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		sum = 0;
		st = new StringTokenizer(bReader.readLine());
		while (st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken()) + sum;
			if (tmp <= k) {
				sum = 0;
			} else {
				sum = tmp - k;
			}
		}
		System.out.println(sum);
	}
}
