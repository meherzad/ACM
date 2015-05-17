import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1925 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n, k, sum1, sum2;
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		sum1 = (n + 1) * (-2) + k;
		sum2 = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bReader.readLine());
			sum1 += Integer.parseInt(st.nextToken());
			sum2 += Integer.parseInt(st.nextToken());
		}
		if (sum1 - sum2 < 0) {
			System.out.println("Big Bang!");
		} else {
			System.out.println(sum1 - sum2);
		}
	}

}
