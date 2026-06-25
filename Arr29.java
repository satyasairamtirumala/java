public class Arr29 {
    public static void main(String[] args) {
        int arr[]={10,20,10,20,30,40,50};
        int val=-1;
        int res=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=val;
                    count++;
                }
            }
            if(arr[i]!=-1 && count==0){
                if(prime(arr[i])){
                    res++;
                }
            }
        }
        int[] arr2=new int[res];
        for(int i=0;)
    }
    public static boolean prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
  

}
