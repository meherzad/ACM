import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1409 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());

		int harry, larry;

		String output;
		harry = Integer.parseInt(st.nextToken());
		larry = Integer.parseInt(st.nextToken());

		if ((harry + larry) % 2 == 0) {
			output = larry + " " + harry;
		} else {
			output = (larry - 1) + " " + (harry - 1);
		}
		System.out.println(output);
	}
}
