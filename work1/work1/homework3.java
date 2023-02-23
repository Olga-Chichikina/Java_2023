package work1;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.ListIterator;
import java.util.LinkedList;

public class homework3 {

    public static void main(String[] args) {
      // 1.  Создать новый список, добавить несколько строк с названиями  цветов и вывести коллекцию на экран.  
        ArrayList<String> list = new ArrayList<>();
        list.add("blue");
        list.add("red");
        list.add("black");
        list.add("white");
        list.add("yellow");
        list.add("green");
        System.out.println(list);
        System.out.println("-".repeat(15));
        for(int i = 0; i< list.size(); i++){    // вывод списка на экран
            System.out.println(list.get(i));  
        }
         list.forEach(n-> System.out.println(n)); // вывод списка на экран
         for (String str:list){                   // вывод списка на экран
             System.out.println(str);
         }
      // 2.  Итерация всех элементов списка цветов и добавления к каждому символа '!'.
             for (int i = 0; i < list.size(); i++){
                list.add("!");
             }      
             System.out.println(list);
      // 3.  Вставить элемент в список в первой позиции.
                list.add(0, "Elem");
                System.out.println(list );

      // 4.  Извлечь элемент (по указанному индексу) из заданного списка.
                System.out.println(list.get(4));

      // 5.  Обновить определенный элемент списка по заданному индексу.
                list.set(3, "black2");
                System.out.println(list);

      // 6.  Удалить третий элемент из списка.
                list.remove(3);
                System.out.println(list);

      // 7.  Поиска элемента в списке по строке.
               System.out.println(list.contains("red"));
               System.out.println(list.indexOf("red"));

      // 8.  Создать новый список и добавить в него несколько елементов первого списка.
             ArrayList<String> list2 = new ArrayList<>();
            //  list2.add("red");
            //  list2.add("blue");
            //  list2.add("black");
            //  list2.add("green");

            for (int i =0 ; i < 4; i++){
                list2.add(list.get(i));
            }

             System.out.println(list2);

      // 9.  Удалить из первого списка все элементы отсутствующие во втором списке.
             list2.retainAll(list);
             System.out.println(list2);

      // 10. *Сортировка списка.
             Collections.sort(list2);
             System.out.println(list2);


      // 11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
           
            long begin = System.currentTimeMillis();

            for (int i = 0 ; i < 1000 ; i++){
                list.add(0, "Elem");
                //System.out.println(list );
           }
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
           
            LinkedList<String> list4 = new LinkedList<>(list);
            long begin1 = System.currentTimeMillis();

            for (int i = 0 ; i < 1000 ; i++){
                list4.add(0, "Elem");
            }
            long end1 = System.currentTimeMillis();
            System.out.println("*".repeat(15));
            System.out.println(end1 - begin1);


    }
}
