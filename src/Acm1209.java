import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1209 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int num, n = Integer.parseInt(bReader.readLine());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(bReader.readLine());
			//double t = 2 * (num - 1);
			//double sqr = Math.floor(Math.sqrt(t));

			if ((((Math.sqrt(((double)8 * (num)) - 7) - 1) / 2)) % 1 == 0) {
				sb.append(1).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
}
