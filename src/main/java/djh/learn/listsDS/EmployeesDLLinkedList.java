package djh.learn.listsDS;

import jdk.jshell.spi.SPIResolutionException;

public class EmployeesDLLinkedList {

    private EmployeeDLNode head;
    private EmployeeDLNode tail;
    private int size;
    public void addToFront(Employee employee){
        EmployeeDLNode node = new EmployeeDLNode(employee);
        node.setNext(head);
        if(head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeDLNode node = new EmployeeDLNode(employee);
        if(tail == null){
            head = node;
        } else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }


    public void printList(){
        EmployeeDLNode current = head;
        System.out.print("Head -> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.print(" Null");
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        if(head == null && tail == null){
            return true;
        }
        return false;
    }

    public EmployeeDLNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeDLNode removeNode = head;
        head.getNext().setPrevious(null);
        head = head.getNext();
        size--;
        return removeNode;
    }
    public EmployeeDLNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }
        EmployeeDLNode removeNode = tail;
        if(tail.getNext() == null){
            head = null;
        } else {

            tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
            size--;
        }
        return removeNode;
    }

    public void addBefore(Employee empToInsert,Employee empBefore){
        EmployeeDLNode current = head;
        EmployeeDLNode empToInsrt = new EmployeeDLNode(empToInsert);
        while(current != null){
            System.out.print(current);
            if(current.getNode().getFirstName().equalsIgnoreCase(empBefore.getFirstName())){
                EmployeeDLNode temp;
                temp = current.getPrevious();
                current.setPrevious(empToInsrt);
                empToInsrt.setNext(current);
                empToInsrt.setPrevious(temp);
                temp.setNext(empToInsrt);
            }
            current = current.getNext();
        }
    }
}
