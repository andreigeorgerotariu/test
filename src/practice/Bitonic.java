package practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Bitonic {

    // Find the greatest value in the array
    int[] numbers = {1, 2, 5, 7, 10, 9, 6, 3};
    //               0  1  2  3  4   5 index values for numbers

    private int getBitonicNumber(int[] numberArray) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > numbers[index + 1]) {
                return numbers[index];
            }
        }
        return 0;
    }

    @Test
    public void testBitonicMethod() {
        assertEquals(10, getBitonicNumber(numbers));
    }
}