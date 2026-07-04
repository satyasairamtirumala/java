public class prg16 {
    public static void main(String[] args) {
        String name="this is programming class";
        String lon="";
        String word="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
                word=word+(name.charAt(i));
            }
            else{
                if(word.length()>lon.length()){
                    lon=word;
                }
            }
            word="";
    }
    System.out.println(lon);
}
}