import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm1893 {
	private static final String WINDOW = "window";
	private static final String AISLE = "aisle";
	private static final String NEITHER = "neither";
	private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String output, seatNumber, seat = bReader.readLine();
		int rowNumber;

		rowNumber = Integer.parseInt(seat.substring(0, seat.length() - 1));
		seatNumber = seat.substring(seat.length() - 1, seat.length());

		if (rowNumber < 3) {
			if (seatNumber.charAt(0) == 65 || seatNumber.charAt(0) == 68) {
				output = WINDOW;
			} else {
				output = AISLE;
			}

		} else if (rowNumber < 21) {
			if (seatNumber.charAt(0) == 65 || seatNumber.charAt(0) == 70) {
				output = WINDOW;
			} else {
				output = AISLE;
			}
		} else {
			if (seatNumber.charAt(0) == 65 || seatNumber.charAt(0) == 75) {
				output = WINDOW;
			} else if (seatNumber.charAt(0) == 67 || seatNumber.charAt(0) == 68 || seatNumber.charAt(0) == 72 || seatNumber.charAt(0) == 71) {
				output = AISLE;
			} else {
				output = NEITHER;
			}
		}
		System.out.println(output);
	}
}
