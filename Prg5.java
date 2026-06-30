//write a java prg to reverse griven String
public class Prg5 {
    public static void main(String[] args) {
        String name="viratkohli";
        String name2="";
        for(int i=0;i<name.length();i++){
            
           if(i%2==0){
             name2=name2+((char)(name.charAt(i)-32));
           }
           else{
            name2=name2+(name.charAt(i));
           }
           
          
        }
        System.out.println(name2);
    }
}
