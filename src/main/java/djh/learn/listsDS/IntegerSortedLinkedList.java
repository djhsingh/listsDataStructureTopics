package djh.learn.listsDS;

public class IntegerSortedLinkedList {

    private IntegerNode head;
    private int size;
    public void add(Integer value){
        IntegerNode node = new IntegerNode(value);
        if(isEmpty()){
            node.setNext(head);
            head = node;
        }
        if(!isEmpty()){
            IntegerNode current = head;
            while(current !=null){
                if(current.getNode().intValue() < value){
                    IntegerNode temp;
                    temp = current.getNext();
                    current.setNext(node);
                    node.setNext(temp);

                } else{
                    node.setNext(current);
                }
                current = current.getNext();
            }
        }


        size++;
    }

    public void printList(){
        IntegerNode current = head;
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


    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
}
