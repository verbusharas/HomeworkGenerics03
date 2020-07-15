package lt.verbus;

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair getPairByKey(K key) {
        if (key.equals(this.key)) { return this;}
        else return null;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
