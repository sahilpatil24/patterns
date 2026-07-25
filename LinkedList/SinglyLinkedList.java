package LinkedList;

import org.w3c.dom.Node;

public class SinglyLinkedList {
  //head and tails
  public Node head;
  private Node tail;

  public int size = 0;

  //insertion methods
  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;

    if(tail == null) tail = head;
    size++;
  } 

  public void insertLast(int val) {
    if(tail == null) { insertFirst(val); return; }
    Node node = new Node(val);
    tail.next = node;
    tail = node;

    size++;
  }

  public void insert(int val, int index) {
    if(index == 0) {insertFirst(val); return; }
    if(index == size - 1) {insertLast(val); return; }

    Node node = get(index - 1);
    Node n = new Node(val);
    n.next = node.next;
    node.next = n;

    size++;
  }

  public int insertRec(int val, int index,Node n) {
    if(index == 0) {
      
      System.out.println("At 0\nThe node is " + n.value + "\n");
      
      return 0;
    }
    Node ns = head;
    insertRec(val,index - 1,ns.next);
    return 0;
  }

  //deletion
  public int deleteFirst() {
    int val = head.value;
    
    head = head.next;

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
    Node node = get(index - 1);
    
    int val = node.next.value;
    node.next = node.next.next;
    
    
    size--;
    return val;
  }

  //display
  public void display() {
    Node temp = head;
    while(temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.print("END\n");
  }
  
  public static void display(Node head) {
    Node temp = head;
    while(temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
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

  //lc 83
  public void deleteDuplicates(Node head) {
    if(head.next == null) return;

    if(head.next.value == head.value) {head.next = head.next.next;}
    else {head = head.next;}

    deleteDuplicates(head);
  }

  // public void Merge(Node s1,Node s2) {
  //   //solution thinking would be ki 
  //   //take the first node from the first list
  //   //at a time take one node from both the lists 
  //   //s1.node.next = s2.node
  //   Node dummy = new Node(0);
  //   Node tail = dummy;
  //   while(s1 != null && s2 != null) {
  //     if(s1.value < s2.value) {
  //       tail.next = s1;
  //       s1.next 
  //     }
  //   }
    
  //   }
  // }

  public static boolean detectCycle(Node head) {
    //detect a linkedlist cycle
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      

      if(fast == slow) {
        int count = getLengthOfCycle(slow,fast);
        System.out.println("Slow is at " + slow.value + "\nThe length is " + count);
        
        slow = head;
        while(count != 0) {slow = slow.next; count--;}
        fast = head;
        while(slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }
        System.out.println("Cycle starts at " + slow.value);
        
        return true;
      }
    }

    


    return false;
  }

  //get the length of the cycle
  public static int getLengthOfCycle(Node slow, Node fast) {
    int count = 1;
        slow = slow.next;
        while(slow != fast) {
          slow = slow.next;
          count++;
        }
        return count;
  }


  //876 - get middle of the linked list
  public static Node middleNode(Node head) {
    int length = getLengthOfLL(head);
    boolean even;
    even = length % 2 == 0 ? true:false;
    int middle = (int)length / 2;
    middle = even == true? middle + 1: middle;
    System.out.println("length is " + length);
    System.out.println("middle is " + middle);
    System.out.println("even is " + even);
    
    int count = 0;
    while(count < middle) {
      count++;
      head = head.next;
    }
    
    System.out.println("middle node is " + head.value);
    return head;
  }
  public static int getLengthOfLL(Node head) {
    //11 02
    int count = 0;
    Node n = head;
    while(n != null) {
      n = n.next;
      count++;
    }
    return count;
  }

  //148 sort the list
  public static Node bubble(Node head) {
    
    Node s = head;
    Node f = head.next;
    Node temp = head;
    while(s != null && s.next != null) {
    while(f != null && f.next != null) {
      if(s.value > f.value) {
        temp.value = s.value;
        s.value = f.value;
        f.value = temp.value;
        System.out.println("\ns is " + s.value);
        System.out.println("f is " + f.value);
        System.out.println("temp is " + temp.value);
      }
      f = f.next;
    }
    System.out.println("\n\nPass 1");
    System.out.println("s is " + s.value);
    System.out.println("f is " + f.value);
    // System.out.println("temp is " + temp.value);
    display(head);

    s = s.next;
  }
    
    return head;
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int val) {
      this.value = val;
    }

    public Node(int val, Node next) {
      this.value = val;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList sl = new SinglyLinkedList();
    sl.insertFirst(23);
    sl.insertLast(23);
    sl.insertLast(23);
    sl.insertLast(62);
    sl.insertLast(62);
    // sl.insertRec(12,2);
    // sl.delete(2);
    sl.deleteDuplicates(sl.head);
    // sl.display();

    
    
    SinglyLinkedList s2 = new SinglyLinkedList();
    Node n1 = s2.new Node(3);
    s2.head = n1;
    Node n2 = s2.new Node(2);
    Node n3 = s2.new Node(0);
    Node n4 = s2.new Node(-4);
    Node n5 = s2.new Node(6);
    n1.next = n2; 
    n2.next = n3; 
    n3.next = n4; 
    n4.next = n5;
    n5.next = null;
    //s2.display(); 
    // System.out.println(detectCycle(s2.head));
    // System.out.println(middleNode(s2.head));
    // s2.display();
    

    SinglyLinkedList s3 = new SinglyLinkedList();
    s3.insertLast(14);
    s3.insertLast(23);
    s3.insertLast(32);
    s3.insertLast(47);
    s3.insertLast(15);
    s3.insertLast(26);
    System.out.println(middleNode(s3.head));
    s3.display();
    System.out.println();
    display(bubble(s3.head));

  }
}