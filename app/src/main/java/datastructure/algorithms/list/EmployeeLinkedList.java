package datastructure.algorithms.list;

public class EmployeeLinkedList {
    private EmployeeNode head;

    public int getSize() {
        return size;
    }

    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null); // not super required, its a dead reference clean up.
        return removedNode;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head ->");
        while(current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null\n");
    }

    public boolean isEmpty(){
        return head == null;
    }
}
