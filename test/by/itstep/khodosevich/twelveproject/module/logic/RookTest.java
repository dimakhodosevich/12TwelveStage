package by.itstep.khodosevich.twelveproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.twelveproject.module.logic.Rook.*;

public class RookTest {

    @Test
    public void isValidRookStepPositiveYes() {
        int[] startPoint = {4, 4};
        int[][] stepPoint = {{4, 5}, {4, 3}, {4, 1}, {4, 8}, {5, 4}, {3, 4}, {1, 4}, {8, 4}};
        String expected = "YES";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidRookStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void isValidRookStepPositiveNo() {
        int[] startPoint = {4, 4};
        int[][] stepPoint = {{5, 5}, {3, 3}, {3, 5}, {5, 3}, {7, 1}, {1, 7}, {1, 1}, {7, 7}, {4, 4}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidRookStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

}
