//write a java prg to count number of voweils in the given string
public class prg4 {
    public static void main(String[] args) {
        String name="Ding Dong";
        int count=0;
        String vowel="AEIOUaeiou";
        for(int i=0;i<name.length();i++){
            // if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'||name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U'){
            //     count++;
            // }
            if(vowel.contains(name.charAt(i)+""))
                count++;
        }
        System.out.println(count);
    }
    
}
