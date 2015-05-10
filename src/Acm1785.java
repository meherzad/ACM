import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1785 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(bReader.readLine().trim());
		String output;
		if (n <= 4) {
			output = "few";
		} else if (n <= 9) {
			output = "several";
		} else if (n <= 19) {
			output = "pack";
		} else if (n <= 49) {
			output = "lots";
		} else if (n <= 99) {
			output = "horde";
		} else if (n <= 249) {
			output = "throng";
		} else if (n <= 499) {
			output = "swarm";
		} else if (n <= 999) {
			output = "zounds";
		} else {
			output = "legion";
		}
		System.out.println(output);
	}

}
