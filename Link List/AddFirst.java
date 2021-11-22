class Node{
    int data;
    Node next;
    Node(int data){this.data = data; next = null;}
}
class Linklist{
    Node head;
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void Print(){
       if(head == null){
           System.out.print("List is Empty");
            return;
        }
        Node  currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

}
public class AddFirst {
    public static void main(String[] args){
       Linklist  list = new Linklist();
       list.addFirst(1);
       list.addFirst(2);
       list.addFirst(3);
       list.addFirst(4);
       list.addFirst(5);
       list.addFirst(6);
       list.Print();
    }
}
