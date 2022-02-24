package leetcode;

public class MergeTwoSortedLists {
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode l1aux = list1;
    ListNode l2aux = list2;
    ListNode newList, newListAux;

    if (list1 == null) {
      return list2;
    }

    if (list2 == null) {
      return list1;
    }

    if (l1aux.val <= l2aux.val) {
      newList = new ListNode(l1aux.val);
      l1aux = l1aux.next;
    } else {
      newList = new ListNode(l2aux.val);
      l2aux = l2aux.next;
    }

    newListAux = newList;
    System.out.println("newListAux.val = " + newListAux.val);
    System.out.println("newListAux.next = " + newListAux.next);

    while (l1aux != null && l2aux != null) {
      if (l1aux.val <= l2aux.val) {
        newListAux.next = new ListNode(l1aux.val);
        System.out.println("if1 next = " + newListAux.next.val);
        l1aux = l1aux.next;
      } else {
        newListAux.next = new ListNode(l2aux.val);
				System.out.println("else next = " + newListAux.next.val);
        l2aux = l2aux.next;
      }
      newListAux = newListAux.next;
    }

    if (l1aux == null) {
      while (l2aux != null) {
        newListAux.next = new ListNode(l2aux.val);
        l2aux = l2aux.next;
				newListAux = newListAux.next;
      }
    } else {
      while (l1aux != null) {
        newListAux.next = new ListNode(l1aux.val);
        l1aux = l1aux.next;
				newListAux = newListAux.next;
      }
    }

    return newList;
  }

  public static void main(String[] args) {
    ListNode l1_4 = new ListNode(4);
    ListNode l2_4 = new ListNode(4);
    ListNode l1_2 = new ListNode(2, l1_4);
    ListNode l2_3 = new ListNode(3, l2_4);
    ListNode l1_1 = new ListNode(1, l1_2);
    ListNode l2_1 = new ListNode(1, l2_3);

    ListNode novo = mergeTwoLists(l1_1, l2_1);
    System.out.println("novo_1: " + novo.val);
    System.out.println("novo_2: " + novo.next.val);
    System.out.println("novo_3: " + novo.next.next.val);
		
		novo = mergeTwoLists(null, l2_1);
		System.out.println("novo_1: " + novo.val);
  }
}
