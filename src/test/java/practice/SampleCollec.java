package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class SampleCollec {

	public static void main(String[] args) {
		ArrayList<Object> A=new ArrayList();
		A.add(20);
		A.add(10);
		A.add(null);
		A.add("C");
		A.add("C");
		System.out.println(A.size());
		System.out.println(A);
		ArrayList<Integer> A2=new ArrayList();
		A2.add(10);
		A2.add(222);
		
		//addAll(A2);
		/*System.out.println(A);
		A.removeAll(A2);
		System.out.println(A);*/
		A.retainAll(A2);
		System.out.println(A);
		try {
			System.out.println(A.contains(10));
		} catch (Exception e) {
			System.out.println("Enter a number below 4");
		}
		Vector<Object> v=new Vector<Object>(3);
		v.add(500);
		v.add(555);
		v.add(555);
		v.add(555);
		System.out.println(v.capacity());
		
		HashSet<Object> h=new HashSet();
		h.add(2);
		h.add("A");
		h.add("A");
		h.add(null);
		System.out.println(h);
		
		LinkedHashSet<Object> l=new LinkedHashSet();
		l.add(2);
		l.add("A");
		l.add("A");
		System.out.println(l);
		
		TreeSet<Object> t=new TreeSet<Object>();
		t.add(2);
		t.add(1);
		t.add(1);
		System.out.println(t);
		
		Map<Integer, String> m=new TreeMap<Integer, String>();
		m.put(2, "Shubman");
		m.put(1, "Rohit");
		
		
		Map<Integer, String> m1=new HashMap<Integer, String>();
		m1.put(2, "Shubman");
		m1.put(3, "Virat");
		
		m.putAll(m1);
		System.out.println(m.get(3));
		
	}

}
