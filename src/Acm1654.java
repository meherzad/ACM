import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Acm1654 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String str = bReader.readLine();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (stack.size() > 0 && stack.peek() == str.charAt(i)) {
				stack.pop();
			} else {
				stack.push(str.charAt(i));
			}
		}
		StringBuilder sb = new StringBuilder(stack.size());
		for (Character c : stack.toArray(new Character[stack.size()]))
		    sb.append(c.charValue());

		
		System.out.println(sb.toString());
	}
}
