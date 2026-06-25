public class Bike2 {
    public static void main(String[] args) {
        Bike1 [] b={new Bike1("hero",11000),
            new Bike1("tvs",95000),
            new Bike1("pulsar",150000 ),
            new Bike1("honda",180000),
            new Bike1("rx-100", 1250000)
        };
        for(int i=b.length-1;i>=0;i--){
            System.out.println(b[i].brand);
        }
        //max
        double max=b[0].price;
        Bike1 temp=null;
        for(int i=0;i<b.length;i++){
            if(b[i

            ].price>max){
                max=b[i].price;
                temp=b[i];
            }
        }
       System.out.println(temp);
        //avg
        double avg=0;
        for(Bike1 b1:b){
            avg+=b1.price;
        }
        System.out.println(avg/b.length);
        //price more than avg of bike
        for(int i=0;i<b.length;i++){
            if(b[i].price>(avg/b.length)){
                System.out.println(b[i]);
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i].brand.charAt(i)=='a'||(b[i].brand.charAt(i)=='e')||(b[i].brand.charAt(i)=='i')||(b[i].brand.charAt(i)=='0')||(b[i].brand.charAt(i)=='u')){
                System.out.println(b[i].brand);
            }
        }
    }
}
