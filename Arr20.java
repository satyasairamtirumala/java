public class Arr20 {
    public static void main(String[] args) {
        int[] arr={2,0,4,2,13,6,10,4,1};
        
            for(int j=1;j<=10;j++){
                int count =0;
                for(int i=0;i<arr.length;i++){
                    if(j==arr[i]){
                        count ++;
                        break;

                    }
                }
                if(count==0){
                    System.out.println(j);
                }

            }
        
    }
}
