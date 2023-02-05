public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // insert using recursion

    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, --index, node.next);
        return node;
    }
    

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index ==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // questions
    // Q1: Remove Duplicates from LL
    public void duplicate(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // Q2: Merge two sorted LL in a sorted manner
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while(f!=null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }

        while (s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }

    // Q3: LinkedList Cycle: Check if the LL contains a cycle
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // Q4: Length of LL cycle
    public int lengthCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                // calculate the length
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp!=slow);
                return length;
            }
        }
        return 0;
    }

    // Q6: Starting Node of the Cycle
    public Node detectCycle(Node head){
        int length = 0;
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                length = lengthCycle(slow);
                break;
            }
        }
        // find the start node
        Node f = head;
        Node s = head;
        while(length>0){
            s=s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }


    // Q7: Happy Number
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);

        if (slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    // Q8: Middle of a number

    public Node middleNode(Node head){
        Node s = head;
        Node f = head;

        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    // Q9: BubbleSort

    public void bubbleSort(){
        bubbleSort(size-1,0);
    }

    private void bubbleSort(int row, int col){
        if(row==0){
            return;
        }

        if(col < row){
            Node first = get(col);
            Node second = get(col+1);

            if(first.value > second.value){
                // swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second==tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        } else {
            bubbleSort(row-1, 0);
        }
    }

    // Q10: recursion reverse
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // In place reversal
    public Node reverseList(Node head){
        if(head == null){
            return head;
        }
        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while(pres != null){
            pres.next= prev;
            prev = pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }

    // Q11: Reverse a part of LL
    public MergeSortLL.ListNode reverseBetween(MergeSortLL.ListNode head, int left, int right){
        if (left==right){
            return head;
        }

        // skip the first left-1 nodes
        MergeSortLL.ListNode current = head;
        MergeSortLL.ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        MergeSortLL.ListNode last = prev;
        MergeSortLL.ListNode newEnd = current;
        
        // reverse between left and right
        MergeSortLL.ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next= prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }

        if (last != null){
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = prev;
        return head;
    }

    // Q12: Palindrome LL
    public boolean isPalindrome(Node head){
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid);
        Node rereverseHead = headSecond;

        // compare both the halves
        while(head!=null && headSecond != null){
            if(head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }


    // Q13: Reorder List
    public void reorderList(Node head){
        if(head == null || head.next == null){
            return;
        }

        Node mid = middleNode(head);
        Node hs = reverseList(mid);
        Node hf = head;

        // rearrange
        while (hf!=null && hs!=null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        // setting next of tail to null
        if(hf!=null){
            hf.next = null;
        }
    }


    // Q14: Reverse every k group
    // its also reversing < k end items -> modify it accordingly
    public Node reverseKGroup(Node head, int k){
        if(k<=1 || head == null){
            return head;
        }
        Node current = head;
        Node prev = null;

        while(true){
            Node last = prev;
            Node newEnd = current;

            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next= prev;
                prev = current;
                current = next;
                if(next!=null){
                    next = next.next;
                }
            }

            if (last != null){
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = prev;
            if(current == null){
                break;
            }
            prev = newEnd;
        }
        return head;
    }

    // Q15: Reverse alternate k node
    public Node reverseAlternateKGroup(Node head, int k){
        if(k<=1 || head == null){
            return head;
        }
        Node current = head;
        Node prev = null;

        while(current!=null){
            Node last = prev;
            Node newEnd = current;

            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next= prev;
                prev = current;
                current = next;
                if(next!=null){
                    next = next.next;
                }
            }

            if (last != null){
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = prev;
            // skip the k nodes
            for (int i = 0; current!=null && i<k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    // Q16: Rotate k list
    public Node rotateRight(Node head, int k){
        if(k<=0 || head == null || head.next == null){
            return head;
        }
        Node last = head;
        int length = 1;
        while(last.next != null){
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;

        Node newLast = head;
        for (int i = 0; i < skip -1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }


    public static void main(String[] args) {
        /*
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.display();
        list.duplicate();
        list.display();
         */
        LL first = new LL();
        LL second = new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();
    }
}
