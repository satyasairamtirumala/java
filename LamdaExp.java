package uptoStrings;

public class LamdaExp {
	public static void main(String[] args) {
		sam ob=(k)->{
			System.out.println("display"+k);
		};
		ob.sum(10);
	}
}
interface sam{
	  void sum(int m);
}
