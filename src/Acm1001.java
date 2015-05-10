import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Acm1001 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String... args) throws Exception {
		StringTokenizer tokenizer;
		Stack<Double> stack = new Stack<Double>();
		String line;
		while ((line = reader.readLine()) != null) {
			tokenizer = new StringTokenizer(line);
			while (tokenizer.hasMoreTokens()) {
				stack.add(Math.sqrt(Double.parseDouble(tokenizer.nextToken())));
			}
		}
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}

	}
}
