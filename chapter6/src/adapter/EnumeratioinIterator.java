package adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class EnumeratioinIterator implements Iterator {
    Enumeration enumeration;

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
