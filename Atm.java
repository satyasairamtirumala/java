import java.util.Scanner;
public class Atm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opt=0;
        double amt=0;
        int count=3;
        Bank obj1=new Bank("ramesh",123456,52000);
        System.out.println("Enter the card");
        System.out.println("Enter the pin");
        int pin=sc.nextInt();
        if(obj1.pin==pin){
            System.out.println("welcome"+obj1.name);
            while (true) { 
                System.out.println("Please select the option\n1.Deposit\n2.withdraw\n3.changepin\n4.check balance\n5.exit");
                opt=sc.nextInt();
                if(opt==1){
                    System.out.println("Enter the amount");
                    amt=sc.nextDouble();
                    obj1.bal+=amt;
                    System.out.println("Please take the receipt");
                    System.out.println(obj1.bal);  
                }
                else if(opt==2){
                    System.out.println("Enter the amount");
                    amt=sc.nextDouble();
                    obj1.bal-=amt;
                    System.out.println("please take the receipt");
                    System.out.println(obj1.bal); 
                }   
                else if(opt==3){
                    System.out.println("Enter the new pin");
                    int pin1=sc.nextInt();
                    obj1.pin=pin1;
                    System.out.println("pin changed  sucessfully");
                } 
                else if(opt==4){
                    System.out.println(obj1.bal);
                }
                else if(opt==5){
                    System.exit(0);
                }
                else{
                    System.out.println("please enter with in the list");
                }
            }
        }
        else{
            System.out.println("invalid pin");
        }
    }
}
class Bank{
    String name;
    int pin;
    double bal;

    public Bank(String name,int pin,double bal) {
        this.name=name;
        this.pin=pin;
        this.bal=bal;
    }
    

}