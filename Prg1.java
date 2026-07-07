
import java.util.ArrayList;

public class Prg1{
    public static void main(String[] args) {
       ArrayList obj=new ArrayList(); 
       obj.add(10);
       obj.add("java");
       obj.add("12.5");
       obj.add(new Prg1());
       obj.add("rohit");
       System.out.println(obj);
       ArrayList obj2=new ArrayList();
       obj2.addAll(obj);
       System.out.println(obj2);
         System.out.println(obj2.size());
        System.out.println(obj2.remove("java"));
        System.out.println(obj2);
        System.out.println(obj2.removeAll(obj));
        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj2.isEmpty());
        System.out.println(obj.concat('a');
    }
}