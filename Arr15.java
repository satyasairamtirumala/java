//print the unique elements of the array
public class Arr15 {
    public static void main(String[] args) {
        int[] arr={10,20,30, 10,40};
        int[]arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean val=true;
           for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                val=false;
                break;
            }
        }
        if(val==true){
            System.out.println(arr[i]);
        }
        }
    }
}
