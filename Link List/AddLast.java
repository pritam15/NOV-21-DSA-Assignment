class ListNode{
    int data;
    ListNode next;
    ListNode(int data){this.data = data; next = null;}
}
class LL{
    ListNode head;
    public void addAtLast(int data) {
        ListNode newListNode = new ListNode(data);
  
        if(head == null) {
            head = newListNode;
            return;
        }
  
        ListNode lastListNode = head;
        while(lastListNode.next != null) {
            lastListNode = lastListNode.next;
        }
  
        lastListNode.next = newListNode;
    }
  
    public void printList(){
       if(head == null){
           System.out.print("List is Empty");
            return;
        }
        ListNode  currListNode = head;
        while(currListNode != null){
            System.out.print(currListNode.data +" ");
            currListNode = currListNode.next;
        }
        System.out.print("null");
    }
}
public class AddLast{
    public static void main(String[] args){
        LL  list = new LL();
        list.addAtLast(1);
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtLast(4);
        list.addAtLast(5);
        list.addAtLast(6);
        list.printList();
    }
}
