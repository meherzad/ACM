import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Acm1123 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String str = bReader.readLine();
		String output = str;
		if (str.equals(new StringBuffer(str).reverse().toString())) {
			System.out.println(str);
		} else {
			if (str.length() % 2 == 0) {
				int tmp = str.length() / 2;
				if (str.charAt(tmp) > str.charAt(tmp - 1)) {
					output = new BigInteger(output.substring(0, tmp)).add(new BigInteger("1")).toString();
					output = output + new StringBuffer(output).reverse().toString();
					System.out.println(output);
				} else {
					if (new StringBuffer(output.substring(0, tmp)).reverse().toString().compareTo(output.substring(tmp, output.length())) >= 0) {
						output = output.substring(0, tmp) + new StringBuffer(output.substring(0, tmp)).reverse().toString();
						System.out.println(output);
					} else {
						output = new BigInteger(output.substring(0, tmp)).add(new BigInteger("1")).toString();
						output = output + new StringBuffer(output).reverse().toString();
						System.out.println(output);
					}
				}
			} else {
				int tmp = str.length() / 2;
				if (new StringBuffer(str.substring(0, tmp)).reverse().toString().compareTo(str.substring(tmp + 1, str.length())) >= 0) {
					output = str.substring(0, tmp + 1) + new StringBuffer(str.substring(0, tmp)).reverse().toString();
					System.out.println(output);
				} else {
					output = new BigInteger(str.substring(0, tmp + 1)).add(new BigInteger("1")).toString();
					output = output + new StringBuffer(output.substring(0, output.length() - 1)).reverse().toString();
					System.out.println(output);
				}
			}
		}
	}
}
