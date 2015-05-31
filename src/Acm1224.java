import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1224 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		int n, m, tmp;
		long out;
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		out = 0;
		if (n > 1 && m > 1) {
			if (n > m) {
				out = 3;
				tmp = m;
			} else {
				out = 2;
				tmp = n;

			}
			out += (long) 2 * (tmp - 2);
			/*
			 * for (int i = 2; i < tmp; i++) { out += 2; }
			 */
		} else if (m == 1 && n > 1) {
			out = 1;
		}

		System.out.println(out);
	}
}
