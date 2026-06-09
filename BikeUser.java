public class BikeUser {
    public static void main(String[] args) {
        Bike1 b1=new Bike1("tvs", 95000);
        Bike1 b2=new Bike1("tvs", 95000);
        Car c1=new Car("tata", 850000);
        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b1));
        System.out.println(c1.equals(b1));
    }
}
