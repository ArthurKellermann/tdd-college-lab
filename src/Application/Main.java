package Application;

import Entities.Cinema;
import Entities.User;

public class Main {
	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		User user = new User("Arthur", "arthur.kellermann956@gmail.com", "232342332");
		cinema.printArray();
		cinema.chooseSeat('A', 1, user);
		System.out.println();
		cinema.printArray();
	}

}
