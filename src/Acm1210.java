import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Acm1210 {
	private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		Integer t, tmp;
		long cost;
		Node node = new Node("0.1", null, 0);
		String val;
		t = Integer.parseInt(READER.readLine());
		StringTokenizer st;

		Map<Integer, List<Node>> map = new HashMap<Integer, List<Node>>();
		for (Integer counter = 1; counter <= t; counter++) {
			tmp = Integer.parseInt(READER.readLine());

			for (Integer counter1 = 1; counter1 <= tmp; counter1++) {
				st = new StringTokenizer(READER.readLine());
				while (!"0".equals(val = st.nextToken())) {
					cost = Integer.parseInt(st.nextToken());
					Node temp = new Node(counter.toString() + "." + counter1.toString(), Integer.valueOf(counter - 1) + "." + val.toString(), cost);

					if (map.containsKey(counter)) {
						map.get(counter).add(temp);
					} else {
						List<Node> l = new ArrayList<Acm1210.Node>();
						l.add(temp);
						map.put(counter, l);
					}
				}
			}
			if (counter + 1 <= t) {
				READER.readLine();
			}
		}

		// for (int i : map.keySet()) {
		// System.out.println(map.get(i));
		// }

		Long temp, min;
		min = Long.MAX_VALUE;
		for (Node n : map.get(t)) {
			temp = rec(n, map);
			if (temp < min) {
				min = temp;
			}
		}
		System.out.println(min);
	}

	private static long rec(Node node, Map<Integer, List<Node>> map) {
		if (node.getParentIdentifier().startsWith("0")) {
			return node.getCost();
		}
		String parent = node.getParentIdentifier();

		List<Node> parents = map.get(Integer.parseInt(parent.substring(0, 1)));
		Long temp, min;
		min = Long.MAX_VALUE;
		for (Node n : parents) {
			if (n.getIdentifier().equals(parent)) {
				temp = rec(n, map) + node.getCost();
				if (min > temp) {
					min = temp;
				}
			}
		}

		return min;
	}

	private static class Node {
		private String identifier;

		private String parentIdentifier;

		private long cost;

		public String getIdentifier() {
			return identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getParentIdentifier() {
			return parentIdentifier;
		}

		public void setParentIdentifier(String parentIdentifier) {
			this.parentIdentifier = parentIdentifier;
		}

		public long getCost() {
			return cost;
		}

		public Node(String identifier, String parentIdentifier, long cost) {
			super();
			this.identifier = identifier;
			this.parentIdentifier = parentIdentifier;
			this.cost = cost;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [identifier=").append(identifier).append(", parentIdentifier=").append(parentIdentifier).append(", cost=").append(cost).append("]");
			return builder.toString();
		}

	}
}
