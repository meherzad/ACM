import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1991 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());

		int n, k, output1, output2, tmp;

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		output1 = output2 = 0;
		st = new StringTokenizer(bReader.readLine());
		for (int i = 0; i < n; i++) {
			tmp = Integer.parseInt(st.nextToken());

			if (tmp > k) {
				output1 += tmp - k;
			} else if (k > tmp) {
				output2 += k - tmp;
			}
		}

		System.out.println(output1 + " " + output2);
	}

}
