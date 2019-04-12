package com.danao.leecode;

/**
 * @author zhang
 * @version 1.0
 * @classname ListSumTwoNum
 * @descriptionclass class describe
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @createdate 2019/4/12
 * @since 1.0
 */
public class ListSumTwoNum {


	public static class ListNode{
		public int value;
		public ListNode next;
		public ListNode(int value){
			this.value = value;
		}

		@Override
		public String toString() {
			return "ListNode{" +
					"value=" + value +
					", next=" + next +
					'}';
		}
	}


/*	public static ListNode twoNumSum(ListNode one,ListNode two){

		return new ListNode(10);
	}*/


	static int carry = 0;

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if(l1 ==null && l2==null){
			return null;
		}
		//
		int x = (l1 != null)?l1.value:0;
		int y = (l2 != null)?l2.value:0;
		ListNode ln1 = (l1 != null)?l1.next:null;
		ListNode ln2 = (l2 != null)?l2.next:null;
		ListNode nextNode = addTwoNumbers(ln1,ln2);

		ListNode sumNode = new ListNode((carry+x+y)%10);
		//与10取整
		carry = (carry+x+y)/10;

		sumNode.next = nextNode;

		return sumNode;
	}

	public static void print(ListNode listNode){
		if(listNode == null ){
			System.out.println("空链表");
		}else{
			ListNode p = listNode;
			while (p != null){
				System.out.print(" : " + p.value);
				p = p.next;
			}
			System.out.println("");
		}

	}


	public static ListNode getListNodeFromIntArr(int[] arr){
		if(arr == null || arr.length == 0 ){
			return new ListNode(0);
		}
		if(arr.length == 1){
			return new ListNode(arr[0]);
		}
		ListNode result = new ListNode(arr[0]);
		//todo 链表添加值处有坑 必须新建移动指针
		ListNode p = result;
		for(int i= 1;i < arr.length;i++){
			//赋值
			p.next = new ListNode(arr[i]);
			//指针指向下一个位置
			p = p.next;
		}
		return result;
	}

	public static void main(String[] args) {

		ListNode a = getListNodeFromIntArr(new int[]{2,4,3});
		ListNode b = getListNodeFromIntArr(new int[]{5,6,4});
		ListNode c = getListNodeFromIntArr(new int[]{0});
		print(a);
		print(b);

		ListNode d = addTwoNumbers(a,c);
		print(d);

	}


}
