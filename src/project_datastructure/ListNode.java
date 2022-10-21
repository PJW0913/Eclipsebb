package project_datastructure;

public class ListNode {
	private String data;	
	public ListNode link;	
	public ListNode next;
	public int size=0;
	
	public ListNode() {
		this.data = null;
		this.link = null;
	}
	
	public ListNode(String data) {
		this.data=data;
		this.link = null;
	}
	
	public ListNode(String data, ListNode link) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}

}
