package lt.verbus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomMap<K, V> {
    private List<Pair<K, V>> listOfPairs;

    public CustomMap(){
        this.listOfPairs = new ArrayList<>();
    }

    public void insert(K key, V value) {
        listOfPairs.add(new Pair<K, V>(key, value));
    }

   //returns null if not found
    public V get(K key) {
        for (Pair pair : listOfPairs) {
            if (pair.getPairByKey(key) != null) {
                return (V)pair.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String body = "Map contents:";
        for (Pair pair : listOfPairs) {
            body += "\n" + pair.getKey() + " -> " + pair.getValue();
        }
        return body;
    }
}
