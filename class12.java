public class class12 {
    static int a=100;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(class11.a);
        class11.main(null);
        class11 obj=new class11();
        obj.val();
        System.out.println(obj.b);
    }
}
