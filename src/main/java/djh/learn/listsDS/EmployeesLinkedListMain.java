package djh.learn.listsDS;

public class EmployeesLinkedListMain {
    public static void main(String[] args) {
        Employee john = new Employee("John","Adam",53533);
        Employee timm = new Employee("Timm","burton",3433);
        Employee paul = new Employee("Paul","Geferry",8777);
        Employee hanna = new Employee("Hanna","Montana",77575);

        EmployeesLinkedList list = new EmployeesLinkedList();
        list.add(john);
        list.add(timm);
        list.add(paul);
        list.add(hanna);
        list.printList();

        System.out.println("\n"+list.getSize());
        System.out.println(list.isEmpty());
        list.removeFromFront();
        list.printList();

        System.out.println("\n"+list.getSize());
        System.out.println(list.isEmpty());

    }
}
