package HW02;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class ArrayListUtilsTest {
    @Test
    public void testSum() {
        ArrayListUtils arrayListUtils = new ArrayListUtils();
        ArrayList<Integer> arr01 = new ArrayList<Integer>();
        int testArrSum;
        arr01.add(1);
        arr01.add(2);
        arr01.add(3);
        testArrSum = ArrayListUtils.sum(arr01);
        assertEquals(true, testArrSum == 6);
    }
}
