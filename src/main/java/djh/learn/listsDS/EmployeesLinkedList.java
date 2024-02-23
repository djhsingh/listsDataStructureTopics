package djh.learn.listsDS;

public class EmployeesLinkedList {

    private EmployeeNode head;
    private int size;
    public void add(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print(" Null");
    }

    public int getSize() {
        return size;
    }

    public EmployeeNode removeFromFront(){
        if(head==null){
            return null;
        }
        EmployeeNode removeNode = head;
        head = head.getNext();
        removeNode.setNext(null);
        size--;
        return removeNode;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
}
