package TH_Lop_List;

import java.util.Arrays;

public class MyList<E>{
    private int size;
    private final int DEFAULT_CAPACITY=10;
    private  Object elements[];

    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void add(Object e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public Object get(int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: "+i+"Size: "+i);
        }
        return (Object)elements[i];
    }
}