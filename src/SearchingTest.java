import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchingTest {

    @Test
    public void testSkipping() {
        assertEquals(-1, Searching.skipping(new int[]{1,2,3,4,5,6,7,8,9,10}, 0, 3));
    }
}