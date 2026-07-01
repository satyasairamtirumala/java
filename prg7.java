//write a java prg to count number of spaces
public class prg7 {
    public static void main(String[] args) {
       String name="ee  sala cup  namdhu";
       int count=0;
       for(int i=0;i<name.length();i++){
        if(name.charAt(i)==' '){
            count++;
        }
       }
       System.out.println(count-1);
    }
}
