package djh.learn.listsDS;

public class EmployeesDLLinkedListMain {
    public static void main(String[] args) {
        Employee john = new Employee("John","Adam",53533);
        Employee timm = new Employee("Timm","burton",3433);
        Employee paul = new Employee("Paul","Geferry",8777);
        Employee hanna = new Employee("Hanna","Montana",77575);
        Employee jimmy = new Employee("Jimmy","Jimmy",43433);

        EmployeesDLLinkedList list = new EmployeesDLLinkedList();
        list.addToFront(john);
        list.addToFront(timm);
        list.addToFront(paul);
        list.addToEnd(hanna);
        list.printList();

        //list.removeFromFront();

        System.out.println("\n"+list.getSize());
        list.printList();
        System.out.println(list.isEmpty());
      //  list.removeFromEnd();

        System.out.println("\n"+list.getSize());
        list.printList();
        System.out.println(list.isEmpty());
        list.addBefore(jimmy,john);
        list.addBefore(jimmy,timm);
        System.out.println("\n"+list.getSize());
        list.printList();
    }
}
