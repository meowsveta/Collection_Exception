import java.util.ArrayList;

public class ArrayListClass implements Collection{

    ArrayList<Integer> arrayList = new ArrayList<>();

    @Override
    public void add() {
        for (int i = 0; i < 999; i++){
            arrayList.add(i);
        }
    }

    @Override
    public void delete(int i) {
        arrayList.remove(i);
        //arrayList.subList(0, 999).clear();
    }

    @Override
    public void search(int i) {
        arrayList.get(i);
    }

}
