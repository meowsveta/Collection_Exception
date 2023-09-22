import java.util.TreeSet;

public class TreeSetClass implements Collection{

    TreeSet<Integer> treeSet = new TreeSet<>();

    @Override
    public void add() {
        for (int i = 0; i < 999; i++){
            treeSet.add(i);
        }
    }

    @Override
    public void delete(int i) {
        treeSet.remove(i);
    }

    @Override
    public void search(int i) {
        treeSet.contains(i);
    }
}
