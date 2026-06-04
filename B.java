class res{
    int a;
    String s;
    void res(){
        System.out.println(this.a);
        System.out.println(this.s);
    }
}
public class B{
    public static void main(String[] args) {
        res obj=new res();
        obj.a=10;
        obj.s="satya";
        obj.res();

    }
}