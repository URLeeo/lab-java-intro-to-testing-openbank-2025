package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OddNumbersTest {

    @Test
    void returnsOddNumbersFrom1ToN() {
        assertArrayEquals(new int[]{1,3,5,7,9}, OddNumbers.getOdds(10));
        assertArrayEquals(new int[]{1,3,5}, OddNumbers.getOdds(5));
        assertArrayEquals(new int[]{1}, OddNumbers.getOdds(1));
    }

    @Test
    void whenNIs0OrNegative_returnsEmptyArray() {
        assertArrayEquals(new int[]{}, OddNumbers.getOdds(0));
        assertArrayEquals(new int[]{}, OddNumbers.getOdds(-5));
    }
}