package project_datastructure;

public class LinkedList1 {
	
	private ListNode head;

	public LinkedList1() {
		head = null;
	}
	
	
	//Node 삽입 (중간에 삽입)
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		
		newNode.link = pre.link;				//pre.link는 pre노드의 다음 노드이므로,
												//newNode.link=pre.link는 새로운 노드의 link가 preNode의 다음 노드를 참조하도록함.

		pre.link = newNode;						//preNode의 link가 새로운 노드를 참조하도록함
												//최종적으로 'pre노드 -> newNode -> 기존 pre노드의 다음 노드' 로 구성
	}
	
	
	//Node 삽입 (마지막에 삽입)
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		
		if(head == null) {						//head 노드가 null인 경우 새로운 노드를 참조하도록함.
			this.head = newNode;
		} else {								//head 노드가 null이 아닌 경우 temp 노드가 head를 참조
			ListNode tempNode = head;			//tempNode는 마지막 노드를 찾아서 참조하기 위해 사용.
			
			while(tempNode.link != null) {		//temp 노드의 link가 null이 아닐 때까지 다음 노드를 참조
				tempNode = tempNode.link;		//tempNode.link=tempNode.link는 tempNode에 다음 노드를 참조하도록함.
												//while문이 모두 실행되면 tempNode는 가장 마지막 노드를 참조하게 됨.
			}
			tempNode.link = newNode;			//tempNode(마지막 노드)의 link가 다음 노드를 참조하도록 함.
		}
	}
	
	
	//Node 삭제 (마지막 노드 삭제)
	public void deleteLastNode() {
		ListNode pre, temp;
		
		if(head == null) {						//head 노드가 null인 경우 모든 노드가 삭제되었으므로 return
			return;
		}
		
		if(head.link == null) {					//head노드의 link가 null인 경우
												//노드가 1개 남았을 경우
			head = null;						//head에 null을 할당하여 남은 노드와의 연결을 끊음
		}else {
			pre = head;							//pre노드는 head를 가리키는 노드를 할당
			temp = head.link;					//temp노드는 head가 가리키는 노드의 다음 노드. 즉, pre노드의 다음 노드를 할당
			
			while(temp.link !=null) {			//temp노드의 link가 null이 아닐 때 까지 한 노드씩 다음 노드로 이동
				pre = temp;						//pre노드는 temp노드를 할당하고
				temp = temp.link;				//temp노드는 temp노드의 다음 노드를 할당
			}									//이렇게 하면 pre노드는 마지막 노드의 이전 노드가 되고, temp노드는 마지막 노드가 됨
			
			pre.link = null;					//pre노드의 link를 null로 만들어서 가장 마지막 노드를 삭제
		}										//즉, pre노드의 다음 노드인 temp노드로의 연결을 끊음
	}
	
	
	//Node 탐색
	public ListNode searchNode(String data) {
		ListNode temp = this.head;				//temp노드에 head가 가리키는 첫 번째 할당
		
		while(temp != null) {					//temp노드가 null이 아닐 때까지 반복하여 탐색
			
			if(data.equals(temp.getData())) {	//주어진 데이터와 temp노드의 데이터가 일치할 경우 해당 temp노드를 return
				return temp;
			} else {
				temp = temp.link;				//데이터가 일치하지 않을 경우 temp 노드에 다음 노드 할당.
			}
		}
		
		return temp;
	}
	
	
	//리스트의 노드를 역순으로 구성
	public void reverseList() {
		ListNode next = head;					//head가 참조하는 첫번째 노드를 할당.
		ListNode current = null;
		ListNode pre = null;
		
		while(next != null) {					//next노드가 순차적으로 이동하며 current노드의 link가 pre노드를 참조하도록 함
			pre = current;						//pre노드를 current노드 위치로 이동
			current = next;						//current노드는 next노드 위치로 이동
			next = next.link;					//next노드는 다음 노드 위치로 이동
			current.link = pre;					//current노드의 link에 pre노드를 할당하여 역순
		}

		head = current;							//current노드가 마지막 노드를 가리킬 때, head는 current노드를 참조하도록 함
	}
	
	
	//연결 리스트에 저장된 모든 데이터를 출력
	public void printList() {
		ListNode temp = this.head;				//temp 노드에 head가 가리키는 첫번째 노드를 할당
		System.out.printf("L = (");
		while (temp != null) {					//temp 노드가 null이 아닐 때까지 반복하여 출력
			System.out.printf(temp.getData());
			temp = temp.link;					//temp 노드에 다음 노드(temp.link) 할당
			if(temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
}
