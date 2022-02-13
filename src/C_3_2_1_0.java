import java.util.Scanner;

public class C_3_2_1_0 {
    public static int find1(int[] num, int target) {
        // bounded interval: [a, b]
        int left = 0;
        int right = num.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num[mid] > target) {
                right = mid;
            } else if (num[mid] < target) {
                left = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int find2(int[] num, int target) {
        // unbounded interval: [a, b)
        int left = 0;
        int right = num.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (num[mid] > target) {
                right = mid;
            } else if (num[mid] < target) {
                left = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[]{3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(find1(num, sc.nextInt()));
        System.out.println(find2(num, sc.nextInt()));
    }
}
