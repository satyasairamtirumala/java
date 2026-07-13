
package uptoStrings;

public class Prg14 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===========");
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int sp=0,st=1;
		System.out.println("===========");
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<st;j++) {
				System.out.print("* ");
			}
			System.out.println();
			sp++;
			st+=2;
		}
		System.out.println("=============");
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("==============");
		for(int i=0;i<5;i++) {
			int val=5;
			for(int j=0;j<=i;j++) {
				System.out.print(val);
				val--;
			}
			System.out.println();
		}
		System.out.println("=============");
		int count=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("=============");
		for(int i=0;i<5;i++) {
			int count1=65;
			for(int j=0;j<=i;j++) {
				System.out.print((char)count1+" ");
				count1++;
			}
			System.out.println();
		}
		System.out.println("==============");
		int st1=1;
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			int val=1;
			for(int j=0;j<st1;j++) {
				if(j<st1/2) {
					System.out.print(val);
					val++;
				}
				else {
					System.out.print(val);
					val--;
				}
			}
			System.out.println();
			st1+=2;
		}
	}

}
