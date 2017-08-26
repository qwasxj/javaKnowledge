package algorithm;

import java.util.Scanner;

/**
 * used to calculate the section sum by algorithm
 *
 * separate to three condition:
 *      1. calculate a int type array's section sum
 *      2. calculate a int type array's section sum and pass function the array's length
 *      3. calculate section sum directly from input
 *
 * algorithm analyze:
 *      1. two variable, one is result stand for the finally section sum, the other is sum stand for circle sum
 *      2. result was initialized the Integer.MIN_VALUE and assigned the sum when sum lager than result
 *      3. sum was initialized 0 to judge the next element is lager than 0 or not,
 *         and add one element of the int type array, if sum smaller than 0, the next value will be less than 0, so the
 *         the value will change smaller when add the next element, so change sum to 0
 */
public class SectionSum {


    public static int secSum(int[] ints) {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : ints) {
            sum += i;
            if (sum > result) {
                result = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return result;
    }

    public static int secSum(int[] ints, int length) {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += i;
            if (sum > result) {
                result = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return result;
    }


    /**
     * calculate section sum directly from console
     */

    public static void secSum() {
        Scanner sc = new Scanner(System.in);
        // the length of array
        int length = sc.nextInt();
        // result of section sum
        int result = Integer.MIN_VALUE;
        // circle sum
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += sc.nextInt();
            if (sum > result) {
                result = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(result);
    }
}

