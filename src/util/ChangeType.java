package util;

/**
 * used to complete some type array change to another type array
 */
public class ChangeType {

    public static int[] Integers2ints(Integer[] integers) {
        int[] ints = new int[integers.length];
        int i = 0;
        while (i < integers.length) {
            ints[i] = integers[i++].intValue();
        }
        return ints;
    }

    public static Integer[] ints2Integers(int[] ints) {
        Integer[] integers = new Integer[ints.length];
        int i = 0;
        while (i < ints.length) {
            integers[i] = Integer.valueOf(ints[i++]);
        }
        return integers;
    }

    public static int[] Strings2ints(String[] strings) {
        int[] ints = new int[strings.length];
        int i = 0;
        while (i < strings.length) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
}
