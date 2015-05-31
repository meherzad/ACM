import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Acm1935 {
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int out, n = Integer.parseInt(READER.readLine());
		StringTokenizer st = new StringTokenizer(READER.readLine());

		int[] sheetList = new int[n];
		for (int i = 0; i < n; i++) {
			sheetList[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sheetList);
		out = 0;
		for (int i = 0; i < n; i++) {
			out += sheetList[i];
		}
		out += sheetList[n - 1];
		System.out.println(out);
	}
}
