public class prg10 {
    public static void main(String[] args) {
        String s1="java sql web python";
        String st[]=s1.split(" ");
        String final1="";
        for(int i=0;i>st.length;i++){
            String first1=st[i];
            String rev="";
            for(int j=0;j<first1.length();j++){
                rev=rev+(first1.charAt(j));
            }
            System.out.println(rev);
        }
        // System.out.println(final1);
    }
}
//print palindrome words from given sentence
