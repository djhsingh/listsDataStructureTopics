package djh.learn.listsDS;

public class EmployeeDLNode {
    private Employee node;
    private EmployeeDLNode next;
    private EmployeeDLNode previous;
    public Employee getNode() {
        return node;
    }

    public void setNode(Employee node) {
        this.node = node;
    }

    public EmployeeDLNode getNext() {
        return next;
    }

    public void setNext(EmployeeDLNode next) {
        this.next = next;
    }

    public EmployeeDLNode(Employee node) {
        this.node = node;
    }

    public EmployeeDLNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDLNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return node.toString();
    }

}
