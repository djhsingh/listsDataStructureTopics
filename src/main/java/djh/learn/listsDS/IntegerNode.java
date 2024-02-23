package djh.learn.listsDS;

public class IntegerNode {
    private Integer node;

    private IntegerNode next;

    public Integer getNode() {
        return node;
    }

    public void setNode(Integer node) {
        this.node = node;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public IntegerNode(Integer node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "[" + node.intValue() +
                "]";
    }
}
