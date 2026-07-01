public class prg9 {
    public static void main(String[] args) {
        String name="aabbbc";
        System.out.println(distinct(name));
        System.out.println(duplicate(name));
        System.out.println(unique(name));
        count(name);
    }
    public static String distinct(String name){
        String name2="";
        for(int i=0;i<name.length();i++){

                if(name2.indexOf(name.charAt(i))==-1){
                    name2=name2+(name.charAt(i));
                }
            
            
        }
        return name2;
    }
    public static String unique(String name){
        String name2="";
        for(int i=0;i<name.length();i++){
            if(name.indexOf(name.charAt(i))==(name.lastIndexOf(name.charAt(i)))){
                name2=name2+(name.charAt(i));
            }
        }
        return name2;

    }
    public static String duplicate(String name){
        String name2="";
        String name3="";
        for(int i=0;i<name.length();i++){

                if(name2.indexOf(name.charAt(i))==-1){
                    name2=name2+(name.charAt(i));
                }
                else if(name3.indexOf(name.charAt(i))==-1){
                    name3=name3+(name.charAt(i));
                }

            
            
        }
        return name3;

    }
    public static void count(String s){
        String name="";
        for(int i=0;i<;i++){

        }
    }

}
