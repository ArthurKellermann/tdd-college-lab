package Entities;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

	private static final int NUMBER_ROW = 12;
	private static final int NUMBER_COLUMNS = 14;

	private List<User> users;
	private User seats[][];
	private char seatsUI[][];
	char listLetters[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L' };;

	public Cinema() {
		this.seats = new User[NUMBER_ROW][NUMBER_COLUMNS];
		this.seatsUI = new char[NUMBER_ROW][NUMBER_COLUMNS];
		this.users = new ArrayList<>();

		for (int l = 0; l < seatsUI.length; l++) {
			for (int c = 0; c < seatsUI.length; c++) {
				seatsUI[l][c] = '▢';
			}
		}
	}

	public boolean chooseSeat(char row, int column, User client) {
		int rowNumber = parseCharToInt(row);
		seats[rowNumber][column] = client;
		seatsUI[rowNumber][column - 1] = 'X';
		return true;

	}

	public int parseCharToInt(char row) {
		for (int i = 0; i < listLetters.length; i++) {
			if (row == listLetters[i]) {
				return i;
			}
		}
		return -1;
	}

	public void printArray() {
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

	}

}
