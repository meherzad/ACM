import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Acm1196 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n, m, output = 0;
		String tmp;
		n = Integer.parseInt(bReader.readLine());
		Set<String> profList = new HashSet<String>(n);
		for (int i = 0; i < n; i++) {
			profList.add(bReader.readLine());
		}
		m = Integer.parseInt(bReader.readLine());
		for (int i = 0; i < m; i++) {
			tmp = bReader.readLine();
			if (profList.contains(tmp)) {
				output++;
			}
		}
		System.out.println(output);
	}
}
