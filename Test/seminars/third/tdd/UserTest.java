package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    void userCreationSucceed(){
        User user = new User("Макс", "1йфячыц2");
        user.authenticate("Макс", "1йфячыц2");
        assertTrue(user.isAuthenticate);
    }

    @Test
    void userCreationFailed(){
        User user = new User("Макс", "1йфячыц2");
        assertFalse(user.authenticate("Макс", "12345678"));
    }

    @Test
    void userRepositoryNA(){
        UserRepository userRepository1 = new UserRepository();
        User user = new User("Макс", "1йфячыц2");
        userRepository1.addUser(user);
        assertFalse(userRepository1.findByName(user.name));
    }
    @Test
    void userRepositoryA(){
        UserRepository userRepository1 = new UserRepository();
        User user = new User("Макс", "1йфячыц2");
        user.authenticate("Макс", "1йфячыц2");
        userRepository1.addUser(user);
        assertTrue(userRepository1.findByName(user.name));
    }
    @Test
    void userLogoutAll(){
        UserRepository userRepository1 = new UserRepository();
        User user = new User("Макс", "1йфячыц2", false);
        user.authenticate("Макс", "1йфячыц2");
        userRepository1.addUser(user);
        User user2 = new User("Макс2", "1йфячыц22", true);
        user2.authenticate("Макс2", "1йфячыц22");
        userRepository1.addUser(user2);
        userRepository1.logoutAll();
        assertFalse( user.isAuthenticate||user2.isAuthenticate);

    }
    // HW!!!
    @Test
    void userLogoutIsNotAdmin(){
        UserRepository userRepository1 = new UserRepository();
        User user = new User("Макс", "1йфячыц2", false);
        user.authenticate("Макс", "1йфячыц2");
        userRepository1.addUser(user);
        User user2 = new User("Макс2", "1йфячыц22", true);
        user2.authenticate("Макс2", "1йфячыц22");
        userRepository1.addUser(user2);
        userRepository1.logoutIfNotAdmin();
        assertFalse(user.isAuthenticate);
        assertTrue(user2.isAuthenticate);

    }
}