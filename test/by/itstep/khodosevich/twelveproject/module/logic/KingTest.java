package by.itstep.khodosevich.twelveproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.twelveproject.module.logic.King.*;

public class KingTest {

    @Test
    public void isValidKingStepPositiveYes() {
        int[] startPoint = {5, 3};
        int[][] stepPoint = {{5, 2}, {5, 4}, {4, 3}, {6, 3}, {4, 2}, {4, 4}, {6, 2}, {6, 4}};
        String expected = "YES";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidKingStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void isValidKingStepPositiveNo() {
        int[] startPoint = {5, 3};
        int[][] stepPoint = {{5, 5}, {3, 3}, {3, 5}, {7, 1}, {3, 1}, {1, 7}, {7, 5}, {7, 3}, {5, 3}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidKingStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

}
