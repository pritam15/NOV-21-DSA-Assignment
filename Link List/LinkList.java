class Node{
    int data;
    Node next;
    Node(int data){this.data = data; next = null;}
}
class MergeList{
    Node head;
    // add last Elements to the link list
    public void addLast(int data){
        Node newNode = new Node(data);
        Node  currNode = head;
        while(currNode != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
}


public class LinkList{
    public static void main(String[] args){
       
       
    }
}