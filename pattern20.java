public class pattern20 {
    public static void main(String[] args) {
        int row=4;
        for (int i = 1; i <= row; i++) {
            for(int j=1;j<=row;j++){
                
                if(i+j>=row+1){
                    if(i==3 && j==4){
                        System.out.print("$");
                    }
                    else{
                    System.out.print("* ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
