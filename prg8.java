//write a java prg to count number of words present in given sentence
public class prg8 {
    public static void main(String[] args) {
       String name="sai                          ja";
       int count=0;
       for(int i=0;i<name.length()-1;i++){
        if(name.charAt(i)==' '&&name.charAt(i+1)!=' '){
            count++;
        }
       } 
       System.out.println(count+1);
    }
}
