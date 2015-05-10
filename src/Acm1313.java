import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Acm1313 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int i, j, p, n = Integer.parseInt(bReader.readLine());
		int[][] board = new int[n][n];
		StringTokenizer st;
		StringBuffer stb = new StringBuffer();
		List<Integer> outList = new ArrayList<Integer>();
		for (i = 0; i < n; i++) {
			st = new StringTokenizer(bReader.readLine());
			for (j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (i = 0; i < n; i++) {
			for (p = i, j = 0; p >= 0; j++, p--) {
				outList.add(board[p][j]);
			}
		}

		for (i = 1; i < n; i++) {
			for (p = i, j = n - 1; p < n; j--, p++) {
				outList.add(board[j][p]);
			}
		}

		for (int out:outList) {
			stb.append(out);
			stb.append(" ");
		}
		System.out.println(stb.toString().trim());

	}
}
