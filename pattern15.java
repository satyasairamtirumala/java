public class pattern15 {
    public static void main(String[] args) {
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i==3 && j==3){
                    System.out.print("$  ");
                }
                else{
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
