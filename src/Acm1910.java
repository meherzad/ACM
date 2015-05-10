import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1910 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int index, max, i, n = Integer.parseInt(bReader.readLine());
		int[] list = new int[n];
		int[] count = new int[n];
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		i = 0;
		while (st.hasMoreTokens()) {
			list[i++] = Integer.parseInt(st.nextToken());
		}
		for (i = 1; i < n - 1; i++) {
			count[i - 1] = list[i - 1] + list[i] + list[i + 1];
		}
		max = 0;
		index = 0;
		for (i = 0; i < n - 2; i++) {
			if (max < count[i]) {
				max = count[i];
				index = i;
			}
		}

		System.out.println(max + " " + (index + 2));
	}
}
