package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void calcRate() {
        long actual = Solution31.calcRate(55,22,65);

        assertEquals(138,actual);
    }
}