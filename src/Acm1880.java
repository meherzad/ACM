import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Acm1880 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		bReader.readLine();
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		String tmp;
		int val, output;
		Map<String, Integer> map = new HashMap();
		while (st.hasMoreTokens()) {
			tmp = st.nextToken();
			val = 1;
			if (map.containsKey(tmp)) {
				val = map.get(tmp) + 1;
			}
			map.put(tmp, val);
		}
		bReader.readLine();
		st = new StringTokenizer(bReader.readLine());
		while (st.hasMoreTokens()) {
			tmp = st.nextToken();
			val = 1;
			if (map.containsKey(tmp)) {
				val = map.get(tmp) + 1;
			}
			map.put(tmp, val);
		}
		bReader.readLine();
		st = new StringTokenizer(bReader.readLine());
		while (st.hasMoreTokens()) {
			tmp = st.nextToken();
			val = 1;
			if (map.containsKey(tmp)) {
				val = map.get(tmp) + 1;
			}
			map.put(tmp, val);
		}
		output = 0;
		for (String s : map.keySet()) {
			if (map.get(s) == 3) {
				output++;
			}
		}

		System.out.println(output);
	}
}
