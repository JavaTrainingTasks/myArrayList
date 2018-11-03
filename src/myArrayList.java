import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class myArrayList<E> implements myCollection<E> {
    private E[] values = (E[]) new Object[0];

    @Override
    public boolean add(E e) {
        E[] temp = values;
        values = (E[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, values, 0, temp.length);
        values[values.length - 1] = e;
        return true;
    }

    @Override
    public void delete(int index) {
        E[] temp = values;
        values = (E[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);
        System.arraycopy(temp, index + 1, values, index, temp.length - index - 1);

    }

    @Override
    public E get(int index) {

        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new myIterator<>(values);
    }

    @Override
    public String toString() {
        return Arrays.stream(values).map(Object::toString).collect(Collectors.joining(", "));
    }
}
