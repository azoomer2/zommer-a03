package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordVeryWeakValidator() {
        Solution25 solution = new Solution25();
        String pass = "12345";
        int expectedValue = 1;
        int actual = solution.passwordValidator(pass);
        assertEquals(expectedValue,actual);
    }
    @Test
    void passwordWeakValidator() {
        Solution25 solution = new Solution25();
        String pass = "abcdef";
        int expectedValue = 2;
        int actual = solution.passwordValidator(pass);
        assertEquals(expectedValue,actual);
    }
    @Test
    void passwordStrongValidator() {
        Solution25 solution = new Solution25();
        String pass = "abc123xyz";
        int expectedValue = 3;
        int actual = solution.passwordValidator(pass);
        assertEquals(expectedValue,actual);
    }
    @Test
    void passwordVeryStrongValidator() {
        Solution25 solution = new Solution25();
        String pass = "1337h@xor";
        int expectedValue = 4;
        int actual = solution.passwordValidator(pass);
        assertEquals(expectedValue,actual);
    }
    @Test
    void passwordUnknownStrengthValidator() {
        Solution25 solution = new Solution25();
        String pass = "1232345235443";
        int expectedValue = 0;
        int actual = solution.passwordValidator(pass);
        assertEquals(expectedValue,actual);
    }

}