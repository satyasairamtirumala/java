public class pattern16 {
   public static void main(String[] args) {
       for(int i=0;i<=4;i++){
        for(int j=0;j<=i;j++){
             if(i==0){
                System.out.print("$  ");
             }
             else if(i==4 && j==2){
                System.out.print("@  ");
             }
             else{
                System.out.print("*  ");
             }
        }
        System.out.println();
       }
   }
}
