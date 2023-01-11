import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        list1.add("Sapo");
        list1.add("Tatu");
        list1.add("Gato");

        list2.add("Tatu");
        list2.add("Lambari");
        list2.add("Gato");

        List<String> list3 = new ArrayList<String>();

        for (int i = 0; i < list1.size(); i++) {
            String element1 = list1.get(i);
            for (int j = 0; j < list2.size(); j++) {
                String element2 = list2.get(j);
                if (element1 == element2 && !list3.contains(element1)) {
                    list3.add(element2);
                }
            }
        }
        
        System.out.println(list3);
    }
}
