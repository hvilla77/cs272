package lab4;

public class IntNodeTest {

	public static void main(String [] args) {
		
		IntNode head = new IntNode();
		IntNode test = new IntNode(20,null);
		
		//Using these functions to add to the link.
		head.addNodeAfterThis(12);
		head.addNodeAfterThis(28);
		head.addNodeAfterThis(0);
		head.addNodeAfterThis(34);
		
		//setting get and set for step 4
		System.out.println("I should receive a 20 and null");
		System.out.println(test.getData());
		System.out.println(test.getLink());
		
		//printing values for step 5.
		System.out.println("The values that are printed out should be 34,0,28, and 12");
		head.toString();
		System.out.println("");
		
		System.out.print("This function removes the head value.");
		head.removeNodeAfterThis();
		System.out.println("");
		head.toString();
		System.out.println("");
		
		//shows how many links they are.
		System.out.println("The value should be 3.");
		System.out.println(IntNode.listLength(head));
		
		//This search function is to see if the values is there.
		System.out.println("0 is in the value so it will show true. 25 is not in a value so it will show false.");
		System.out.println(IntNode.search(head,0));
		System.out.println(IntNode.search(head,25));
		
	}
}
