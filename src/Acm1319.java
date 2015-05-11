import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1319 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int value, n = Integer.parseInt(bReader.readLine());

		int[][] board = new int[n][n];
		value = n * n;
		StringBuffer st;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1, p = i; p >= 0 && j >= 0; j--, p--) {
				board[j][p] = value--;
			}
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = n - 1, p = i; p >= 0 && j >= 0; p--, j--) {
				board[p][j] = value--;
			}
		}

		for (int i = 0; i < n; i++) {
			st = new StringBuffer();
			for (int j = 0; j < n; j++) {
				st.append(" ").append(board[i][j]);
			}
			System.out.println(st.toString().trim());
		}
	}
}
