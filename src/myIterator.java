import java.util.Iterator;

public class myIterator<E> implements Iterator {
    private E[] values;
    private int index = 0;

    myIterator(E[] objects) {
        this.values = objects;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}

