package Snorlax054;
public class Main {
    public static Node<Integer> ex2(Node<Integer> head) {
    }


    private static boolean exists(Node<Integer> head, int val) {
        Node<Integer> c = head;
        while (c != null) {
            if (c.getValue() == val)
                return true;
            c = c.getNext();
        }
        return false;
    }

    public static void printList(Node<Integer> head) {
        Node<Integer> cur = head;
        while (cur != null) {
            System.out.print(cur.getValue() + " ");
            cur = cur.getNext();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Person person1 = new Person("David", "Cohen");
        Node<Person>people=new Node<Person>(person1);
        people.setNext( new Node<Person>( new Person("David", "Cohen")));
    }
}