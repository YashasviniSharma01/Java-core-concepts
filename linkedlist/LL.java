package linkedlist;

public class LL {
    public static class Node {
        int data;
        Node next;//apne hi type ke object ko point kr rha hai is liye node.
    }
    public static class LinkedList {//have information about all the nodes
        Node head;
        Node tail;
        int size;
        //Add Last
        public void addLast(int val) {
            Node temp = new Node();
            temp.data=val;
            temp.next=null;
            if(size==0){
                head=tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        //size
        public int size(){
            return size;
        }
        //display
        public void display(){
            Node temp= head;
            while(temp.next != null) {
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println();
        }
        //remove first
        public void removeFirst(){
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size==1) {
                head=tail=null;
                size=0;
            }else {
                head= head.next;
                size--;
            }
        }
        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }else {
                return head.data;
            }
        }
        public int getLast(){
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }else {
                return tail.data;   
            }
        }
        //find value at an index
        public int getAt(int idx){
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx<0 || idx>=size) {
                System.out.println("Invalid Argument");
                return -1;
            }else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp=temp.next;
                }
                return temp.data;
            }
        }
        public void addFirst(int val){
            Node temp = new Node();
            temp.data=val;
            temp.next=head;
            head=temp;
            size++;
        }
        public void addAtIndex(int val, int idx){
            if (idx<0 || idx>=size) {
                System.out.println("Invalid Argument");
            } else if (idx==0) {
                addFirst(val);
            } else if (idx==size-1) {
                addLast(val);
            } else {
                Node node= new Node();
                node.data = val;

                Node temp=head;
                for (int i = 0; i < idx-1; i++) {
                    temp=temp.next;
                }
                node.next=temp.next;//node waha dekhna start krde jaha temp dekh rha hai
                //abhi temp ko hataya nhi hai
                temp.next=node;//temp ko bola tum ab node ki taraf dekho
                size++;
            }
        }

        public void removeLast(){
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size==1) {
                head=tail=null;
                size=0;
            } else{
                Node temp = head;
                for (int i = 1; i < size-1; i++) {
                    temp=temp.next;
                }
                tail=null;
                temp.next=null;
                size--;
            }
        }


        // private method can only be accessed and called from within the same class in which it is defined. It cannot be accessed by other classes, including subclasses
        private Node getNodeAt(int idx){
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp=temp.next;
            }
            return temp;
        }
        public void reverseDI(){//data iterative
            int li =0;//left index
            int ri= size-1;//right index
            while(li<ri){
                Node left = getNodeAt(li);
                Node right= getNodeAt(ri);
                //swap
                int temp = left.data;
                left.data=right.data;
                right.data=temp;
                li++;
                ri--;
            }
        }
        public void reversePI(){//pointer iterative
            Node prev= null;
            Node curr = head;

            while(curr != null){
                Node next = curr.next;
                curr.next=prev;

                prev= curr;
                curr= next ;
            }
            Node temp = head;
            head = tail;
            tail=temp;
        }
        public void removeAt(int idx){
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return;
            }
            if (size == 0) {
                System.out.println("List is empty");
            } else if (idx== size-1) {
                removeLast();
            } else if (size==1) {
                head=tail=null;
                size=0;
            }else {
                Node temp=head;
                for (int i = 0; i < idx-1; i++) {
                    temp=temp.next;
                }
                Node nodeToDelete = temp.next;  // Save the node you're deleting
                temp.next = nodeToDelete.next;  // Bypass it in the list
                nodeToDelete.next = null;  // Disconnect it
                size--;
            }
        }
    }
}