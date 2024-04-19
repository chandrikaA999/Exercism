import java.lang.reflect.Array;
import java.util.NoSuchElementException;
class SimpleLinkedList<T> {
    class Node<T>{
        T data;
        Node<T> next;
        Node(T value){
            data = value;
            next = null;
        }
    }
    Node<T> root;
    int size;
    SimpleLinkedList() {
        root = null;
        size = 0;
    }

    SimpleLinkedList(T[] values) {
        for(T element: values){
            push(element);
        }
    }

    void push(T value) {
        if(root == null){
            root = new Node<T>(value);
        }else {
            Node<T> newNode = new Node<T>(value);
            newNode.next = root;
            root = newNode;
        }
        size++;
    }

    T pop() {
        if(root==null){
            throw new NoSuchElementException();
        }
        else{
            T nodeValue = root.data;
            root = root.next;
            size--;
            return nodeValue;
        }
    }

    void reverse() {
        if(root==null || root.next==null){
            return;
        }
        Node<T> prev=null,next=root.next;
        root.next = prev;
        while (next!=null){
            prev = root;
            root = next;
            next = next.next;
            root.next = prev;
        }
    }

    T[] asArray(Class<T> clazz) {
        T[] listElements = (T[])Array.newInstance(clazz, size);
        Node<T> pointerNode = root;
        int index = 0;
        while (pointerNode != null){
            listElements[index] = pointerNode.data;
            pointerNode = pointerNode.next;
            index++;
        }
        return listElements;
    }

    int size() {
        return size;
    }
}
