package lab3;
import java.util.Scanner;

/*
 * Lab 3; This file runs the link list
 * 
 * Jennifer Herasymuik   SID:200352062
 * 
 * Oct. 2016
 * 	
*/
public class List {

	public static void main(String[] args) {
		System.out.println("This program allows you to amnipulate a linked list of INTEGERS.");
		int selection = 1;
		
		//list element that represents head of linked list
		ListElement head = new ListElement();
		
		//scanner so we can input values for the selection char
		Scanner in = new Scanner(System.in);
		
		while(selection != 0){
		System.out.println("Select one of the options below:");
		System.out.println("1: Add Node");
		System.out.println("2: Find Node");
		System.out.println("3: Delete a Node");
		//System.out.println("4: Print from end of list");
		System.out.println("5: Print from start of list");
		System.out.println("0: Quit program");
		System.out.println("Selection: ");
		
		selection = in.nextInt();
		
		if(selection == 1){
			System.out.println("Enter value of integer to add to list: ");
			int num = in.nextInt();
			ListElement newElement = new ListElement();
			newElement.setData(num);
			head.addElement(newElement);
			
		}
		else if(selection == 2){
			System.out.println("Search to see if value is in list: ");
			int num = in.nextInt();
			if (head.getElement(num) != null){
				System.out.println("Element was in list!");
			}
		}
		else if(selection == 3){
			System.out.println("Enter number to be deleted: ");
			int num = in.nextInt();
			head = head.deleteElement(num);
			if(head != null){
				System.out.println("Item deleted...");
			}
		}
		//else if(selection == 4){}
		else if(selection == 5){
			head.print();
		}
		else{
			System.out.println("Please enter one of the letter values show in list...");
		}
		
		}
		in.close();
		System.out.println("Quitting...");
	}

}
