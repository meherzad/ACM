import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Acm1000 {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bReader.readLine());

		out.println(Integer.parseInt(st.nextToken().trim()) + Integer.parseInt(st.nextToken().trim()));
		out.close();
	}

}
