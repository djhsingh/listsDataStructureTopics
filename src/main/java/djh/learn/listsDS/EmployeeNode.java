package djh.learn.listsDS;

public class EmployeeNode {
    private Employee node;
    private EmployeeNode next;

    public Employee getNode() {
        return node;
    }

    public void setNode(Employee node) {
        this.node = node;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode(Employee node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return node.toString();
    }

}
