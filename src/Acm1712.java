import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1712 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int[][] grill = new int[4][4];
		String[][] cipher = new String[4][4];
		StringBuilder sb = new StringBuilder();

		int i, p, j;
		String st;
		for (i = 0; i < 4; i++) {
			st =bReader.readLine();
			for (j = 0; j < 4; j++) {
				grill[i][j] = st.charAt(j) != '.' ? 1 : 0;
			}
		}
		for (i = 0; i < 4; i++) {
			st = bReader.readLine();
			for (j = 0; j < 4; j++) {
				cipher[i][j] = st.substring(j, j+1);
			}
		}

		for (p = 0; p < 4; p++) {
			for (i = 0; i < 4; i++) {
				for (j = 0; j < 4; j++) {
					if (grill[i][j] == 1) {
						sb.append(cipher[i][j]);
					}
				}
			}

			// Rotate
			int[][] tmp = new int[4][4];
			for (i = 0; i < 4; i++) {
				for (j = 0; j < 4; j++) {
					tmp[i][j] = grill[3 - j][i];
				}
			}
			grill = tmp;
		}
		System.out.println(sb.toString());
	}
}
