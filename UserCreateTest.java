import org.junit.Test;
import static org.junit.Assert.*;

public class UserCreateTest {
	private class User {
		String name = "Default";
		int age;
		int monthsAge;
		
		public User(String name, int age) {
			name = name;
			age = age;
			monthsAge = age * 12;
		}
	}

	@Test
	public void testUserCreation() {
		User u = new User("Test User", 20);
		assertTrue(u.name.equals("Test User"));
		assertTrue(u.age == 20);
		assertTrue(u.monthsAge == 240);
	}
}
