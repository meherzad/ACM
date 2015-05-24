import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm2005 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int[][] distance = new int[5][5];
		StringTokenizer st;
		int counter, case1, case2, case3, case4;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(bReader.readLine());
			counter = 0;
			while (st.hasMoreTokens()) {
				distance[i][counter++] = Integer.parseInt(st.nextToken());
			}
		}

		case1 = distance[0][2] + distance[2][1] + distance[1][3] + distance[3][4];
		case2 = distance[0][2] + distance[2][3] + distance[3][1] + distance[1][4];
		case3 = distance[0][1] + distance[1][2] + distance[2][3] + distance[3][4];
		case4 = distance[0][3] + distance[3][2] + distance[2][1] + distance[1][4];

		if (case1 < case2 && case1 < case3 && case1 < case4) {
			System.out.println(case1);
			System.out.println("1 3 2 4 5");
		} else if (case1 > case2 && case2 < case3 && case2 < case4) {
			System.out.println(case2);
			System.out.println("1 3 4 2 5");
		} else if (case3 < case1 && case2 > case3 && case3 < case4) {
			System.out.println(case3);
			System.out.println("1 2 3 4 5");
		} else {
			System.out.println(case4);
			System.out.println("1 4 3 2 5");
		}
	}
}
