import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1581 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int tmp, previous, counter, n = Integer.parseInt(bReader.readLine());
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		previous = Integer.MAX_VALUE;
		counter = 0;
		while (st.hasMoreTokens()) {
			tmp = Integer.parseInt(st.nextToken());
			if (tmp == previous || counter == 0) {
				previous = tmp;
				counter++;
			} else {
				sb.append(" ").append(counter).append(" ").append(previous);
				counter = 1;
				previous = tmp;
			}
		}
		sb.append(" ").append(counter).append(" ").append(previous);
		System.out.println(sb.toString().trim());
	}
}
