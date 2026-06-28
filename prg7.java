//
public class prg7 {
    public static void main(String[] args) {
        int[][] arr={{3,1},{2,4}};
        int[][] arr2={{1,3},{4,2}};
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]+=arr[i][i]*arr2[j][j];
            }
        }
        for(int i=0;i<arr[i].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
