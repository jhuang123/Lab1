package lab1;

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
	private boolean isEmpty() {
		if(bagarray == null) {assert(numberOfEntries == 0);return true;}
		return false;
		}
	
	//remove method
	public boolean remove(T entry) {
		
		return false;}
	
	//toArray method
	public T[] toArray() {
		
		return null;}
	
	// add method
	public void add(String next) {}
	//copy method
	private ResizableArrayBag<T> copy() {
		
		return null;
		}
	// intersection method
	public ResizableArrayBag<String> intersection(ResizableArrayBag<String> bag12) {return null;}
	// union method
	public ResizableArrayBag<String> union(ResizableArrayBag<String> bag22) {return null;}
}
