import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ListIterator;

public class MyList implements List<CanBePutIntoBouquet> {

    private static int INITIAL_CAPACITY = 15;

    public MyList() {
        INITIAL_CAPACITY += (int) (INITIAL_CAPACITY * 0.3);
    }

    public MyList(CanBePutIntoBouquet canBePutIntoBouquet) {
        INITIAL_CAPACITY += (int) (INITIAL_CAPACITY * 0.3);
        add(canBePutIntoBouquet);
    }

    public MyList(Collection<CanBePutIntoBouquet> collection) {
        INITIAL_CAPACITY += (int) (INITIAL_CAPACITY * 0.3);
        addAll(collection);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<CanBePutIntoBouquet> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(CanBePutIntoBouquet canBePutIntoBouquet) {
        return false;
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
    public boolean addAll(Collection<? extends CanBePutIntoBouquet> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends CanBePutIntoBouquet> collection) {
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
    public CanBePutIntoBouquet set(int i, CanBePutIntoBouquet canBePutIntoBouquet) {
        return null;
    }

    @Override
    public void add(int i, CanBePutIntoBouquet canBePutIntoBouquet) {

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
