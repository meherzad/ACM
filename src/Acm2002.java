import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Acm2002 {
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(bReader.readLine());
		Map<String, User> userMap = new HashMap<String, Acm2002.User>();
		StringTokenizer st;
		String tmp, out, username, pass;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bReader.readLine());
			tmp = st.nextToken();

			if ("register".equals(tmp)) {
				username = st.nextToken();
				pass = st.nextToken();
				if (userMap.containsKey(username)) {
					out = "fail: user already exists";
				} else {
					userMap.put(username, new User(username, pass));
					out = "success: new user added";
				}

			} else if ("login".equals(tmp)) {
				username = st.nextToken();
				pass = st.nextToken();
				if (!userMap.containsKey(username)) {
					out = "fail: no such user";
				} else {
					User user = userMap.get(username);
					if (!user.getPass().equals(pass)) {
						out = "fail: incorrect password";
					} else if (user.isLoggedIn()) {
						out = "fail: already logged in";
					} else {
						user.setLoggedIn(true);
						out = "success: user logged in";
					}
				}

			} else {
				username = st.nextToken();
				if (!userMap.containsKey(username)) {
					out = "fail: no such user";
				} else {
					User user = userMap.get(username);
					if (user.isLoggedIn()) {
						user.setLoggedIn(false);
						out = "success: user logged out";
					} else {
						out = "fail: already logged out";
					}
				}
			}
			System.out.println(out);
		}

	}

	private static class User {
		private String username;
		private String pass;
		private boolean isLoggedIn;

		public User(String username, String pass) {
			super();
			this.username = username;
			this.pass = pass;
			this.isLoggedIn = false;
		}

		public String getUsername() {
			return username;
		}

		public void setLoggedIn(boolean isLoggedIn) {
			this.isLoggedIn = isLoggedIn;
		}

		public String getPass() {
			return pass;
		}

		public boolean isLoggedIn() {
			return isLoggedIn;
		}

	}
}
