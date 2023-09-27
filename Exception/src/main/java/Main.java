import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) throws MyException {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int count;
        try {
            count = scanner.nextInt();
        } catch (Exception e) {
            throw new MyException("Введено не число", e.getCause());
        }

        add(count);

        if (arrayList.size() > 10) {
            throw new MyException("Больше 10");
        }
    }

    public static void add(int a){

        for (int i = 0; i < a; i++){
            arrayList.add(i);
        }
    }
}
