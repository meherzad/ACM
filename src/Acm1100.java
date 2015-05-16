import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Acm1100 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(bReader.readLine());
		StringTokenizer st;
		List<Standing> standings = new ArrayList<Standing>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bReader.readLine());
			standings.add(new Standing(st.nextToken(), st.nextToken()));
		}
		Collections.sort(standings);
		for (Standing standing : standings) {
			System.out.println(standing);
		}
	}

	private static int COUNTER = 0;

	private static class Standing implements Comparable<Standing> {
		int id;
		int solvedProblem;
		int index;

		public Standing(int id, int solvedProblem) {
			this.id = id;
			this.solvedProblem = solvedProblem;
			this.index = COUNTER++;
		}

		public Standing(String id, String solvedProblem) {
			this(Integer.parseInt(id), Integer.parseInt(solvedProblem));
		}

		public int getId() {
			return id;
		}

		public int getSolvedProblem() {
			return solvedProblem;
		}
		

		public int getIndex() {
			return index;
		}

		public int compareTo(Standing arg0) {
			int i;
			i = Integer.compare(arg0.getSolvedProblem(), solvedProblem);
			if (i != 0) {
				return i;
			}
			return Integer.compare(index, arg0.getIndex());
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(id).append(" ").append(solvedProblem);
			return builder.toString();
		}

	}
}
