package lab3;

public class ListElement {
	
	protected ListElement next;
	protected ListElement previous;
	protected int data;
	
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
	
	
}




