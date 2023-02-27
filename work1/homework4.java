import java.util.ArrayList;
import java.util.Scanner;

public class homework4 {
    
    public static void main(String[] arg) {
        //Ввод с консоли в формате Ф.И.О Возраст пол
        // 2. Выход из режима вода по горячей кнопке
        // 3. Вывод несортированного списка в формате Иванов И.И.
        
        ArrayList<String> listf = new ArrayList<>();
        ArrayList<String> listi = new ArrayList<>();
        ArrayList<String> listo = new ArrayList<>();
        ArrayList<Integer> listv = new ArrayList<>();
        ArrayList<String> listp = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО, возраст, пол  через пробел полностью. Выход : 1 ");
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("1")){
                break;
            }
            else {
                String[] data = in.split(" ");
                listf.add(data[0]);
                listi.add(data[1]);
                listo.add(data[2]);
                listv.add(Integer.parseInt(data[3]));
                listp.add(data[4]);     
            }
        }
        
        for (int i = 0; i < listf.size(); i++){    
            StringBuilder str = new StringBuilder();
            str.append(listf.get(i)).append(" ").append(listi.get(i).charAt(0)).append(".").append(listo.get(i).charAt(0)).append(".");
            System.out.println(str);
            }
        
    }   
    }
      







        


           
