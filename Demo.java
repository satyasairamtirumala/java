
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr={{10,20,30},
                    {40,50,60}
        };
        // System.out.println(arr);
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[0].length);
        // System.out.println(arr[1].length);
        System.out.println("Enter the nof rows");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns");
        int col=sc.nextInt();
        int [][] arr1=new int[row][col];
        for (int i = 0; i <arr1.length; i++) {
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }            
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[j][i]);
            }
            System.out.println("");
        }
        }


}