package lab3;

public class DoubleLinkedList {
	public ListElement head;
	public ListElement tail;
	
	DoubleLinkedList(){
		head = null;
		tail = null;
	}
	/**
	 * Purpose: takes in node and adds to end
	 * @param le
	 */
	public void addElement(ListElement le){
		if (this.tail == null){ //if empty, point both to new node
			head = le;
			tail = le;
		}
		else{
			ListElement n = new ListElement(le.getData(), null, tail);//add new node to hook to tail
			tail.next = n;//next node is the new node
			tail = tail.next; //move tail
		}
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public ListElement getElement(int index){
		if(this.head.getData() == index) //if index is head, return head
			return this.head;
		for(ListElement ll = this.head; ll.next != null; ll = ll.next){
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
		if((this.head == null) && (this.tail == null)){ //if empty head pointer
			System.out.println("Empty list...");;
			return null;
		}
		if(this.head.getData() == index){
			return this.head.next;//return new head
		}
		for(ListElement ll = this.head; ll.next != null; ll = ll.next){
			if(ll.next.getData() == index){
				if(ll.next == null){
					this.tail = ll; //if node is at end
				}
				ll.next = ll.next.next; //get rid of node
				return this.head;//return head if deleted
				
			}
		}
		System.out.println("Index not in list!");
		return null;
	}
	
	/**
	 * 
	 */
	public void printFromHead(){
		for(ListElement l = this.head; l != null; l = l.next){ 
			System.out.println(l.getData());
		}
	}
	
	public void printFromTail(){
		for(ListElement l = this.tail; l != null; l = l.previous){ 
			System.out.println(l.getData());
		}
	}
	
}
