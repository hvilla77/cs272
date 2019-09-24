package lab4;
/**
 * 
 * @author hvilla77
 *
 */
public class IntNode {
	
	private int data;
	private IntNode link;
	




	/**
	 * Set all values to zero and null.
	 */
	public IntNode() { //Done
	
	}

// part 3
	/**
	 * Setting values the given values and links.
	 * @param _data this will be the values.
	 * @param _node this will be the links.
	 */
	public IntNode(int _data, IntNode _node) {
	
		data = _data;
		link = _node;

	
	}


// part 4 done
	/**
	 * a value will be brought using this function.
	 * @return returns the value of data
	 */
	public int getData() {
	
		return data;
	
	}
	/**
	 * A link will be brought using this function.
	 * @return returns a link.
	 */
	public IntNode getLink() {

		return link;
	
	}
	/**
	 * Make a data a new value.
	 * @param newData becomes the new data in the link.
	 */
	public void setData(int newData) {
		
		this.data = newData;
		
	}
	/**
	 * Make a link into a new link.
	 * @param newLink This will replace a old link with a new link.
	 */
	public void setLink(IntNode newLink) {
	
		this.link = newLink;
		
	}
	
	//part 5
	/**Prints out values of the string.
	 * 
	 */
	public String toString() {
		
		
		IntNode pointer = link;
		System.out.print(pointer.getData());
		pointer = pointer.link;
		
		while(pointer != null) {
		
			System.out.print("-->" + pointer.getData());
			pointer = pointer.link;
			
		}
		return "";
	}
	/**
	 * adding values to the link
	 * @param newdata the new value that will be placed in the link
	 */
	public void addNodeAfterThis(int newdata) {
		
		
		link = new IntNode(newdata , link);
	}
	/**
	 * removes a link.
	 */
	public void removeNodeAfterThis() {
		
		link =link.link;//fix this in the future
	}
	/**
	 * This function is to determine the length of the link.
	 * @param head becomes a pointer which uses the link for position.
	 * @return the counter of the for loop.
	 */
	public static int listLength(IntNode head) {
		
		int i = 0;
		for(IntNode pointer = head; pointer !=null; pointer = pointer.link) {
			
			i++;
		}
		return i-1;
	}
	/**
	 * If a value is searched it will come out true or false if the value is found.
	 * @param head becomes a pointer which uses the link for position.
	 * @param data if value is found.
	 * @return it will return true or false depending if the value is found.
	 */
	public static boolean search(IntNode head, int data) {
		
		
		for(IntNode pointer = head; pointer != null; pointer = pointer.link) {
			if(pointer.data == data) {
				
				return true;
				
			}
			pointer = pointer.link;
		}
		return false;
	}

}
	
	




