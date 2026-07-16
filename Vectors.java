package collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement(10);
		v.add(20);
		v.add(12.4);
		v.add("satya");
		Enumeration e=v.elements();
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
