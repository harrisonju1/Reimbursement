package backend.Inmem;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class InMemDB<K, V> {
    protected Map<K, V> data = new ConcurrentHashMap<>();
    protected boolean opened;

    public abstract V get(K key);
    public abstract boolean set(K key, V value);
    public abstract boolean open();
    public abstract void close();
    public abstract void remove(K key);
    public abstract void clear();
}

