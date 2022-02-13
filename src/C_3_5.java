//to be fixed
public class C_3_5 {
    private static int i;
    private static int j;
    private static int n;
    private static int c;
    private static TOWARD t;

    private static enum TOWARD {east, south, west, north}

    private static void toggle() {
        switch (t) {
            case east -> t = TOWARD.south;
            case south -> t = TOWARD.west;
            case west -> t = TOWARD.north;
            case north -> t = TOWARD.east;
        }
    }

    private static boolean hasNext(int[][] a) {
        switch (t) {
            case north -> {
                if (j != 0 && a[i][j] == 0) {
                    return true;
                }
            }
            case east -> {
                if (i != n && a[i][j] == 0) {
                    return true;
                }
            }
            case south -> {
                if (j != n && a[i][j] == 0) {
                    return true;
                }
            }
            case west -> {
                if (i != 0 && a[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void move(int[][] a) {
        switch (t) {
            case east -> j++;
            case south -> i++;
            case west -> j--;
            case north -> i--;
        }
        if (j==n)j--;if (j==-1)j++;if (i==n)i--;if (i==-1)i++;
    }

    public static void main(String[] args) {
        n = 5;
        var arr = new int[n][n];
        t = TOWARD.east;
        i = 0;
        j = 0;
        c = 1;
        while (true) {
            if (i == n / 2 && j == n / 2 ) {
                break;
            }
            if (hasNext(arr)) {
                arr[i][j] = c;
                c++;
                move(arr);
            } else {
                toggle();move(arr);
            }
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.printf("%d\t", arr[k][l]);
            }
            System.out.println();
        }
    }
}
