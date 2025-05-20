package Day_10_DSA_Impact.LinkedList;

public class LinkedList {

    class Node{
        int data ;
        Node next;
    }

    Node head;
    Node tail;
    int size;

    public void addFirst(int data){
        if (size == 0){
            Node newNode = new Node();
            newNode.data = data;
            head = newNode;
            tail = newNode;
            size++;
        }else {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void addLast(int data){
        if (size == 0){
            addFirst(data);
        }else {
            Node newNode = new Node();
            tail.next = newNode;
            newNode.data = data;
            newNode =tail;
            size++;
        }
    }

    public void addAt(int data, int index){
        if (index == 0){
            addFirst(data);
        }else if (index == size){
            addLast(data);
        }else {
            Node previousIndex = getNode(index);
            Node nextIndex = getNode(index - 1);
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = nextIndex;
            previousIndex.next = newNode;
            size++;

        }
    }

    public Node getNode(int index){
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public Node printList(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    public int getFirst(){
        return head.data;
    }

}
