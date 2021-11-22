public class FindkthElement{

    static class Node{
        int data;
        Node next;
 
        
        Node (int data){
            this.data = data;
        }
    }
 
    static Node findNodes(Node head, int k)
    {
    
        if (k <= 0 || head == null)
            return null;
 
        Node current = null;
 
        int i = 0;
        for (Node temp = head; temp != null; temp = temp.next){
            if (i % k == 0){

                if (current== null)
                    current = head;
                else
                    current = current.next;
            }
            i++;
        }
        return current;
    }
 
    
    static void printList(Node node) {
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k =2;
 
        Node answer = findNodes(head, k);
        System.out.println(answer.data);
    }
}