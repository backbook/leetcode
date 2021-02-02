package DataStructure.LinkedList;

/**
 * 链表操作
 * @param <Data>
 */
public class LinkedList<Data> {

    private class Node<Data>{
        //定义数据类型
        Data data;
        //定义
        Node<Data> next;
        public Node(Data data){
            this.data = data;
        }
    }

    private Node head;

    private Node last;

    private int size;

    public Node get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node temp = head;
        for (int i = 0; i < index;i++ ){
            temp = temp.next;
        }
        return temp;
    }

    private void addLast(Data data){
        Node insertNode = new Node(data);
        if (size == 0){
            head = insertNode;
            last = insertNode;
        } else {
            last.next = insertNode;
            last = insertNode;
        }
        size ++;
    }

    private void insert(Data data,int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node insertNode = new Node(data);
        //前两个方法是用来进行插入操作
        if (size == 0){
            head = insertNode;
            last = insertNode;
        }else if(index == size) {
            last.next = insertNode;
            last = insertNode;
        } else if(index == 0){
            insertNode.next = head;
            head = insertNode;
        }else {
            Node prevNode = get(index - 1) ;
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        size ++;
    }


    public void  print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }







    public static void main(String[] args) {
        LinkedList<Integer>  linkedList = new LinkedList();
        linkedList.addLast(313);
        linkedList.addLast(3131);
        linkedList.addLast(3131311);
        linkedList.addLast(4111);
        linkedList.print();
    }


}
