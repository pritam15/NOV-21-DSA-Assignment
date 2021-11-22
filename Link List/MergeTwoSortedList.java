class Node {
    int data;
    Node next;
    Node(int data) {
      this.data = data;
    }
  }
  
  class MergeSortedLinkedList {
  
    private static Node mergeSortedLinkedLists(Node list1, Node list2) {
      Node result = null;
      Node head = null;
      
      while(list1 != null || list2 != null) {
        int mindata;
        if (list1 == null) {
          mindata = list2.data;
          list2 = list2.next;
        } else if (list2 == null) {
          mindata = list1.data;
          list1 = list1.next;
        } else if(list1.data <= list2.data) {
          mindata = list1.data;
          list1 = list1.next;
        } else {
          mindata = list2.data;
          list2 = list2.next;
        }
  
        if(result == null) {
          result = head = new Node(mindata);
        } else {
          result.next = new Node(mindata);
          result = result.next;
        }
      }
  
      return head;
    }
  
    public static void main(String[] args) {
      Node list1 = new Node(1);
      list1.next = new Node(2);
      list1.next.next = new Node(4);
  
      Node list2 = new Node(1);
      list2.next = new Node(3);
      list2.next.next = new Node(4);
  
      Node mergedList = mergeSortedLinkedLists(list1, list2);
      while(mergedList != null) {
        System.out.print(mergedList.data + " ");
        mergedList = mergedList.next;
      }
      System.out.println();
    }
  }