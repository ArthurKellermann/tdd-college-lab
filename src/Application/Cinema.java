package Application;

import java.util.List;

import Entities.User;

public class Cinema {

	private static final int NUMBER_ROW = 12;
	private static final int NUMBER_COLUMNS = 14;

	private List<User> users;
	private Seat seats[][];

	public Cinema() {
		seats = new Seat[NUMBER_ROW][NUMBER_COLUMNS];
	}

	public void chooseSeat(char row, int column, Seat clientName) {
		int rowNumber = Cinema.parseChatToInt(row);
		seats[rowNumber][column] = clientName;
	}

	public static int parseChatToInt(char row) {
		char listLetters[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L' };
		for (int i = 0; i < listLetters.length; i++) {
			if (row == listLetters[i]) {
				return i;
			}
		}
		return -1;
	}

	public void showSeats() {
		for (int l = 0; l < seats.length; l++) {
			for (int c = 0; c < seats[0].length; c++) {
				if(seats[l][c] == null) {
					seats[l][c] = null;
				}
				System.out.print(seats[l][c] + " ");
			}
			System.out.println(" ");
		}}

}
