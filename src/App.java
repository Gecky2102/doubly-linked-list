public class App {
    public static void main(String[] args) throws Exception {
        
        DoublyLinkedList dl1 = new DoublyLinkedList();
        DoublyLinkedList dl2 = new DoublyLinkedList();
        DoublyLinkedList dl3 = new DoublyLinkedList();
        DoublyLinkedList dl4 = new DoublyLinkedList();

        Node n1 = new Node('A');
        Node n2 = new Node('B');
        Node n3 = new Node('C');
        Node n4 = new Node('D');
        Node n5 = new Node('E');

        Node n67 = new Node('A');
        
        dl1.add(n1);
        dl1.add(n2);
        dl1.add(n3);
        dl1.print(true);
        dl1.print(false);
        dl2.add(n4);
        dl2.add(n5);
        dl1.merge(dl2);
        dl1.print(true);
        System.out.println();
        System.out.println(dl1.size());
        dl1.print(true);
        System.out.println(dl1.palindrome());

        System.out.println();
        dl4.add(n1);
        dl4.add(n2);
        dl4.add(n3);
        dl4.add(n4);
        dl4.add(n5);
        System.out.println("dl4");
        dl4.print(true);
        // dl4.slice(0, 1); 

        System.out.println();
        dl3.add(n1);
        dl3.add(n67);
        System.out.println(dl3.palindrome());

        dl2.shift(1);
        dl2.print(true);

        System.out.println();
        System.out.println("fine");


        // e così via...
    }
}
