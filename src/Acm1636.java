import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1636 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int t1, t2, wrong;
		StringTokenizer st = new StringTokenizer(bReader.readLine());

		t1 = Integer.parseInt(st.nextToken());
		t2 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(bReader.readLine());
		wrong = 0;
		while (st.hasMoreTokens()) {
			wrong += Integer.parseInt(st.nextToken());
		}

		System.out.println(t2 - 20 * wrong > t1 ? "No chance." : "Dirty debug :(");
	}
}
