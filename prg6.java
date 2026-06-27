//write a java program to find resultant of (addition)
public class prg6 {
    public static void main(String[] args) {
        int[][] arr={{7,3,5},{2,4,6}};
        int[][] arr2={{7,3,5},{2,4,6}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]+=arr2[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
