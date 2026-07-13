package uptoStrings;
abstract class sample{
	abstract void sum();
	public static void add() {
		
	}
}
class sample2 extends sample{
	void sum() {
		System.out.println(">>><<<<");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		sample2 ob=new sample2();
		ob.sum();
	}

}
