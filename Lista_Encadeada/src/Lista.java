
public class Lista {
	public class No{
		
		int element;
		
		private No next;
		private No before;
		
		public void setNext(No next) {
			this.next = next;
		
		}
		public void setBefore(No before) {
			this.before = before;
		}
		public void setElemento(int i) {
			this.element = i; 
		}
		public int getElemento() {
			return this.element;
		}
		public No getBefore() {
			return this.before;
		}
		public No getNext() {
			return this.next;
		}
		
	}//final do No
	
	private No head;
	private No tail;
	
	public void addFirst(int element) {
		No n = new No();
		
		n.setElemento(element);
		if(isEmpty()) {
			n.setNext(n);
			n.setBefore(n);
			this.head = n;
			this.tail = n;
		}else {
			No tmp = head;
			while(tmp.getNext() != head) {
				tmp = tmp.getNext();
			}
			tmp.setNext(n);
			n.setBefore(tmp);
			n.setNext(head);
			tail = n;
		}
		
	}
	
	public boolean isEmpty() {
		return (tail == null) &&(head == null);
	}
	public void show() {
		No tmp = tail;
		while(tmp.next != tail) {
			System.out.println(tmp.getElemento());
			tmp = tmp.getNext();
		}
	}
	
}
