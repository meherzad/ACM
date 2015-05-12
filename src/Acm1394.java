import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Acm1394 {

	public static void main(String[] args) throws IOException {

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter bWriter = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bReader.readLine());
		int m, n;

		n = Integer.parseInt(st.nextToken().trim());
		m = Integer.parseInt(st.nextToken().trim());

		int[] shipLength = new int[n];
		int[] rowLength = new int[m];

		for (int i = 0; i < n; i++) {
			shipLength[i] = Integer.parseInt(bReader.readLine().trim());
		}
		for (int i = 0; i < m; i++) {
			rowLength[i] = Integer.parseInt(bReader.readLine().trim());
		}

		bWriter.close();
	}

	static class PossibleCombination {
		private int sum;

		private List<Integer> indexList;

		private boolean isUsed;

		public PossibleCombination(int... indexes) {
			indexList = new ArrayList<Integer>();
			for (int index : indexes) {
				indexList.add(index);
			}
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("PossibleCombination [sum=").append(sum).append(", indexList=").append(indexList).append(", isUsed=").append(isUsed).append("]");
			return builder.toString();
		}
		
		
	}
}
