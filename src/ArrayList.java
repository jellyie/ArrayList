import java.util.Arrays;

/**
 * A program that mimics the pre-existing ArrayList class in the Java library.
 * @author Irene Ong
 * @version 1.0
 */
public class ArrayList {
	private Object[] arraylist;
	private static final int default_capacity = 10;
	private int size = 0;
	
	/**
	 * Default constructor that initializes this list with a capacity of 10.
	 */
	public ArrayList() {
		arraylist = new Object[default_capacity];
	}
	
	/**
	 * Constructor that initializes this list to a specified capacity. 
	 * @param  n    integer that indicates the capacity of this list 
	 */
	public ArrayList(int n) {
		arraylist = new Object[n];
		
	}
	
	/**
	 * A method that inserts an element at the end of this list.
	 * @param  x    element to be inserted at the end of this list
	 */
	public void add(Object x) {
		if(size == arraylist.length)
			increaseSize();
		arraylist[size++] = x;
	}
	
	/**
	 * A method that inserts an element at a specific location in this list.
	 * @param  index    integer that represents a specific location in this list
	 * @param  x        element to be inserted at specified index in this list 
	 */
	public void add(int index, Object x) {
		int temp = 0;
		if(index > size)
				temp = index - size;
			for(int i = 0; i <= temp; i++) {
				increaseSize();
			}
		
		ArrayList tmp = new ArrayList(this.size());
	
		for(int i = 0; i< this.size(); i++) {
			if(i == index)
				tmp.add(x);
			tmp.add(arraylist[i]);
		}
		
		for(int i = 0; i < this.size(); i++) {
			arraylist[i] = tmp.get(i);
		}
		
			
	}
	
	/**
	 * A method that increases the capacity of this list by one index.
	 */
	private void increaseSize() {
		int new_size = arraylist.length + 1;
		arraylist = Arrays.copyOf(arraylist, new_size);
	}
	
	/**
	 * A method that retrieves an element at a specific location in this list.
	 * @param  index    integer that indicates the location of an element
	 * @return          element at given index
	 */
	public Object get(int index) {
		if(index < this.size())
			return arraylist[index];
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	/**
	 * A method that returns the number of elements in this list.
	 *@return   integer that represents the number of elements in this list
	 */
	public int size() {
		return arraylist.length;
	}
	
	/**
	 * A method that determines whether this list is empty or not.
	 * @return   true if this list is empty
	 */
	public boolean isEmpty() {
		boolean isEmpty = true;
		for(Object o: arraylist) {
			if(o != null)
				isEmpty = false;
		}
		return isEmpty;
	}
	
	/**
	 * A method that determines whether a particular element exists in this list.
	 * @param  ob    element to search for
	 * @return       true if this list contains the specified element
	 */
	public boolean isIn(Object ob) {
		boolean isIn = false;
		for(Object o: arraylist) {
			if(o == ob)
				isIn = true;
		}
		return isIn;
	}
	
	/**
	 * A method that will return the location of the first occurrence of an element starting from location 0.
	 * @param  n    element to search for
	 * @return      integer indicating location (index) of the element
	 */
	public int find(Object n) {
		int index = 0;
		if(this.isIn(n)) {
			for(int i = 0; i < this.size(); i++) {
				if(arraylist[i] == n)
					index = i; 
			}
		}else {
			System.out.println("Object does not exist in this list.");
			throw new RuntimeException("Object does not exist in this list.");
			
		}
		return index;
	}
	
	/**
	 * A method that will remove the first occurrence of an element starting from location 0.
	 * @param  n    element to be removed
	 */
	public void remove(Object n) {
		Object[] temp = new Object[this.size()-1];
		int index = 0;
		int tmpindex = index;
		if(this.isIn(n))
			index = this.find(n);
			for(int i = 0; i < this.size(); i++) {
				if(i != index) {
					if(i != 0)
						tmpindex++;
					temp[tmpindex] = arraylist[i];
					
				}
			}
			arraylist = temp;
	}
	
	/**
	 * A method that prints the list to console.
	 */
	public void display() {
		for (int i = 0; i < this.size(); i++) {
			if(i == 0) {
				System.out.print("["+this.get(i)+", ");
			}else if(i == this.size()-1) {
				System.out.println(this.get(i)+"]");
			}else {
				System.out.print(this.get(i)+", ");
			}
					
		}
	}
}
