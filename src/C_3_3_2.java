public class C_3_3_2 {
    public static void main(String[] args) {
        int[] num = new int[]{-1, 0, 2, 3, 1, -1};//six figures with double -1
        int slowIndex = 0;
        int fastIndex = 0;
        int value = -1;
        for (int i = 0; fastIndex < num.length; fastIndex++) {
            if (num[fastIndex] != value) {
                num[slowIndex++] = num[fastIndex];
            }
        }
        System.out.println(slowIndex);
    }
}
