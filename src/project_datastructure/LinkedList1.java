package project_datastructure;

public class LinkedList1 {
	
	private ListNode head;

	public LinkedList1() {
		head = null;
	}
	
	
	//Node ���� (�߰��� ����)
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		
		newNode.link = pre.link;				//pre.link�� pre����� ���� ����̹Ƿ�,
												//newNode.link=pre.link�� ���ο� ����� link�� preNode�� ���� ��带 �����ϵ�����.

		pre.link = newNode;						//preNode�� link�� ���ο� ��带 �����ϵ�����
												//���������� 'pre��� -> newNode -> ���� pre����� ���� ���' �� ����
	}
	
	
	//Node ���� (�������� ����)
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		
		if(head == null) {						//head ��尡 null�� ��� ���ο� ��带 �����ϵ�����.
			this.head = newNode;
		} else {								//head ��尡 null�� �ƴ� ��� temp ��尡 head�� ����
			ListNode tempNode = head;			//tempNode�� ������ ��带 ã�Ƽ� �����ϱ� ���� ���.
			
			while(tempNode.link != null) {		//temp ����� link�� null�� �ƴ� ������ ���� ��带 ����
				tempNode = tempNode.link;		//tempNode.link=tempNode.link�� tempNode�� ���� ��带 �����ϵ�����.
												//while���� ��� ����Ǹ� tempNode�� ���� ������ ��带 �����ϰ� ��.
			}
			tempNode.link = newNode;			//tempNode(������ ���)�� link�� ���� ��带 �����ϵ��� ��.
		}
	}
	
	
	//Node ���� (������ ��� ����)
	public void deleteLastNode() {
		ListNode pre, temp;
		
		if(head == null) {						//head ��尡 null�� ��� ��� ��尡 �����Ǿ����Ƿ� return
			return;
		}
		
		if(head.link == null) {					//head����� link�� null�� ���
												//��尡 1�� ������ ���
			head = null;						//head�� null�� �Ҵ��Ͽ� ���� ������ ������ ����
		}else {
			pre = head;							//pre���� head�� ����Ű�� ��带 �Ҵ�
			temp = head.link;					//temp���� head�� ����Ű�� ����� ���� ���. ��, pre����� ���� ��带 �Ҵ�
			
			while(temp.link !=null) {			//temp����� link�� null�� �ƴ� �� ���� �� ��徿 ���� ���� �̵�
				pre = temp;						//pre���� temp��带 �Ҵ��ϰ�
				temp = temp.link;				//temp���� temp����� ���� ��带 �Ҵ�
			}									//�̷��� �ϸ� pre���� ������ ����� ���� ��尡 �ǰ�, temp���� ������ ��尡 ��
			
			pre.link = null;					//pre����� link�� null�� ���� ���� ������ ��带 ����
		}										//��, pre����� ���� ����� temp������ ������ ����
	}
	
	
	//Node Ž��
	public ListNode searchNode(String data) {
		ListNode temp = this.head;				//temp��忡 head�� ����Ű�� ù ��° �Ҵ�
		
		while(temp != null) {					//temp��尡 null�� �ƴ� ������ �ݺ��Ͽ� Ž��
			
			if(data.equals(temp.getData())) {	//�־��� �����Ϳ� temp����� �����Ͱ� ��ġ�� ��� �ش� temp��带 return
				return temp;
			} else {
				temp = temp.link;				//�����Ͱ� ��ġ���� ���� ��� temp ��忡 ���� ��� �Ҵ�.
			}
		}
		
		return temp;
	}
	
	
	//����Ʈ�� ��带 �������� ����
	public void reverseList() {
		ListNode next = head;					//head�� �����ϴ� ù��° ��带 �Ҵ�.
		ListNode current = null;
		ListNode pre = null;
		
		while(next != null) {					//next��尡 ���������� �̵��ϸ� current����� link�� pre��带 �����ϵ��� ��
			pre = current;						//pre��带 current��� ��ġ�� �̵�
			current = next;						//current���� next��� ��ġ�� �̵�
			next = next.link;					//next���� ���� ��� ��ġ�� �̵�
			current.link = pre;					//current����� link�� pre��带 �Ҵ��Ͽ� ����
		}

		head = current;							//current��尡 ������ ��带 ����ų ��, head�� current��带 �����ϵ��� ��
	}
	
	
	//���� ����Ʈ�� ����� ��� �����͸� ���
	public void printList() {
		ListNode temp = this.head;				//temp ��忡 head�� ����Ű�� ù��° ��带 �Ҵ�
		System.out.printf("L = (");
		while (temp != null) {					//temp ��尡 null�� �ƴ� ������ �ݺ��Ͽ� ���
			System.out.printf(temp.getData());
			temp = temp.link;					//temp ��忡 ���� ���(temp.link) �Ҵ�
			if(temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
}
