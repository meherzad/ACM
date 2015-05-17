import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Acm1110 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n, m, y, tmp;
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		List<Integer> output = new ArrayList<Integer>();

		for (int i = 0; i < m; i++) {
			if (fun(i, m, n) == y) {
				output.add(i);
			}
		}

		if (output.size() == 0) {
			System.out.println(-1);
		} else {
			StringBuffer sb = new StringBuffer();
			for (int i : output) {
				sb.append(i).append(" ");
			}
			System.out.println(sb.toString().trim());
		}
	}

	// Math.pow(i % m, n) % m
	private static int fun(int i1, int i2, int i3) {
		BigInteger i = new BigInteger(Integer.toString(i1));
		return i.pow(i3).mod(new BigInteger(Integer.toString(i2))).intValue();
	}
}
