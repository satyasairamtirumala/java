public class Prg13 {
    public static void main(String[] args) {
        String name1="car";
        String name2="pka";

        int count=0;
        if(name1.length()==name2.length()){
            
            for(int i=0;i<name1.length();i++){
                for(int j=0;j<name2.length();j++){
                    if(name1.charAt(i)==(name2.charAt(j))){
                        count++;
                    }
                }
            }
            if(count==name1.length()){
                System.out.println("anagram");
            }
            else{
            System.out.println("not anagram");
            }
        }
    }
}
