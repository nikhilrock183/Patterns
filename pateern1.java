public class pateern1 {
    public static void main(String[] args) {
        design4(4);
    }

    static void design(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    static void design2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

    static void design3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
    static void design4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col);

            }
            System.out.println();
        }

    }

}