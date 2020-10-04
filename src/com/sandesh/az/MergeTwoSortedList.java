package com.sandesh.az;

public class MergeTwoSortedList {
	class LinkedListNode {
		int data;
		LinkedListNode next;
		
		public LinkedListNode(int data, LinkedListNode node) {
			this.data = data;
			this.next = node;
		}
		
		public LinkedListNode() {
		}
 	}
	
	public LinkedListNode mergeTwoSortedList(LinkedListNode listAHead, LinkedListNode listBHead) {
		
		//Edge Cases
		if(listAHead == null) {
			return listBHead;
		}else if(listBHead == null) {
			return listAHead;
		}

		LinkedListNode mergedHead = new LinkedListNode();
		
		//Head & Tail Define 
		if(listAHead.data >= listBHead.data) {
			mergedHead = listBHead;
			listBHead = listBHead.next;
		}else {
			mergedHead = listAHead;
			listAHead = listAHead.next;
		}
		
		
		
		LinkedListNode mergedTail = mergedHead;
		
		while(listAHead != null && listBHead != null) {
			LinkedListNode temp;
			if(listAHead.data >= listBHead.data) {
				temp = listBHead;
				listBHead = listBHead.next;
			}else {
				temp = listAHead;
				listAHead = listAHead.next;
			}
			mergedTail.next = temp;
			mergedTail = temp;
		}

		if(listAHead != null) {
			mergedTail.next = listAHead;
		}else if(listBHead != null) {
			mergedTail.next = listBHead;
		}

		return mergedHead;
		
	}
}
