//write  a java prg to count number of alphabets , digits and special characters
public class Prg3 {
    public static void main(String[] args) {
        String name="Satya@123";
        int a=0,d=0,c=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)>='a'&&name.charAt(i)<='z'){
                a++;
            }
            else if(name.charAt(i)>='0' && name.charAt(i)<='9'){
                d++;
            }
            else{
               c++;
            }
        }
        System.out.println("ALphabets"+a+"");
    }
}
