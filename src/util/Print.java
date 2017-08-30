package util;

/**
 * used to output the result of an array
 * separate to two conditions:
 *      1. the element of array is an Object, when can use with for...each circle
 *      2. the element of array is an primary type, when can not use with for...each circle, and generic paradigm
 *          so had to use while circle independently
 */
public class Print {

    /**
     * used to output an array whose element is Object
     * @param array array waited to be printed
     * @param <T> the type of the array
     */
    public static<T> void printArray(T[] array) {
        for (T ele : array) {
            System.out.println(ele);
        }
    }

    /**
     * used to output an byte type array
     * @param bytes byte type array waited to be print
     */
    public static void printArrayByte(byte[] bytes) {
        int i = 0;
        while (i < bytes.length) {
            System.out.println(bytes[i++]);
        }
    }

    /**
     * used to output an int type array
     * @param ints int type array waited to be printed
     */
    public static void printArrayInt(int[] ints) {
        int i = 0;
        while (i < ints.length) {
            System.out.println(ints[i++]);
        }
    }

    /**
     * used to output a long type array
     * @param longs long type array waited to be printed
     */
    public static void printArrayLong(long[] longs) {
        int i = 0;
        while (i < longs.length) {
            System.out.println(longs[i]);
        }
    }

    /**
     * used to output a float type array
     * @param floats float type array waited to be printed
     */
    public static void printArrayFloat (float[] floats) {
        int i = 0;
        while (i < floats.length) {
            System.out.println(floats[i++]);
        }
    }

    /**
     * used to output a double type array
     * @param doubles double type array waited to be printed
     */
    public static void PrintArrayDouble(double[] doubles) {
        int i = 0;
        while (i < doubles.length) {
            System.out.println(doubles[i++]);
        }
    }
}
