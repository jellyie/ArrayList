import java.util.*;
public class testarray {

	public static void main(String[] args) {
		ArrayList listA = new ArrayList();
		ArrayList listB = new ArrayList(15);
		Random rand = new Random();
		
		System.out.println("The lists BEFORE adding elements:");
		System.out.print("This is ListA: ");
		listA.display();
		System.out.println("ListA has "+ listA.size()+" elements.");
		
		System.out.print("This is ListB: ");
		listB.display();
		System.out.println("ListB has "+ listB.size()+" elements.");
		System.out.println();
		
		for(int i = 0; i < 15; i++) {
			int num = rand.nextInt((25 - 1) + 1) + 1;
			listA.add(num);
			listB.add(num);
		}
		
		System.out.println("The lists AFTER adding elements:");
		System.out.print("This is ListA: ");
		listA.display();
		System.out.println("ListA has "+ listA.size()+" elements.");
		
		System.out.print("This is ListB: ");
		listB.display();
		System.out.println("ListB has "+ listB.size()+" elements.");
		
	}

}