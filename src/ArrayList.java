
public class ArrayList {
	private Object[] arraylist;
	
	/**
	 * Default constructor that initializes ArrayList to size 10.
	 */
	public ArrayList() {
		arraylist = new Object[10];
	}
	
	/**
	 * Constructor that accepts a parameter of type int and sets the size to this parameter.
	 * @param  n    integer that determines the size of an ArrayList object 
	 */
	public ArrayList(int n) {
		arraylist = new Object[n];
	}
	
	/**
	 * A method that inserts a value at the end of the ArrayList
	 * @param  x    Object that will be inserted at the end of the ArrayList
	 */
	public void add(Object x) {
		
	}
	
	/**
	 * A method that inserts a value at a specific location in ArrayList.
	 * @param  index    integer 
	 * @param  x        Object that  will be inserted at index of ArrayList  
	 */
	public void add(int index, Object x) {
		
	}
	
	/**
	 * A method that retrieves a value at a specific location in ArrayList
	 * @param  index    integer that indicates the location of a value
	 * @return          value at given index
	 */
	public Object get(int index) {
		return null;
	}
	
	/**
	 * A method that returns the size of an ArrayList
	 *@return   integer that represents the number of items in ArrayList
	 */
	public int size() {
		return 0;
	}
	
	/**
	 * A method that determines whether an ArrayList is empty or not.
	 * @return   true if ArrayList is empty, false if ArrayList is not empty
	 */
	public boolean isEmpty() {
		return false;
	}
	
	/**
	 * A method that determines whether a particular object exists in ArrayList or not.
	 * @param  ob    Object that will be iterated through list
	 * @return       true if ArrayList contains the object, false if object does not exist in ArrayList
	 */
	public boolean isIn(Object ob) {
		return false;
	}
	
	/**
	 * A method 
	 * @param  n    Object
	 * @return      integer
	 */
	public int find(Object n) {
		return 0;
	}
	
	/**
	 * A method
	 * @param  n    Object
	 */
	public void remove(Object n) {
		
	}
}
