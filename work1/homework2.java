//import java.util.Scanner;

public class homework2{

    public static void main (String[] args){

        // 1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        // String one = "Здравствуйте! " ;
        // String two = " Я ваша тетя .Здравствуйте!" ;

                // Scanner scanner = new Scanner(System.in);
                // System.out.println("Введите 1 строку : ");
                // String in = scanner.nextLine();
                    
                // System.out.println("Введите 2 строку : ");
                // String instring = scanner.nextLine();

                // if (in.contains(instring)){
                //     System.out.println("yes");
                // }
                // else {
                //     System.out.println("No");
                // } 
                
        
        // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением 
        // друг друга (вхождение в обратном порядке).
                    // String one = "ПРИВЕТ" ;
                    // String two = "ТЕВИРП" ;

                    // StringBuilder builder = new StringBuilder(one);
                    // builder.reverse();
                    // String result = builder.toString();
                    // System.out.println(result);
                    // if( result.equals(two) ){
                    //     System.out.println("Вхождение в обратном порядке");
                    // }
                    // else {
                    //     System.out.println("No");
                    // }
            
        
        // *3. Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        
        // 4. Дано два числа, например 3 и 56, необходимо составить 
        // следующие строки: 3 + 56 = 59 , 3 – 56 = -53,  3 * 56 = 168
        //  Используем метод StringBuilder.append().
         int a = 3;
         int b = 56;
         String str1 = " + ";
         String str2 = " - ";
         String str3 = " = ";
         String str4 = " * ";
         int c = 59 ;
         int d = -53 ;
         int k = 168;

         StringBuilder builder = new StringBuilder(a);
         builder.append(a).append(str1).append(b).append(str3).append(c);
         builder.append(a).append(str2).append(b).append(str3).append(d);
         builder.append(a).append(str4).append(b).append(str3).append(k);
         String result = builder.toString();
         System.out.println(result);


        // 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        // 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        
        String text = " 1 + 3 = 4 ";
        StringBuilder builder2 = new StringBuilder(text);
        //builder2.insert(8,"равно").deleteCharAt(7);
        builder2.replace(7, 9, "равно ");
        String res = builder2.toString();
        System.out.println(res);

          
        
        // *7.Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
     

    }
}


