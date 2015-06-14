import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1290 {
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int n, tmp, i, counter;

		n = Integer.parseInt(READER.readLine());
		// List<Integer> list = new ArrayList<Integer>(n);
		int[] list = new int[25001];
		for (i = 0; i < n; i++) {
			list[Integer.parseInt(READER.readLine())]++;
		}
		i = 1;
		int[] list1 = new int[25001];
		list1[n]++;

		tmp = n;
		counter = 1;
		while (i < list.length && tmp > 0) {
			tmp -= list[i];
			if (tmp > 0) {
				list1[tmp]++;
				i++;
				counter++;
			}
		}
		if (n > 0) {
			System.out.println(counter);
		}
		i = 1;
		tmp = counter;
		while (n > 0 && i < list1.length && tmp > 0) {
			tmp -= list1[i];
			if (tmp > 0) {
				System.out.println(tmp);
				i++;
			}
		}

	}
}
