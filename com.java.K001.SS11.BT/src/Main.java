import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"Truong", "Linh","Giang","Thang"};

        String s0,s1,s2,s3;
        s0 = "Truong";
        s1 ="Giang";
        s2 = "Linh";
        s3 = "Thang";

        ArrayList<String> al = new ArrayList<>();
        System.out.println("size " + al.size());
        al.add(s0); al.add(s1); al.add(s2); al.add(s3);
        System.out.println("List = "+al.toString());

        String[] name = new String[al.size()];
        al.toArray(name);
        for(String s:name) System.out.println(s + ".");
        System.out.println("");
    }
}
