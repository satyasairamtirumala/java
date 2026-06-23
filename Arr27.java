//write a java prg to print duplicatie prime elements from given array
public class Arr27 {
    public static void main(String[] args) {
        int arr[]={10,13,10,11,25,13,10,11};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>0){
                if(prime(arr[i])){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static boolean  prime(int n){
        for(int i=3;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
