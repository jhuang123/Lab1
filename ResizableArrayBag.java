package lab1;
import java.util.Arrays;

/**
 * 
 * @author jimenezc1
 *
 * @param <T>
 */
public class ResizableArrayBag<T> implements BagInterface<T>{
	private T[] bagarray;
	int capacity;
	int numberOfEntries;
	public static final int DEFAULT_CAPACITY = 4;
	
	public ResizableArrayBag() {this(DEFAULT_CAPACITY);}
	@SuppressWarnings ("unchecked")
	public ResizableArrayBag(int capacity) {this.capacity = capacity;bagarray = (T[]) new Object [capacity];}

	/**
	 * This method returns true if the content of
	 * two bags are the same, and false otherwise.
	 * @param other
	 * @return false
	 */
	public boolean equals(ResizableArrayBag<T> other) {
		T[] array1 = toArray();
		
		ResizableArrayBag <T> copybag = other.copy();
		
		for(int i = 0; i < array1.length; i++) {
			if(!copybag.remove(array1[i])) {
				return false;
			}
		}
		return copybag.isEmpty();
	}
	// isEmpty method
	public boolean isEmpty() {return (numberOfEntries == 0);}

	// add method
	public boolean add(T entry) {
		   // checkInitialization();
		   if (isFull()){return false;}
		   bagarray[numberOfEntries] = entry;
		   numberOfEntries ++;
		   
		   return true;
		}

	// copy method
	private ResizableArrayBag<T> copy() {return this;}
	// full method
	private boolean isFull () {return (numberOfEntries  == capacity);}

	
	@Override
	public int getCurrentSize() {return numberOfEntries;}
	@Override
	public boolean remove(T entry){
	    boolean found = false;
	    
	    for (int ii = 0; ii < numberOfEntries && !found; ii ++) {
	        if (entry.equals(bagarray[ii]))
				found = true;
	        
				bagarray[ii] =  bagarray[numberOfEntries - 1];
				bagarray[numberOfEntries - 1] = null;
				numberOfEntries--;
	      }
	    return found;
	 }

	@SuppressWarnings ("unchecked")
	@Override
	public void clear() {T[] clean = (T[]) new Object();bagarray = clean;}
	@Override
	public boolean contains(T anEntry) {
		for(int i = 0; i < numberOfEntries; i++) {
			if(bagarray[i] == anEntry) {return true;}
		}
		return false;
	}
	
	@Override
	public int getFrequencyOf(T anEntry) {
		int frequency = 0;
		
		for(int i = 0; i < numberOfEntries; i++) {
			if(bagarray[i] == anEntry) {frequency = frequency + i; return frequency;}
		}
		return 0;
	}
	
	@Override
	public T[] toArray () {
	     @SuppressWarnings("unchecked")
	     T [] result = (T[]) new Object[numberOfEntries];
	     for (int count = 0; count < numberOfEntries; count ++) {
	         result[count] = bagarray[count];
	         }
	     return result;
	   }
	
	@Override
	public T remove() {
		if(isEmpty()) {return null;}
		 T temp = bagarray[numberOfEntries - 1];
		 numberOfEntries--;
		 
		return temp;
	}
	@Override
	public T[] toArray(T[] a) {T[] array = Arrays.copyOf(bagarray, numberOfEntries);return array;}
	
	// intersection method
	/*
	 * Want to have the elements that appear in both bags
	 */
	public ResizableArrayBag<String> intersection(ResizableArrayBag<String> bag12) {
		
		return null;
		}
	// union method
	public ResizableArrayBag<String> union(ResizableArrayBag<String> bag22) {return null;}
}
