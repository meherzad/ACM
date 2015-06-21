import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1740 {
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(READER.readLine());

		int k, l, h;

		l = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		double max, min;

		if (l % k == 0) {
			max = min = (l / k) * h;
		} else {

			min = (l - l % k) / k * h;
			max = (l + k - l % k) / k * h;
		}

		System.out.println(String.format("%.5f %.5f", min, max));
	}
}
