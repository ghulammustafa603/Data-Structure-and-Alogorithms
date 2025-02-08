public class Hello {
    Node head = null;
 
    public boolean isEmpty() {
        return head == null;
    }
 
    public void insertAtBeginningName(String name) {
        Node new_node = new Node(name);
        if (isEmpty()) {
            head = new_node;
        } else {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
    }
 
    public void insertAtBeginningNode(Node node) {
        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
 
    public void insertAtEnd(String name) {
        Node new_node = new Node(name);
        if (isEmpty()) {
            head = new_node;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new_node;
            new_node.prev = cur;
        }
    }
    public void insertAtEnd(Node node)
    {
        if(isEmpty())
        {
            head=node;
        }
        else
        {
         Node cur=head;
         while (cur.next!=null)
         {
             cur=cur.next;
         }
         cur.next=node;
         node.prev=cur;
        }
 
    }
    public void insertAfterName(String name ,Node node)
    {
        Node new_node=new Node(name);
        if(isEmpty())
        {
            head=new_node;
            new_node.next=node;
            node.prev=new_node;
        }
        else
        {
            Node cur=head;
            while(cur.name!=name)
            {
                cur=cur.next;
            }
            node.next=cur.next;
            cur.next=node;
            node.prev=cur;
            node.next.prev=node;
        }
 
    }
    public void insertBeforeName(String name, Node node)
    {
 
        Node new_node=new Node(name);
        if(isEmpty())
        {
            head=new_node;
            new_node.next=node;
            node.prev=new_node;
        }
        else
        {
 
 
        }
    }
    public void makeCircular()
    {
 
    }
 
    public void printAll() {
        if (head == null) {
            System.out.println("Linked list Does not exist");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.name);
                temp = temp.next;
            }
        }
    }
 
    public static void main(String args[]) {
        Hello list1 = new Hello();
        list1.insertAtBeginningName("Ghulam");
        Node new_node=new Node("Mustafa");
        list1.insertAtBeginningNode(new_node);
        list1.insertAtEnd("Kobhar");
        list1.printAll();
    }
 }
 
 