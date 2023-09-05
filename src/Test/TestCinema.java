package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Entities.Cinema;
import Entities.User;

class TestCinema {

	//Should be able to return a int
	@Test
	void test() {
		Cinema cinema = new Cinema();
		assertEquals(cinema.parseChatToInt('A'), 0);
	}

}
