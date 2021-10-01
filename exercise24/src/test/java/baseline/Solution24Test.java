package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram() {
        String input1 = "tone";
        String input2 = "note";

        assertEquals(true,Solution24.isAnagram(input1, input2));

    }
}