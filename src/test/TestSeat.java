package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Seat;

class TestSeat {

	private Seat seat;
	
	@BeforeEach
	public void setUp() {
		seat = new Seat("E7");
	}

	// Should be able to return the row
	@Test
	void testGetRow() {
		char row = seat.getRow();

		assertEquals('E', row);
	}

	// Should be able to return the column
	@Test
	void testGetColumn() {
		int column = seat.getColumn();

		assertEquals(7, column);
	}

}
