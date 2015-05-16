import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1263 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		int n, m;
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int[] voteDistribution = new int[n + 1];
		for (int i = 0; i < m; i++) {
			voteDistribution[Integer.parseInt(bReader.readLine())]++;
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(String.format("%.2f%%",  (double) voteDistribution[i] * 100 / m ));
		}
	}
}
