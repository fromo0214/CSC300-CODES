import java.util.Iterator;
public class GenericList<T> 
{
    public T[] items = (T[])new String[10];
    private int count;

    public void add(T item)
    {
        items[count++] = item;
    }

    public T get (int index)
    {
        return items[index];
    }

    public Iterator<T> iterator()
    {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T>
    {
        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list)
        {
            this.list = list;
        }

        @Override
        public boolean hasNext()
        {
            return (index < list.count);
        }

        @Override
        public T next()
        {
            return list.items[index++];
        }
    }
}
