public class pattern13 {
    public static void main(String[] args) {
        for(int i=0 ;i <=4;i++){
            for(int j=4;j>=1;j--){
                if(j==i){
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
