package DataStructure.LinkedList;


public class MyLinkedList<AnyType> {

    //首元节点
    private Node<AnyType> first;
    //头指针
    private Node<AnyType> head;
    //链表长度
    int size;

    public MyLinkedList() {
        initlist();
    }

    //初始化链表
    public boolean initlist(){
        size = 0;
        first = new Node<>(null,null);
        head = new Node<>(null,first);
        return true;
    }
    //判断是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    //获取节点
    public Node<AnyType> getNode(int i){
        Node<AnyType> renode = head;
        for (int j = 0; j < i; j++){
            renode = renode.next;
        }
        return renode;
    }

    //在末尾添加元素
    public void add(AnyType a){
        if (size==0){
            head = new Node<>(a,null);
        }else {
            getNode(size).next=new Node<>(a,null);
        }
        size++;
    }

    //打印链表
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(getNode(i).data+"-->");
        }
        System.out.print("null");
    }


    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.add(11231);
        myLinkedList.add(12314);
        myLinkedList.add(12314231);
        myLinkedList.add(1311);
        System.out.println(myLinkedList.head.data);
        myLinkedList.print();



    }


}
