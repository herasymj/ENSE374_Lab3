package lab3;

public class ListElement {
	
	private ListElement next;
	//private ListElement previous;
	private int data;
	
	public ListElement(){
		this.data = 0;
		this.next = null;
		//this.previous = null;
	}
	
	public ListElement(int d, ListElement n, ListElement p){
		this.data = d;
		this.next = n;
		//this.previous = p;
	}

	/**
	 * 
	 * @param data
	 * 		set data in node
	 * @return
	 *  none
	 */
	public void setData(int data){
		this.data = data;
	}
	
	/**
	 * 
	 * @return data
	 */
	public int getData(){
		return this.data;
	}
	
	/**
	 * Purpose: takes in node and adds to end
	 * @param le
	 */
	public void addElement(ListElement le){
		ListElement ll = this;//start at head
		if((this.getData() == 0) && (this.next == null)){ //if empty head pointer
			this.data = le.getData();
			return;
		}
		while(ll.next != null){
			ll = ll.next;//loop through until at last node
		}
		ll.next = le;//set next of last node to new node
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public ListElement getElement(int index){
		if(this.getData() == index) //if index is head, return head
			return this;
		for(ListElement ll = this; ll.next != null; ll = ll.next){
			if(ll.next.getData() == index){
				return ll.next; //return next pointer if it has the index
			}
		}
		System.out.println("Index not in list!");
		return null; //index was not in the list
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public ListElement deleteElement(int index){
		if((this.getData() == 0) && (this.next == null)){ //if empty head pointer
			System.out.println("Empty list...");;
			return null;
		}
		if(this.getData() == index){
			return this.next;//return new head
		}
		for(ListElement ll = this; ll.next != null; ll = ll.next){
			if(ll.next.getData() == index){
				ll.next = ll.next.next; //get rid of node
				return this;//return head if deleted
			}
		}
		System.out.println("Index not in list!");
		return null;
	}
	
	/**
	 * 
	 */
	public void print(){
		for(ListElement l = this; l != null; l = l.next){ 
			System.out.println(l.getData());
		}
	}
}




