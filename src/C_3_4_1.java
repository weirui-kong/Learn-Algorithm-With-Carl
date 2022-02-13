public class C_3_4_1 {
    public static void main(String[] args) {
        final var s = 12;
        var num = new int[]{4, 6, 2, 4, 9, 8, 7};
        //process
        int cnt = num.length + 1;
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = i; j < num.length; j++) {
                sum += num[j];
                if (sum > s) {
                    int len = j - i + 1;
                    if (len < cnt) {
                        cnt = len;
                    }
                }
            }
        }
        System.out.println(cnt == num.length + 1 ? 0 : cnt);
    }
}
