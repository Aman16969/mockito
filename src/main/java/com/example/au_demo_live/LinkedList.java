package com.example.au_demo_live;

public class LinkedList <T>{
    private Node<T> headnode;
//index=-1
//    index greater than size null or throw exception

    public T getelement(int index){
    if (index<0){
        throw new RuntimeException("Index cannot be negative");
    }
    var iteratorNode=headnode;
    var cuuIndex=0;
    while (iteratorNode!=null){
        if(cuuIndex==index){
            return iteratorNode.getValue();
        }
        iteratorNode=iteratorNode.getNextnode();
        cuuIndex++;
    }
    throw new RuntimeException("size greater");

        }
    public int addElement(T element){
        final var tempNode=new Node<T>();
        if(element==null){
            throw new NullPointerException("cannot add null");
        }
        tempNode.setValue(element);
        if (headnode==null){
            headnode=tempNode;
            return 0;
        }
        var iteratorNode=headnode;
        var curIndex=0;
        while (iteratorNode.getNextnode()!=null){
            iteratorNode =iteratorNode.getNextnode();
            }
        iteratorNode.setNextnode(tempNode);
        return getLength();
        }
        public int getLength(){
        int length=0;
        var iteratorNode=headnode;
        while (iteratorNode!=null){
            length++;
            iteratorNode.getNextnode();
        }
        return length;

        }


}

class Node<T>{
    private T value;
    private  Node<T> nextnode;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextnode() {
        return nextnode;
    }

    public void setNextnode(Node<T> nextnode) {
        this.nextnode = nextnode;
    }
}
