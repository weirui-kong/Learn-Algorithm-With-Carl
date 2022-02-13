public class C_3_4_2 {
    public static void main(String[] args) {
        final var s = 12;
        var num = new int[]{4, 6, 2, 4, 9, 8, 7};
        //process
        int i = 0;
        int sum = 0;
        int r = Integer.MAX_VALUE;
        for (int j = 0; j < num.length; j++) {
            sum += num[j];
            while (sum > s) {
                int len = j - i + 1;
                r = Math.min(r, len);
                sum -= num[i];
                i++;
            }
        }
        System.out.println(r == Integer.MAX_VALUE ? 0 : r);
    }
}
