public class Bike1 {
    String brand;
    double price;
    Bike1(String brand,double price){
        this.price=price;
        this.brand=brand;
    }
    public String toString(){
        return this.brand+":"+this.price;
    }
    public boolean equals(Object e){
        Bike1 val=(Bike1)e;
        return this.brand==val.brand&&this.price==val.price;
    }
}
