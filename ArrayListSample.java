package arraylist;
import java.util.*;
public class ArrayListSample {
		public static void main(String[]args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Tamil Nadu");
		arrlist.add("Kerala");
		System.out.println(arrlist);
		arrlist.add("Karnataka");
		System.out.println(arrlist);
		arrlist.add(2,"Delhi");
		System.out.println(arrlist);
		if(arrlist.contains("Tamil Nadu")) {
			System.out.println("The element is found");
		}
		System.out.print(arrlist.stream().anyMatch((a) -> a.startsWith("T")));
	}
	}


