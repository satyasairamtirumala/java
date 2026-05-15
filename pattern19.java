public class pattern19 {
    public static void main(String[] args) {
        // for(int i=1;i<=4;i++){
        //     for(int j=4;j>=i;j--){
        //         System.out.print("   ");
        //     }
        //     for(int k =1;k<=i;k++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }
        int row=4;
        for (int i = 1; i <= row; i++) {
            for(int j=1;j<=row;j++){
                if(i+j>=row+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
