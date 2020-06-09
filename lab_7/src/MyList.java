import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Arrays;

public class MyList implements List<CanBePutIntoBouquet> {

    private static int INITIAL_CAPACITY = 15;
    private CanBePutIntoBouquet[] arrayElements = new CanBePutIntoBouquet[INITIAL_CAPACITY];
    private int size = 0;

    public MyList() {
    }

    public MyList(CanBePutIntoBouquet bouquetMember) {
        arrayElements[size] = bouquetMember;
        size += 1;
    }

    public MyList(Collection<CanBePutIntoBouquet> bouquetElementsCollection) {
        for (CanBePutIntoBouquet bouquetMember : bouquetElementsCollection) {
            arrayElements[size] = bouquetMember;
            size += 1;
        }
    }

    public boolean add(CanBePutIntoBouquet bouquetMember) {
        if (size > 15) {
            arrayElements = Arrays.copyOf(arrayElements, INITIAL_CAPACITY + (int) (INITIAL_CAPACITY * 0.3));
        }
        arrayElements[size] = bouquetMember;
        size += 1;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends CanBePutIntoBouquet> bouquetElementsCollection) {
        arrayElements = new CanBePutIntoBouquet[INITIAL_CAPACITY];
        size = 0;
        if (bouquetElementsCollection.size() > 15) {
            arrayElements = Arrays.copyOf(arrayElements, INITIAL_CAPACITY + (int) (INITIAL_CAPACITY * 0.3));
        }
        for (CanBePutIntoBouquet bouquetMember : bouquetElementsCollection) {
            arrayElements[size] = bouquetMember;
            size += 1;
        }
        return true;
    }

    @Override
    public boolean addAll(int firstIndex, Collection<? extends CanBePutIntoBouquet> bouquetElementsCollection) {
        size = firstIndex;
        if (bouquetElementsCollection.size() > 15) {
            arrayElements = Arrays.copyOf(arrayElements, INITIAL_CAPACITY + (int) (INITIAL_CAPACITY * 0.3));
        }
        for (CanBePutIntoBouquet bouquetMember : bouquetElementsCollection) {
            arrayElements[size] = bouquetMember;
            size += 1;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<CanBePutIntoBouquet> iterator = iterator();
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<CanBePutIntoBouquet> iterator() {
        return new Iterator<CanBePutIntoBouquet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public CanBePutIntoBouquet next() {
                return arrayElements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(arrayElements, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public CanBePutIntoBouquet get(int i) {
        return null;
    }

    @Override
    public CanBePutIntoBouquet set(int i, CanBePutIntoBouquet bouquet) {
        return null;
    }

    @Override
    public void add(int i, CanBePutIntoBouquet bouquet) {

    }

    @Override
    public CanBePutIntoBouquet remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<CanBePutIntoBouquet> listIterator() {
        return null;
    }

    @Override
    public ListIterator<CanBePutIntoBouquet> listIterator(int i) {
        return null;
    }

    @Override
    public List<CanBePutIntoBouquet> subList(int i, int i1) {
        return null;
    }
}
