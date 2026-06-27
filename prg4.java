//write a java prg to find sum of diagonal elements
public class prg4 {
    public static void main(String[] args) {
        int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
