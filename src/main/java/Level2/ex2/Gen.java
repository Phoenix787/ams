package Level2.ex2;

/**
 * Created by Ксения on 15.03.2016.
 */
public class Gen<K,V> {
    K key;
    V value;

    public Gen(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Gen{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
