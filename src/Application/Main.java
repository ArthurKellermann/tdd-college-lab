package Application;

import java.util.Scanner;

import Entities.Cinema;
import Entities.Seat;
import Entities.User;

public class Main {

	private static Scanner in = new Scanner(System.in);
	private static Cinema cinema = new Cinema();

	public static void main(String[] args) {
		User user = Main.registerUser();
		menu(user);

		System.out.println("Thank you, " + user.getName());
		in.close();
	}

	private static void menu(User user) {
		int count = 1;

		do {
			System.out.println("Enter the next action: ");
			System.out.println(
					"1 - Select a seat\n2 - Delete a seat\n3 - List all seats\n4 - Show the number of free/occupied seats\n5 - Select a user by seat\n0 - Exit");
			int option = in.nextInt();
			in.nextLine();

			switch (option) {

			case 0:
				count = 0;
				break;
			case 1:
				cinema.showSeats();
				selectSeat(user);
				break;
			case 2:
				cinema.showSeats();
				deleteSeat();
				break;
			case 3:
				cinema.showSeats();
				break;
			case 4:
				showNumberOfSeats();
				break;
			case 5: 
				getUserBySeat();
				break;
			default:
				System.out.println("Select a valid option");
				break;
			}

		} while (count != 0);

		System.out.println();

		return;
	}

	private static User registerUser() {
		System.out.println("...REGISTER...");
		
		User user = new User();

		System.out.print("Name: ");
		String name = in.nextLine();
		user.setName(name);

		System.out.print("Email: ");
		String mail = in.nextLine();
		user.setEmail(mail);

		System.out.print("Cpf: ");
		String cpf = in.nextLine();
		user.setcpf(cpf);

		return user;
	}

	private static void selectSeat(User user) {
		String option;

		do {
			System.out.print("Choose a seat: ");
			String seatCode = in.nextLine();

			Seat seat = new Seat(seatCode);

			user.setSeat(seat);

			cinema.selectSeat(seat.getRow(), seat.getColumn(), user);
			System.out.println();

			cinema.showSeats();

			System.out.print("Would you like to select one more? (Yes/No): ");
			option = in.nextLine();

			System.out.println();

		} while (option.equalsIgnoreCase("Yes"));

		return;
	}

	private static void deleteSeat() {
		String option;

		do {
			System.out.print("Choose a seat to delete: ");

			String seatCode = in.nextLine();
			Seat seat = new Seat(seatCode);

			cinema.cancelSeat(seat.getRow(), seat.getColumn());
			System.out.println();

			cinema.showSeats();

			System.out.print("Would you like to delete one more? (Yes/No): ");
			option = in.nextLine();

			System.out.println();

		} while (option.equalsIgnoreCase("Yes"));

		return;

	}

	private static void showNumberOfSeats() {
		String numberOfSeats = cinema.numberOfSeats();

		System.out.println();
		System.out.println(numberOfSeats);
		System.out.println();

		return;
	}

	private static void getUserBySeat() {
		System.out.print("Choose a seat: ");
		String seatCode = in.nextLine();

		Seat seat = new Seat(seatCode);

		User user = cinema.getUserBySeat(seat);
		
		System.out.println(user);

		System.out.println();

		return;

	}

}
