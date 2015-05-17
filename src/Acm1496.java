import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Acm1496 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int counter, n = Integer.parseInt(bReader.readLine());
		String tmp;
		Map<String, Integer> freq = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			tmp = bReader.readLine();
			counter = 1;
			if (freq.containsKey(tmp)) {
				counter = freq.get(tmp) + 1;
			}
			freq.put(tmp, counter);
		}

		for (String user : freq.keySet()) {
			if (freq.get(user) >= 2) {
				System.out.println(user);
			}
		}
	}
}
