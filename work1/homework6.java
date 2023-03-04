import java.util.ArrayList;
import java.util.HashMap;

// Разработать программу, имитирующую поведение коллекции HashSet.
// В программе создать метод add добавляющий элемент, метод toString 
// возвращающий строку с элементами множества и метод позволяющий 
// читать элементы по индексу. Формат данных Integer.

public class homework6 {
    public static void main(String[] args) {

        MySet set = new MySet();
        set.add(3);
        set.add(5);
        set.add(9);
        set.add(12);
        set.add(15);
        set.add(18);
        // set.remove(18);

       // set.toString();
       // System.out.println(set.get(3));
        System.out.println(set.getArrayList());
        System.out.println(set.tailSet(9));
        System.out.println(set.headSet(9));
        System.out.println(set.subSet(9, 15));
    }

}

class MySet {
    private HashMap<Integer, Object> values = new HashMap<>();
    private static final Object X = null;

    void add(int data) {
        values.put(data, X);
    }

    public String toString() {
        values.forEach((k, v) -> System.out.println(k));
        return values.keySet().toString();
    }

    int size() {
        return values.size();
    }

    void remove(int data) {
        values.remove(data);
    }

    int get(int ind) {
        return (int) values.keySet().toArray()[ind];
    }

    ArrayList getArrayList() {
        ArrayList<Integer> res = new ArrayList<>();
        values.forEach((k, v) -> res.add(k));
        return res;
    }
    MySet headSet(int data){
        MySet res = new MySet();
        for (int el: values.keySet()) {
          if (data == el ){
            break;
          }
            res.add(el);
        }
        return res;
    }

    
    MySet tailSet(int data){
        boolean ad = false;
        MySet res = new MySet();
        for (int el: values.keySet()) {
            if (data == el){
                ad = true;
            }
            if (ad) {
                res.add(el);}
        }
        return res;
    }
      
    MySet subSet (int key1, int key2){
        MySet res = new MySet();
        boolean ad = false;
        int stop = key1;
        for (int el: values.keySet()) {
            if (el == key1 && !ad){
                ad = true;
                stop = key2;
            }
            if (el == key2 && !ad ){
                ad = true;
            }
                if (ad){
                    res.add(el);
                    if (el == stop){
                        break;
                    }
                }
        }
        
        return res;
      }

    
}
