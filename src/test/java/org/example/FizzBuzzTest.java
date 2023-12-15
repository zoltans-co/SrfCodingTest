package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example calls, with correct / expected outputs:
 * fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
 * fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
 * fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
 */
public class FizzBuzzTest {

    @Test
    // fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
    public void testFall1to6() {
        final String[] expectedResults = new String[]{"1", "2", "Fizz", "4", "Buzz"};
        final var actualResult = new FizzBuzz().fizzBuzz(1, 6);
        assertEquals(Arrays.asList(expectedResults), Arrays.asList(actualResult));
    }

    @Test
    // fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
    public void testFall1to8() {
        final String[] expectedResults = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"};
        final var actualResult = new FizzBuzz().fizzBuzz(1, 8);
        assertEquals(Arrays.asList(expectedResults), Arrays.asList(actualResult));
    }

    @Test
    // fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
    public void testFall1to11() {
        final String[] expectedResults = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};
        final var actualResult = new FizzBuzz().fizzBuzz(1, 11);
        assertEquals(Arrays.asList(expectedResults), Arrays.asList(actualResult));
    }

    @Test
    // fizzBuzz(10, 15) → ["Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
    public void testFall10to15() {
        final String[] expectedResults = new String[]{"Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        final var actualResult = new FizzBuzz().fizzBuzz(10, 16);
        assertEquals(Arrays.asList(expectedResults), Arrays.asList(actualResult));
    }

}