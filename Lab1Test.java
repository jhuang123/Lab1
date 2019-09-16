package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lab1Test {
	public static void main(String[] args) {
		ResizableArrayBag <String> bag1 = new ResizableArrayBag<>();
		ResizableArrayBag <String> bag2 = new ResizableArrayBag<>();
		
		try {
		File tigers = new File ("tigers.txt");
		Scanner sc = new Scanner (tigers);
		
		ResizableArrayBag <String> u, i;
		
		while  (sc.hasNext()) 
			bag1.add(sc.nextLine());
		sc.close();
		File lions = new File ("lions.txt");
		sc = new Scanner (lions);
		
		while  (sc.hasNext())
			bag2.add(sc.nextLine());
		
		sc.close();
		
		u = bag1.union (bag2);
		i = bag2.intersection (bag1);
		
		String[] s_u = u.toArray(new String [1]);
		
		Object[] s_i = i.toArray ();
		System.out.println ("====Union====");
		for (String w : s_u)
			System.out.println (w);
		System.out.println ("====Intersection==== ");
		for (Object w : s_i)
			System.out.println (w);
		
		// check whether the bags were intact
		Object[] tigerlist = bag1.toArray();
		Object[] lionlist = bag2.toArray();
		
		System.out.println ("=|= testing consistency ===\n =|=Tigers==||");
		
		for (Object o: tigerlist)
			System.out.println (o);
	
		System.out.println ("=|= testing consistency ===\n =|=Lions==||");
		for (Object o: lionlist)
			System.out.println (o);
		}
		
		catch (FileNotFoundException ex) {
			System.out.println ("tiger.txt not found");
		}
	}
}