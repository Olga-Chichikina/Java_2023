import java.util.HashMap;

public class homework5 {
    
public static void main(String[] args) {

    // Создать множество, ключь и значение строки. Добавить шесть
    // элементов. Вывести в консоль значения. Добавить ко всем значениям 
    // символ "!". Создать второе множество с таким же обобщением. Ключи 
    // второго множества частично совпадают с ключеми первого. Объеденить
    // значания во втором множестве и первом если ключи совпадают.
    // Вывести результат в консоль.
    
    HashMap<Integer,String> hm = new HashMap<>();
    
    hm.put(0,"one");
    hm.put(1,"two");
    hm.put(2,"six");
    hm.put(3,"ten");
    hm.put(4,"seven");
    hm.put(5,"nine");

    for(Integer s:hm.keySet()) {
        System.out.println(hm.get(s));
    }
    for(Integer s: hm.keySet()) {
        hm.compute(s,(k,v) -> v += "!");
    
    }
    System.out.println(hm); 
    
    HashMap<Integer,String> hm1 = new HashMap<>();

    hm1.put(0,"cat");
    hm1.put(6,"dog");
    hm1.put(7,"sun");
    hm1.put(8,"pig");
    hm1.put(3,"big");
    hm1.put(2,"black");

    HashMap<Integer,String> hm3 = new HashMap<>();
    
    hm3.putAll(hm);
    hm3.putAll(hm1);
      
    System.out.println(hm3);

    
}

}
