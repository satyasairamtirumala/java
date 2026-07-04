//finding the longest word in the line
public class prg17 {
    public static void main(String[] args) {
        String str="hello world";
        String word="";
        String big="";
        int count=0;
        String vowel="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word=word+(str.charAt(i));
                if(vowel.contains(str.charAt(i)+"")){
                    count++;
                }

            }
            else{
                
            }

        }
    }
}
-