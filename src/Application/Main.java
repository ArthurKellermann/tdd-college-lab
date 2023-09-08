package Application;

import java.util.Scanner;

import Entities.Cinema;
import Entities.User;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Cinema cinema = new Cinema();
		User user = new User("Arthur", "arthur.kellermann956@gmail.com", "232342332");
		cinema.printArray();
		cinema.chooseSeat('C', 3, user);
		System.out.println();
		cinema.printArray();
	}

}
