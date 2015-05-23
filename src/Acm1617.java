import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1617 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int output, n = Integer.parseInt(bReader.readLine());
		int[] counter = new int[101];
		for (int i = 0; i < n; i++) {
			counter[Integer.parseInt(bReader.readLine()) - 600]++;
		}
		output = 0;
		for (int i = 0; i < counter.length; i++) {
			output += counter[i] / 4;
		}
		System.out.println(output);
	}
}
