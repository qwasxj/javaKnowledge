import java.util.Scanner;

public class Test {

    public static int findKthLargest(int[] nums, int k) {
        if (k < 1 || nums == null) {
            return 0;
        }

        return getKth(nums.length - k + 1, nums, 0, nums.length - 1);
    }

    public static int getKth(int k, int[] nums, int start, int end) {

        int pivot = nums[end];

        int left = start;
        int right = end;

        while (true) {

            while (nums[left] < pivot && left < right) {
                left++;
            }

            while (nums[right] >= pivot && right > left) {
                right--;
            }

            if (left == right) {
                break;
            }

            swap(nums, left, right);
        }

        swap(nums, left, end);

        if (k == left + 1) {
            return pivot;
        } else if (k < left + 1) {
            return getKth(k, nums, start, left - 1);
        } else {
            return getKth(k, nums, left + 1, end);
        }
    }

    public static void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }

    public static int[] Strings2ints(String[] strings) {
        int[] ints = new int[strings.length];
        int i = 0;
        while (i < strings.length) {
            ints[i] = Integer.parseInt(strings[i++]);
        }
        return ints;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        temp = temp.trim();
        String[] arrS = temp.split(" ");
        int[] arri = Strings2ints(arrS);

        int k = Integer.parseInt(sc.nextLine());

        int result=findKthLargest(arri, k);
        System.out.println(result);
    }

}