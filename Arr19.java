public class Arr19 {
    public static void main(String[] args) {
        int[] arr1={3,5,8,2,0,6,-3,1};
        int[] arr2=new int[arr1.length];
        int target=5;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]+arr1[j]==target){
                    System.out.println(arr1[i]+" "+arr1[j]);
                }
            }
        }
    }
}
