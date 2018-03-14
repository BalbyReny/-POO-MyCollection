package prueba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class MyCollection<E> implements Collection<E>
{   
    //to store the elements into MyCollection
    ArrayList<E> Storage = new ArrayList();
    @Override
    public int size () {
        return Storage.size ();
    }

    @Override
    public boolean isEmpty () {
        return Storage.isEmpty ();
    }

    @Override
    public boolean contains (Object o) {
        return Storage.contains (o);
    }

    @Override
    public Iterator<E> iterator () {
        return Storage.iterator ();
    }

    @Override
    public Object [] toArray() {
        return Storage.toArray ();
    }

    @Override
    public <T> T [] toArray(T [] ts) {
        return Storage.toArray (ts);
    }

    @Override
    public boolean add (E e) {
        return Storage.add (e);
    }

    @Override
    public boolean remove (Object o) {
        return Storage.remove (o);
    }

    @Override
    public boolean containsAll (Collection<?> clctn) {
        return Storage.containsAll (clctn);
    }

    @Override
    public boolean addAll (Collection<? extends E> clctn) {
        return Storage.addAll (clctn);
    }

    @Override
    public boolean removeAll (Collection<?> clctn) {
        return Storage.removeAll (clctn);
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        return Storage.removeAll (clctn);
    }

    @Override
    public void clear () {
        Storage.clear ();
    }    
}
