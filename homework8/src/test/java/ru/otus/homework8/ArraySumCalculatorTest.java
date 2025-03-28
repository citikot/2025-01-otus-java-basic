package ru.otus.homework8;

import org.junit.jupiter.api.Test;
import ru.otus.homework8.exception.AppArrayDataException;
import ru.otus.homework8.exception.AppArraySizeException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.otus.homework8.Main.calculateArraySum;

class ArraySumCalculatorTest {

    @Test
    void testCalculateArraySum_Success() throws AppArraySizeException, AppArrayDataException {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        int expectedSum = 136;
        assertEquals(expectedSum, calculateArraySum(validArray));
    }

    @Test
    void testCalculateArraySum_WrongSize() {
        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        assertThrows(AppArraySizeException.class, () -> calculateArraySum(wrongSizeArray));
    }

    @Test
    void testCalculateArraySum_InvalidData() {
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "A", "7", "8"}, // Incorrect element "A"
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        assertThrows(AppArrayDataException.class, () -> calculateArraySum(invalidDataArray));
    }

    @Test
    void testCalculateArraySum_ZeroValues() throws AppArraySizeException, AppArrayDataException {
        String[][] zeroArray = {
                {"0", "0", "0", "0"},
                {"0", "0", "0", "0"},
                {"0", "0", "0", "0"},
                {"0", "0", "0", "0"}
        };

        assertEquals(0, calculateArraySum(zeroArray));
    }

    @Test
    void testCalculateArraySum_NegativeValues() throws AppArraySizeException, AppArrayDataException {
        String[][] negativeArray = {
                {"-1", "-2", "-3", "-4"},
                {"-5", "-6", "-7", "-8"},
                {"-9", "-10", "-11", "-12"},
                {"-13", "-14", "-15", "-16"}
        };

        int expectedSum = -136;
        assertEquals(expectedSum, calculateArraySum(negativeArray));
    }
}

