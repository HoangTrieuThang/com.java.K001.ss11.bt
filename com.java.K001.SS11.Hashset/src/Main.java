import java.util.HashSet;
import java.util.Iterator;

public class Main {
    private static HashSet<String> hashSet;

    public static void main(String[] args) {
        hashSet = new HashSet<>();

        hashSet.add("Truong");
        hashSet.add("Giang");
        hashSet.add("Linh");
        hashSet.add("Thang");

        for (String string : hashSet) {
            System.out.print(string + " ");
        }
    }
}