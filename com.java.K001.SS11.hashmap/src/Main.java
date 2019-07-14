import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"Cao Bang");
        hashMap.put(2,"Thai Nguyen");
        hashMap.put(3,"Lang Son");
        hashMap.put(4,"Ha Noi");

        Set<Integer> set = hashMap.keySet();
        for(Integer key : set){
            System.out.println(key + " " + hashMap.get(key));
        }
    }

}
