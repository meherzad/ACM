import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1197 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n, x, y, output;
		String str;
		n = Integer.parseInt(bReader.readLine());
		for (int i = 0; i < n; i++) {
			output = 0;
			str = bReader.readLine().trim();
			x = str.charAt(0) - 97;
			y = str.charAt(1) - 49;
			if (x + 2 <= 7) {
				if (y + 1 <= 7) {
					output++;
				}
				if (y - 1 >= 0) {
					output++;
				}
			}
			if (x - 2 >= 0) {
				if (y + 1 <= 7) {
					output++;
				}
				if (y - 1 >= 0) {
					output++;
				}
			}

			if (y + 2 <= 7) {
				if (x + 1 <= 7) {
					output++;
				}
				if (x - 1 >= 0) {
					output++;
				}
			}
			if (y - 2 >= 0) {
				if (x + 1 <= 7) {
					output++;
				}
				if (x - 1 >= 0) {
					output++;
				}
			}
			
			System.out.println(output);
		}
	}
}
