//package lab3;
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
		char selection = 'a';
		
		//scanner so we can input values for the selection char
		Scanner in = new Scanner(System.in);
		
		while((selection != 'Q') && (selection != 'q')){
		System.out.println("Select one of the options below:");
		System.out.println("a) Add Node");
		System.out.println("b) Find Node");
		System.out.println("c) Delete a Node");
		System.out.println("d) Print from end of list");
		System.out.println("e) Print from start of list");
		System.out.println("q) Quit program");
		
		
		
		
		}
		in.close();
		System.out.println("Quitting...");
	}

}
