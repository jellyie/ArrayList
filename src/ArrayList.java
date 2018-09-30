/**
 * A program that mimics the pre-existing ArrayList class in the Java library.
 * @author Irene Ong
 * @version 1.0
 */
public class ArrayList {
	private Object[] arraylist;
	
	/**
	 * Default constructor that initializes this list with a capacity of 10.
	 */
	public ArrayList() {
		arraylist = new Object[10];
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
		
	}
	
	/**
	 * A method that inserts an element at a specific location in this list.
	 * @param  index    integer that represents a specific location in this list
	 * @param  x        element to be inserted at specified index in this list 
	 */
	public void add(int index, Object x) {
		
	}
	
	/**
	 * A method that retrieves an element at a specific location in this list.
	 * @param  index    integer that indicates the location of an element
	 * @return          element at given index
	 */
	public Object get(int index) {
		return null;
	}
	
	/**
	 * A method that returns the number of elements in this list.
	 *@return   integer that represents the number of elements in this list
	 */
	public int size() {
		return 0;
	}
	
	/**
	 * A method that determines whether this list is empty or not.
	 * @return   true if this list is empty
	 */
	public boolean isEmpty() {
		return false;
	}
	
	/**
	 * A method that determines whether a particular element exists in this list.
	 * @param  ob    element to search for
	 * @return       true if this list contains the specified element
	 */
	public boolean isIn(Object ob) {
		return false;
	}
	
	/**
	 * A method that will return the location of the first occurrence of an element starting from location 0.
	 * @param  n    element to search for
	 * @return      integer indicating location (index) of the element
	 */
	public int find(Object n) {
		return 0;
	}
	
	/**
	 * A method that will remove the first occurrence of an element starting from location 0.
	 * @param  n    element to be removed
	 */
	public void remove(Object n) {
		
	}
}
