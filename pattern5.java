public class pattern5 {
    public static void main(String[] args) {
        design28(5);

    }
    static void design5(int n){
        for (int row = 1; row <= 2*n; row++) {
            int totalcolsinrow=row>n?2*n-row:row;
            for (int col = 1; col <=totalcolsinrow; col++) {
                System.out.print(col);

            }
            System.out.println();
        }


    }
    static void design28(int n){
        for (int row = 0; row <= 2*n; row++) {
            int totalcolsinrow=row>n?2*n-row:row;
            int noOfspace=n-totalcolsinrow;
            for(int s=0;s<noOfspace;s++){
                System.out.print(" ");
            }

            for (int col = 0; col <totalcolsinrow; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
}}
