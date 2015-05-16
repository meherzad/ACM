import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm2023 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(bReader.readLine());
		String tmp;
		int position, steps;
		position = 1;
		steps = 0;
		for (int i = 0; i < n; i++) {
			tmp = bReader.readLine();
			if (tmp.charAt(0) == 65 || tmp.charAt(0) == 79 || tmp.charAt(0) == 80 || tmp.charAt(0) == 82) {
				steps += Math.abs(position - 1);
				position = 1;
				// System.out.println(steps);
			} else if (tmp.charAt(0) == 66 || tmp.charAt(0) == 77 || tmp.charAt(0) == 83) {
				steps += Math.abs(position - 2);
				position = 2;
				// System.out.println("2" + steps);
			} else {
				steps += Math.abs(position - 3);
				position = 3;
				// System.out.println("3" + steps);
			}

		}
		System.out.println(steps);
	}
}
