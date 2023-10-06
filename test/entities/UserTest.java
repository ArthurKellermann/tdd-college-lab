package test.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.entities.User;

class UserTest {

	private User user;

	@BeforeEach
	public void setUp() {
		user = new User("Pedro", "pedro@gmail.com", "69267023453");
	}

	// Should be able to return true if is a valid cpf
	@Test
	void testIsCpf() {
		assertTrue(user.isCpf(user.getCpf()));
		assertFalse(user.isCpf("11111111111"));
		assertFalse(user.isCpf("0965745672"));
	}

	// Should be able to return true if is a valid email
	@Test
	void testIsEmail() {
		assertTrue(user.isEmail(user.getEmail()));
		assertFalse(user.isEmail("pedro.com"));
	}

}
