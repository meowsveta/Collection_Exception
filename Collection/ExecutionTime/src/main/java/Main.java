
public class Main {

    //- Исследовать работу ArrayList, LinkedList, TreeSet, HashSet.
    // На практике измерить время выполнения операций добавления, поиска и удаления элемента.
    // Сравнить полученные результаты и объяснить, в каком случае какая коллекция работает быстрее.

    public static void main(String[] args) {
        ArrayListClass arrayListClass = new ArrayListClass();
        LinkedListClass linkedListClass = new LinkedListClass();
        TreeSetClass treeSetClass = new TreeSetClass();
        HashSetClass hashSetClass = new HashSetClass();

        start(arrayListClass);
        start(linkedListClass);
        start(treeSetClass);
        start(hashSetClass);
    }

    public static void start(Collection collection){
        System.out.println(collection.getClass());
        long start = System.nanoTime();
        collection.add();
        System.out.println("Скорость добавления 1000 элементов: "+ (System.nanoTime() - start)+ " наносекунд.");

        start = System.nanoTime();
        collection.search(500);
        System.out.println("Скорость поиска элемента: "+ (System.nanoTime() - start) + " наносекунд.");

        start = System.nanoTime();
        collection.delete(499);
        System.out.println("Скорость удаления элемента: " + (System.nanoTime() - start) + " наносекунд.");
    }
}
