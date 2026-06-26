//write a java prg to find the largest element is 2d array
public class prg1 {
    public static void main(String[] args) {
        int[][] arr={{10,20,30},{40,50,60}
    };
    int max=arr[0][0];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    }
    System.out.println(max);
    }
}
