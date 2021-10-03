package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    private ArrayList<Integer> test = new ArrayList<Integer>();

    @BeforeEach
    public void init() {
        test.add(100);
        test.add(200);
        test.add(1000);
        test.add(300);
    }


    @Test
    void average() {
        double actual = Solution36.average(test);
        assertEquals(400.0,actual,0.1);
    }

    @Test
    void max() {
        double actual = Solution36.max(test);
        assertEquals(1000,actual,0.1);
    }

    @Test
    void min() {
        double actual = Solution36.min(test);
        assertEquals(100,actual,0.1);
    }

    @Test
    void std() {
        double actual = Solution36.std(test,400.0);
        assertEquals(353.55,actual,0.1);
    }


}