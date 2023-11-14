public class StackNode <E> {
    private E data;
    private StackNode<E> next;

    // Constructor to initialize a node with data
    public StackNode(E data) {
        this.data = data;
        this.next = null;
    }

    // Getter for data
    public E getData() {
        return data;
    }

    // Getter for the next node
    public StackNode<E> getNext() {
        return next;
    }

    // Setter for the next node
    public void setNext(StackNode<E> next) {
        this.next = next;
    }
    public E getParent() {
        return this.getParent();
    }

}

