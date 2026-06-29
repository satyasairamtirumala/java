//write a java prg to print even index position characters
public class Prg2 {
    public static void main(String[] args) {
        String name="java";
        for (int i = 0; i <name.length(); i++) {
            if(i%2==0){
                System.out.println(name.charAt(i));
            }
        }
    }
}
