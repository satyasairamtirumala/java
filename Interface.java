package uptoStrings;
interface father{
	default void study() {
		System.out.println("Study well");
	}
}
interface Mother{
	default void study() {
		System.out.println("play well");
	}
}
class family implements father,Mother{

	@Override
	public void study() {
		father.super.study();
		Mother.super.study();
	}	
}
public class Interface1 {
	public static void main(String[] args) {
		family ob=new family();
		ob.study();
	}
	
}
