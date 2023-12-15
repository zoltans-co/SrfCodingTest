# SRF FizzBuzz coding test
 
## Requirements:

```
Consider the series of numbers beginning at start and running up to but not including end,
so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers,
except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
```

## Example calls, with correct / expected outputs:
```
fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]

fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]

fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
```

## Implementation:

 ```java
package org.example;


import java.util.ArrayList;
import java.util.stream.IntStream;

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
```

## Testing the solution:

 ```java
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
```