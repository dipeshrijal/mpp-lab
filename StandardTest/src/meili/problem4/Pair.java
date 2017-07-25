package meili.problem4;


public class Pair<K, V> {
	private K first;
    private V second;

    public Pair(K key, V value) {
		this.first = key;
		this.second = value;
    }
 
    public String toString(){
    	return "[" + first + ", " + second + "]";
    }
}