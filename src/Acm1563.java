import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Acm1563 {
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(READER.readLine());

		Map<String, Integer> map = new HashMap<String, Integer>();
		String str;
		int tmp, out;
		while (n-- > 0) {
			str = READER.readLine();
			tmp = 1;
			if (map.containsKey(str)) {
				tmp += map.get(str);
			}
			map.put(str, tmp);
		}
		out = 0;
		for (String s : map.keySet()) {
			out += map.get(s) - 1;
		}
		System.out.println(out);
	}
}
