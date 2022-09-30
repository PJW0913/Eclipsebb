package collection_hashset;

import java.util.*;

public class HasSetExample1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println("ÃÑ °´Ã¼¼ö: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		System.out.println("---------------------------");
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("ÃÑ °´Ã¼¼ö: " + set.size());
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		System.out.println("---------------------------");
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("ºñ¾îÀÖÀ½");
		}
	}

}
