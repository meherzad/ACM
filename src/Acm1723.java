import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Acm1723 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String str = bReader.readLine();
		System.out.println(funA(str));
	}

	private static String funA(String str) {
		int n = str.length();
		String[] suffixes = new String[n];
		for (int i = 0; i < n; i++) {
			suffixes[i] = str.substring(i, n);
		}
		List<String> list = new ArrayList<String>();
		Arrays.sort(suffixes);
		String out = "";
		for (int i = 0; i < n - 1; i++) {
			String tmp = funb(suffixes[i], suffixes[i + 1]);
			list.add(tmp);
			if (tmp.length() > out.length()) {
				out = tmp;
			}
		}
		// System.out.println(list);
		// System.out.println(Arrays.asList(suffixes));
		int maxCounter = 0, counter;
		String max = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() < 1) {
				continue;
			}
			counter = 0;
			for (int j = 0; j < suffixes.length; j++) {
				if (suffixes[j].startsWith(list.get(i))) {
					counter++;
				}
			}

			if ((counter > maxCounter) || (counter == maxCounter && list.get(i).length() > max.length())) {
				maxCounter = counter;
				max = list.get(i);
			}
		}
		if (max.length() == 0) {
			max = str;
		}
		return max;
	}

	private static String funb(String string, String string2) {
		int n = string.length() > string2.length() ? string2.length() : string.length();
		for (int i = 0; i < n; i++) {
			if (string.charAt(i) != string2.charAt(i)) {
				return string.substring(0, i);
			}
		}
		return string.substring(0, n);
	}
}
