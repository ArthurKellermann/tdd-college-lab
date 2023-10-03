package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Cinema;
import entities.Seat;
import entities.User;

class TestCinema {

	private Cinema cinema;
	private User user;

	@BeforeEach
	public void setUp() {
		cinema = new Cinema();
		user = new User("Arthur", "arthur@gmail.com", "92673845610");
	}

	// Should be able to select a seat
	@Test
	void testSelectSeat() {
		Seat seat = new Seat("A2");
		user.setSeat(seat);

		boolean canceledSeat = cinema.selectSeat(seat.getRow(), seat.getColumn(), user);

		assertTrue(canceledSeat);
	}

	// Should be able to cancel a seat
	@Test
	void testCancelSeat() {
		Seat seat = new Seat("A5");
		user.setSeat(seat);

		boolean canceledSeat = cinema.cancelSeat(seat.getRow(), seat.getColumn());

		assertTrue(canceledSeat);
	}

	// Should be able to return the number of seats
	@Test
	void testNumberOfSeats() {
		Cinema cinema = new Cinema();
		Seat seat = new Seat("B7");

		user.setSeat(seat);
		cinema.selectSeat(seat.getRow(), seat.getColumn(), user);

		String numberOfSeats = cinema.numberOfSeats();
		String expectedString = "Number of occupied seats: 1\nNumber of free seats: 143";

		assertEquals(expectedString, numberOfSeats);
	}

	// Should be able to return a user by seat
	@Test
	void testGetUserBySeat() {
		Seat seat = new Seat("K5");
		user.setSeat(seat);

		cinema.selectSeat(seat.getRow(), seat.getColumn(), user);

		User newUser = cinema.getUserBySeat(seat);

		assertEquals(user, newUser);
	}

	// Should be able to return a integer according to the number in the array
	@Test
	void testParseCharToIntMethod() {
		assertEquals(1, cinema.parseCharToInt('B'));
		assertEquals(11, cinema.parseCharToInt('L'));
	}

}
