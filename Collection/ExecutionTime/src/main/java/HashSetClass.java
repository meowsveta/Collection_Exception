import java.util.HashSet;

public class HashSetClass implements Collection{

    HashSet<Integer> hashSet = new HashSet<>();

    @Override
    public void add() {
        for (int i = 0; i < 999; i++){
            hashSet.add(i);
        }
    }

    @Override
    public void delete(int i) {
        hashSet.remove(i);

    }

    @Override
    public void search(int i ) {
        hashSet.contains(i);
    }
}
