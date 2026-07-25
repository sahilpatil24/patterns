package LinkedList;

public class DoublyLL {
  //head and tails
  private Node head;
  private Node tail;
  

  public int size = 0;

  //insertion methods
  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    node.prev = null; //change in doublyLL
    head.prev = node; //change in doublyLL
    head = node;

    if(tail == null) tail = head;
    size++;
  } 

  public void insertLast(int val) {
    if(tail == null) { insertFirst(val); return; }
    Node node = new Node(val);
    tail.next = node;
    node.prev = tail; //change in doublyLL
    tail = node;

    size++;
  }

  public void insert(int val, int index) {
    if(index == 0) {insertFirst(val); return; }
    if(index == size - 1) {insertLast(val); return; }

    Node node = get(index - 1);
    Node n = new Node(val);
    n.next = node.next;
    n.next.prev = n;
    n.prev = node; //change in doublyLL
    node.next = n;

    size++;
  }

  //deletion
  public int deleteFirst() {
    int val = head.value;
    
    head = head.next;
    head.prev = null; //change in doublyLL

    size--;
    return val;
  }

  public int deleteLast() {
    int val = tail.value;
    
    Node node = get(size - 1);
    node.next = null;
    tail = node;
    
    size--;
    return val;
  }

  public int delete(int index) {
    if(index == 0) {deleteFirst(); return 0; }
    if(index == size - 1) {deleteLast(); return 0; }
    
    Node node = get(index - 1);
    int val = node.next.value;
    
    if(node.next.next == null) {node.next = null; return val;}
    node.next.next.prev = node; //change in doublyLL
    //very important that if we do node.next = node.next.next then the current node is already deleted 
    // so node.next.next will show the node after the one which we want

    node.next = node.next.next;
    
    
    size--;
    return val;
  }

  //display
  public void display() {
    System.out.print("NULL -> ");
    Node temp = head;
    while(temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.print("END\n");
  }

  public void display2() {
    System.out.print("NULL -> ");
    Node temp = tail;
    while(temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.prev;
    }
    System.out.print("END\n");
  }

  //get
  public Node get(int index) {
    Node temp = head;
    for(int i = 1; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  private class Node {
    private int value;
    private Node next;
    private Node prev;

    public Node(int val) {
      this.value = val;
    }

    public Node(int val, Node next) {
      this.value = val;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    DoublyLL sl = new DoublyLL();
    sl.insertFirst(23);
    sl.insertLast(34);
    sl.insertLast(99);
    sl.insertLast(62);
    sl.insert(12,2);
    sl.display();
    sl.display2();
    sl.deleteFirst();
    sl.display2();
    sl.deleteLast();
    sl.display2();
    sl.delete(1);
    sl.display2();
  }
}
