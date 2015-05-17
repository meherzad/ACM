import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Acm1545 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(bReader.readLine());
		List<String> list = new ArrayList<String>();
		String string;
		for (int i = 0; i < n; i++) {
			list.add(bReader.readLine());
		}
		string = bReader.readLine();

		for (String s : list) {
			if (s.charAt(0) == string.charAt(0)) {
				System.out.println(s);
			}
		}
	}
}
