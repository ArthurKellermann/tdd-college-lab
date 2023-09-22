package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Cinema;
import entities.User;

class TestCinema {

	//Should be able to return a int
	@Test
	void test() {
		Cinema cinema = new Cinema();
		assertEquals(cinema.parseCharToInt('B'), 1);
	}

}
