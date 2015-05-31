import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm2035 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		long x, y, tmp, c;

		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		if (x + y < c) {
			sb.append("Impossible");
		} else {
			long min = x > y ? y : x;
			long max = x < y ? y : x;
			for (long i = min; i >= 0; i--) {
				tmp = c - i;
				if (tmp >= 0 && tmp <= max) {
					sb.append(i).append(" ").append(tmp);
					break;
				}
			}
		}

		System.out.println(sb.toString());
	}
}
