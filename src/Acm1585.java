import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1585 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(bReader.readLine());
		String str;
		int[] indexList = new int[3];

		for (int i = 0; i < n; i++) {
			str = bReader.readLine();
			indexList[getIndex(str)]++;
		}

		if (indexList[0] > indexList[1] && indexList[0] > indexList[2]) {
			System.out.println("Emperor Penguin");
		} else if (indexList[1] > indexList[0] && indexList[1] > indexList[2]) {
			System.out.println("Macaroni Penguin");
		} else {
			System.out.println("Little Penguin");
		}
	}

	private static int getIndex(String str) {
		if ("Emperor Penguin".equals(str))
			return 0;
		if ("Macaroni Penguin".equals(str))
			return 1;
		else
			return 2;
	}
}
