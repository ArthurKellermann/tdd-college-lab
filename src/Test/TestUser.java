package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Entities.Seat;
import Entities.User;

class TestUser {

	@Test
	void test() {
		User user = new User("Pedro", "pedro@gmail.com", "05426366039");

		assertTrue(user.isCpf(user.getcpf()));
		assertFalse(user.isCpf("11111111111"));
		assertFalse(user.isCpf("A1111111111"));
	}

}
