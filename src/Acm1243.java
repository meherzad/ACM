import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Acm1243 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		BigInteger value = new BigInteger(bReader.readLine());
		
		System.out.println(value.mod(new BigInteger("7")));
	}
}
