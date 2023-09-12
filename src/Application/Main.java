package Application;

import java.util.Scanner;

import Entities.Cinema;
import Entities.User;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("...REGISTER...");
		System.out.print("Name: ");
		String name = in.nextLine();
		
		System.out.print("Email: ");
		String mail = in.nextLine();
		
		System.out.print("Cpf: ");
		String cpf = in.nextLine();
		
		User user = new User(name, mail, cpf);
		
		
		Cinema cinema = new Cinema();
		
		System.out.println();
		cinema.printArray();
		
		System.out.print("Choose a seat: ");
		String seat = in.nextLine();
		
		String seatArray[] = seat.split("");
		
		char row = seatArray[0].charAt(0);
		int column = Integer.parseInt((seatArray[2] != null) ? (seatArray[1] + seatArray[2]) : seatArray[1]);
				
		cinema.chooseSeat(row, column, user);
		System.out.println();
		cinema.printArray();
	}

}
