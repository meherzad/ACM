import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm1881 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		int h, n, w, lineCounter, pageCounter, tmp;
		String tempString;

		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		pageCounter = lineCounter = 1;
		tmp = -1;

		for (int i = 0; i < n; i++) {
			tempString = bReader.readLine();
			tmp += tempString.length() + 1;
			if (tmp > w) {
				//System.out.println("new line " + tempString + " " + tmp);
				lineCounter++;
				tmp = tempString.length();
				if (lineCounter > h) {
					pageCounter++;
					lineCounter = 1;
				}
			}

		}

		System.out.println(pageCounter);
	}
}
