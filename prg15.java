public class prg15 {
    public static void main(String[] args) {
        String val="this is programming class";
        String[] arr=val.split(" ");
        String max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>max.length()){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
