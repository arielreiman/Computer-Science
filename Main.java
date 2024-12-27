public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("David", "Cohen");
        Person person2 = new Person("Ariel", "Reiman");
        Person person3 = new Person("Yoav", "Dror");

        Node<Person> head = new Node<>(person1);
        head.setNext(new Node<>(person2));
        head.getNext().setNext(new Node<>(person3));

        System.out.println("List before inserting guests:");
        printList(head);

        head = insertGuests(head);

        System.out.println("\nList after inserting guests:");
        printList(head);
    }

    public static void printList(Node<Person> head) {
        Node<Person> current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
    public static Node<Person> insertGuests(Node<Person> head) {
	        Node<Person> current = head;
	        Node<Person> newHead = null;
	        Node<Person> last = null;
	        int guestNumber = 1;
	
	        while (current != null) {
	            Person guest = new Person("Guest" + guestNumber, "");
	            Node<Person> guestNode = new Node<Person>(guest);
	
	            if (newHead == null) {
	                newHead = guestNode;
	                last = guestNode;
	            } else {
	                last.setNext(guestNode);
	                last = guestNode;
	            }
	            guestNumber++;
	
	            last.setNext(current);
	            last = current;
	            current = current.getNext();
	        }

        return newHead;
    }


}
