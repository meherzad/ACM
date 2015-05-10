import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Acm2001 {

	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(bReader.readLine());

		int[] aWeight = new int[3];
		int[] bWeight = new int[3];

		aWeight[0] = Integer.parseInt(st.nextToken());
		bWeight[0] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(bReader.readLine());

		aWeight[1] = Integer.parseInt(st.nextToken());
		bWeight[1] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(bReader.readLine());

		aWeight[2] = Integer.parseInt(st.nextToken());
		bWeight[2] = Integer.parseInt(st.nextToken());

		System.out.println((aWeight[0] - aWeight[2]) + " " + (bWeight[0] - bWeight[1]));
	}
}
