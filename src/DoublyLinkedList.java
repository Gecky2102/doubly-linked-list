public class DoublyLinkedList {
    
    private Node head, tail;

    public DoublyLinkedList() {
        this.head = this.tail = null;
    }

    /**
     * Aggiunge un nodo alla fine della lista
     * @param newNode il nuovo nodo da aggiungere
     */
    public void add(Node newNode) {
        if (head == null && tail == null) {

            head = tail = newNode;
        }
        else {
            newNode.setPrev(tail);

            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // wrapper (burger wrap)
    private Node getRec(Node cursor, int index) {

        if (index == 0)
            return cursor;

        return getRec(cursor.getNext(), index-1);
    }

    /**
     * Get di un elemento in una specifica posizone
     * @param index posizione da leggere
     * @return l'elemento identificato dall'index
     * @throws IndexOutOfBoundsException
     */

    public Node get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Invalid index");

        return getRec(head, index);
    }

    // ------------ INSERISCI IL TUO CODICE QUI ----------------

    public void print(boolean forward) {
        if (forward) {
            Node cursor = head;

            while (cursor != null) {
                
                System.out.print(cursor.getLetter());
                cursor = cursor.getNext();
            
            }
        } else {
            
            Node cursor = tail;
            
            while (cursor != null) {
                System.out.print(cursor.getLetter());

                cursor = cursor.getPrev();
            }
        }

        System.out.println();
    }

    public int size() {


        int count = 0;
        Node cursor = head;
        while (cursor != null) {
            count++;

            cursor = cursor.getNext();
        }

        return count;
    }

    public void merge(DoublyLinkedList otherList) {
        if (otherList == null || otherList.head == null) return;

        if (head == null) {


            head = otherList.head;
            tail = otherList.tail;

            return;
        }

        tail.setNext(otherList.head);
        
        otherList.head.setPrev(tail);
        tail = otherList.tail;
    }

    // ci ho provato ma continuava a darmi Unhandled exception type Exception
    public String slice(int start, int end) {
        int n = size();

        if (start < 0 || end < 0 || start > n || end > n)

            throw new Exception("index non valido fratm");

        if (start == end) return "";

        StringBuilder sb = new StringBuilder(); // ho usato stringbuilder perchè è più comodo di char


        if (start < end) {
            if (start == n) return "";
            Node cursor = get(start);
            for (int i = start; i < end; i++) {


                sb.append(cursor.getLetter());
                cursor = cursor.getNext();

            }
        } else {
            if (start == n) return "";

            Node cursor = get(start);
            for (int i = start; i > end; i--) {

                
                sb.append(cursor.getLetter());
                cursor = cursor.getPrev();

            }
        }

        return sb.toString();
    }

    // TODO: Ricorsione se ho tempo e voglia
    public boolean palindrome() {
        
        int n = size();
        
        Node left = head;

        Node right = tail;

        for (int i = 0; i < n / 2; i++) {
            if (left.getLetter() != right.getLetter()) return false;

            left = left.getNext();

            right = right.getPrev();
        }

        return true;
    }



    public void shift(int amount) {
        int n = size();

        if (n == 0 || amount <= 0) return;

        int k = amount % n;
        if (k == 0) return;

        Node oldHead = head;

        Node oldTail = tail;

        Node newHead = get(n - k);
        Node newTail = newHead.getPrev();

        oldTail.setNext(oldHead);

        oldHead.setPrev(oldTail);


        newTail.setNext(null);
        newHead.setPrev(null);

        head = newHead;

        tail = newTail;
    }

    public void trim(int newSize) {

    }
}
