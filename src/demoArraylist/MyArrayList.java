package demoArraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public E get(int index){
        return (E) element[index];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElement() {
        return element;
    }
    public void setElement(Object[] element) {
        this.element = element;
    }
    public MyArrayList() {
        element = new Object[DEFAULT_CAPACITY];
    }
    private void setCapacity() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }
    public void add(E e ) {
        if (size == element.length) {
            setCapacity();
        }
        element[size++] = e;
    }
    public void add(E e ,int index){
        if (size == element.length) {
            setCapacity();
        }
        System.arraycopy(element, index, element, index+1, size-index);
        element[index] = e;
        size++;
    }

    public void remove(E e){
        for(int i=0; i<size; i++){
            if(element[i].equals(e)){
                System.arraycopy(element, i+1, element, i, size-i-1);
            }
        }
        element[size-1]=null;
        size--;
    }
    public int size() {
        int index = 0;
        for (int i = 0; i < element.length; i++) {
            if (element[i] != null) {
                index++;
            }
        }
        return index;
    }
}

