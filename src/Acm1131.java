import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1131 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		long n, k, tmp, out;

		n = Long.parseLong(st.nextToken()) - 1;
		k = Long.parseLong(st.nextToken());

		tmp = k * (k + 1) / 2;
		out = 0;
		if (tmp > n) {
			for (long i = k; i > 0; i--) {
				tmp -= i;
				System.out.println(tmp);
				if (tmp < n) {
					out = i ;
					break;
				}
			}

		} else {
			tmp = n - tmp;
			out = k + tmp / k;
			if (tmp % k != 0) {
				out++;
			}
		}
		System.out.println(out);
	}
}
