package org.arllen;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by darllen on 1/22/17.
 */
public class LambdaTest {

    @Test
    public void test() {

        System.out.println(
                Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 7, 19, 18, 200, 3000})
                        .stream()
                        .filter(e -> e % 2 == 0)
                        .filter(LambdaTest::gt3)
                        .map(e -> e % 3 == 0 ? e / 3 : e)
                        .map(e -> e % 100 == 0 ? e / 100 : e)
                        .limit(3)
                        .collect(Collectors.toList()));


        List<Integer> numbers = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 7, 19, 18, 200, 3000});

        System.out.println(totalValue(numbers, e -> e % 2 == 0));
        System.out.println(totalValue(numbers, e -> e % 2 != 0));
    }

    public int totalValue(List<Integer> values, Predicate<Integer> selector) {
        return values.stream()
                .filter(selector)
//                .mapToInt(Integer::intValue)
//                .sum();
                .reduce(0, Integer::sum);
    }

    public static boolean gt3(int number) {
        return number > 3;
    }

}
