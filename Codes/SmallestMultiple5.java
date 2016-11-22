//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

import java.util.*;

public class SmallestMultiple5{ 
public static void main(String[] args) {
        long result = 1;
        int upLimit = 20;
        Set<Integer> digits = new HashSet<Integer>();
        for (int i = 1; i <= upLimit; i++) {
            if (result % i != 0) {
                digits.add(i);
                result *= i;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0 && result % j == 0) {
                        if (digits.contains(j)) {
                            result /= j;
                            digits.remove(j);
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
