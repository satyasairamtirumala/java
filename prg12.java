
public class prg12 {
    public static void main(String[] args){
        String name="a3b1c2";
        for(int i=0;i<name.length();i+=2){
            for(int j=0;j<(int)name.charAt(i+1)-48;j++){
                System.out.println(name.charAt(i));
            }
        }
     
    }
}
