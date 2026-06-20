public class Arr24 {
    public static void main(String[] args) {
        int a[]={10,20,30,40,10,20,45};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=-1;
                }
            }
            if(a[i]!=-1){
                System.out.println(a[i]);
            }
        }
    }
}
