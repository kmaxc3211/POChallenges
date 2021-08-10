package revature;

public class Driver {

	public static void main(String[] args) {
		BinaryTree<String> btString = new BinaryTree<String>();
		btString.add("This");
		btString.add("tree");
		btString.add("has");
		btString.add("strings");
		
		btString.printLevelOrder();
		
		BinaryTree<Integer> btInt = new BinaryTree<Integer>();
		btInt.add(5);
		btInt.add(4);
		btInt.add(3);
		btInt.add(2);
		btInt.add(1);
		
		btInt.printLevelOrder();
		
		/*  Logical reasoning problem:
		 *  
		 *  What day is the fourteenth of a given month?
		 *	I. The last day of the month is a Wednesday.
		 *	II. The third Saturday of the month was seventeenth.
		 *
		 *	ANSWER:
		 *
		 *  The data in I is insufficient to answer the question (need to know how long the month is).
		 *  
		 *  The data in II is sufficient to answer the question: the fourteenth is a Wednesday.
		 *  
		 *  If both I and II are considered, we can additionally identify the length of the month: 28 days.
		 */
	}

}
