public class prg9 {
    public static void main(String[] args) {
        char c1='A',c2='a' ,ch=48;
        while(c1<='Z'&& c2<='z' && ch<=57){
            System.out.println(c1+" "+ch+" "+c2);
            c1++;
            c2++;
            ch++;
        }
    }
}
