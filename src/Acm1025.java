import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Acm1025 {
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int out, limit, n = Integer.parseInt(READER.readLine());

		int[] groupFormation = new int[n];
		StringTokenizer st = new StringTokenizer(READER.readLine());
		for (int i = 0; i < n; i++) {
			groupFormation[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(groupFormation);
		limit = n / 2 + 1;
		out = 0;
		for (int i = 0; i < limit; i++) {
			out += groupFormation[i] / 2 + 1;
		}
		System.out.println(out);
	}
}
