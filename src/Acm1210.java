import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Acm1210 {
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Integer t, tmp, cost;
		Node node = new Node("0.1", null, 0);
		String val;
		t = Integer.parseInt(READER.readLine());
		StringTokenizer st;
		for (Integer counter = 1; counter <= t; counter++) {
			tmp = Integer.parseInt(READER.readLine());

			for (Integer counter1 = 1; counter1 <= tmp; counter1++) {
				st = new StringTokenizer(READER.readLine());
				while (!"0".equals(val = st.nextToken())) {
					cost = Integer.parseInt(st.nextToken());
					Node temp = new Node(counter.toString(), counter.toString() + "." + counter1.toString(), cost);

					node.add(counter - 1, Integer.valueOf(counter - 1) + "." + val.toString(), temp);
				}
			}
		}
	}

	private static class Node {
		private String level;

		private String identifier;

		private List<Node> children;

		private int cost;

		public List<Node> getChildren() {
			return children;
		}

		public void add(int level, String parent, Node temp) {
			List<Node> tmp = Collections.singletonList(this);
		}

		public String getLevel() {
			return level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public void setChildren(List<Node> children) {
			this.children = children;
		}

		public void setChildren(Node child) {
			this.children.add(child);
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public String getIdentifier() {
			return level;
		}

		public void setIdentifier(String identifier) {
			this.level = identifier;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [level=").append(level).append(", identifier=").append(identifier).append(", children=").append(children).append(", cost=").append(cost).append("]");
			return builder.toString();
		}

		public Node(String level, String identifier, int cost) {
			this.level = level;
			this.identifier = identifier;
			this.children = new ArrayList<Acm1210.Node>();
			this.cost = cost;
		}
	}
}
