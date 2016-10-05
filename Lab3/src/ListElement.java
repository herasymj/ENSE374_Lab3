
public class ListElement {
	
	private ListElement next;
	private ListElement previous;
	private int data;
	
	public ListElement(){
		this.data = 0;
		this.next = null;
		this.previous = null;
	}
	
	public ListElement(int d, ListElement n, ListElement p){
		this.data = d;
		this.next = n;
		this.previous = p;
	}

	
	
}
