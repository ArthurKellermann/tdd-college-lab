package entities;

import exceptions.AppException;

public class Cinema {

	private static final int NUMBER_ROWS = 12;
	private static final int NUMBER_COLUMNS = 14;

	private User[][] seats;
	private char[][] seatsUI;
	private char[] listLetters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L' };

	public Cinema() {
		this.seats = new User[NUMBER_ROWS][NUMBER_COLUMNS];
		this.seatsUI = new char[NUMBER_ROWS][NUMBER_COLUMNS];

		for (int l = 0; l < seatsUI.length; l++) {
			for (int c = 0; c < seatsUI.length; c++) {
				seatsUI[l][c] = '▢';
			}
		}
	}

	public boolean selectSeat(char row, int column, User client) {
		int rowNumber = parseCharToInt(row);
		seats[rowNumber][column - 1] = client;
		seatsUI[rowNumber][column - 1] = 'X';

		return true;

	}

	public boolean cancelSeat(char row, int column) {
		int rowNumber = parseCharToInt(row);
		seats[rowNumber][column - 1] = null;
		seatsUI[rowNumber][column - 1] = '▢';

		return true;

	}

	public String numberOfSeats() {
		int numberOfOccupiedSeats = 0;
		int numberOfFreeSeats = 0;

		for (int l = 0; l < seatsUI.length; l++) {
			for (int c = 0; c < seatsUI[l].length; c++) {
				if (seatsUI[l][c] == 'X') {
					numberOfOccupiedSeats++;
				} else if (seatsUI[l][c] == '▢') {
					numberOfFreeSeats++;
				}
			}
		}

		return ("Number of occupied seats: " + numberOfOccupiedSeats + "\nNumber of free seats: " + numberOfFreeSeats);
	}

	public User getUserBySeat(Seat seat) {
		try {
			int column = seat.getColumn();
			int row = parseCharToInt(seat.getRow());

			User user = seats[row][column - 1];

			if (user == null) {
				throw new AppException("User does not exists");
			}

			return user;
		} catch (AppException e) {
			System.err.println("Error: " + e);
		}

		return null;
	}

	public int parseCharToInt(char row) {
		for (int i = 0; i < listLetters.length; i++) {
			if (row == listLetters[i]) {
				return i;
			}
		}
		return -1;
	}

	public void showSeats() {
		System.out.println("   1  2  3  4  5  6   7  8  9  10 11 12");
		System.out.println(" |-------------------------------------|");

		for (int l = 0; l < seatsUI.length; l++) {
			System.out.print(listLetters[l] + "| ");
			for (int c = 0; c < seatsUI.length; c++) {

				System.out.print(seatsUI[l][c] + "  ");
			}
			System.out.println(" ");
		}

		System.out.println();
		System.out.println("---------------- SCREEN ----------------");
		System.out.println();

	}

}
