package util;

/**
 * used to complete some type array change to another type array
 */
public class ChangeType {

    /**
     * change Integer type array to int type array
     * @param integers an integer type array waited to be changed
     * @return return the result of an int type array {@code ints} changed to
     */
    public static int[] Integers2ints(Integer[] integers) {
        int[] ints = new int[integers.length];
        int i = 0;
        while (i < integers.length) {
            ints[i] = integers[i++].intValue();
        }
        return ints;
    }

    /**
     * change int type array to Integer type aaray
     * @param ints an int type array waited to be changed
     * @return return the result of an Integer array {@code integers} changed to
     */
    public static Integer[] ints2Integers(int[] ints) {
        Integer[] integers = new Integer[ints.length];
        int i = 0;
        while (i < ints.length) {
            integers[i] = Integer.valueOf(ints[i++]);
        }
        return integers;
    }

    /**
     * used to change String array to int array
     * @param strings an string array waited to be changed
     * @return return the result of an int array {@code ints} changed to
     */
    public static int[] Strings2ints(String[] strings) {
        int[] ints = new int[strings.length];
        int i = 0;
        while (i < strings.length) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }

    /**
     * used to change int array to String array
     * @param ints an int array waited to be changed
     * @return return the result of an String array {@code strings} changed to
     */
    public static String[] ints2String(int[] ints) {
        String[] strings = new String[ints.length];
        int i = 0;
        while (i < ints.length) {
            strings[i] = Integer.toString(ints[i]);
        }
        return strings;
    }

    /**
     * used to change String array to Integer array
     * @param strings an String array waited to be changed
     * @return return the result of an Integer array {@code integers} changed to
     */
    public static Integer[] Strings2Integers(String[] strings) {
        Integer[] integers = new Integer[strings.length];
        int i = 0;
        while (i < strings.length) {
            integers[i] = Integer.valueOf(strings[i]);
        }
        return integers;
    }

    /**
     * used to change Integer array to String array
     * @param integers an Integer array waited to be change
     * @return return the result of String array {@code strings} changed to
     */
    public static String[] Integers2Strings(Integer[] integers) {
        String[] strings = new String[integers.length];
        int i = 0;
        while (i < integers.length) {
            strings[i] = integers[i].toString();
        }
        return strings;
    }
}
