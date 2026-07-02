public class Prg11 {
    public static void main(String[] args) {
        String name="malayalam";
        for(int i=0;i<name.length();i++){
            String pal=name.charAt(i)+" ";
            for(int j=i+1;j<name.length();j++){
                pal=pal+(name.charAt(j));
                if(rev(pal)){
                    System.out.println(pal);
                }
            }
        }
    }
    public static boolean rev(String pal){
        String rev="";
        for(int i=0;i<pal.length();i++){
            rev=rev+(pal.charAt(i));
        }
        System.out.println(rev);
        return rev==pal;
    }
}
