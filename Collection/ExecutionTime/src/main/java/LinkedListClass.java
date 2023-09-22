import java.util.LinkedList;
public class LinkedListClass implements Collection{

    LinkedList<Integer> linkedList = new LinkedList<>();
    @Override
    public void add() {
        for (int i = 0; i < 999; i++){
            linkedList.add(i);
        }
    }

    @Override
    public void delete(int i) {
        linkedList.remove(i);
    }

    @Override
    public void search(int i) {
        linkedList.get(i);

    }
}
