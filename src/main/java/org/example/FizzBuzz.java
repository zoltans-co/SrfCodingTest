package org.example;


import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Requirements:
 *
 * Consider the series of numbers beginning at start and running up to but not including end,
 * so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers,
 * except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".

 * Example calls, with correct / expected outputs:
 * fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
 * fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
 * fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
 */
public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        var resultList = new ArrayList<String>();
        IntStream.rangeClosed(start, end - 1).forEach(number -> resultList.add(fizzBuzzLogic(number)));
        return resultList.toArray(String[]::new);
    }

    private String fizzBuzzLogic(final int inputNumber) {
        final String result;

        if (inputNumber % 15 == 0) {
            result = "FizzBuzz";
        } else if (inputNumber % 3 == 0) {
            result = "Fizz";
        } else if (inputNumber % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(inputNumber);
        }

        return result;
    }

}