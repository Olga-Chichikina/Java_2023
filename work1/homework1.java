import java.util.Random;

public class homework1 {
    int i;
    int n;
        
    Random random = new Random();

    public static void main(String[] args) {

    /* 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i */
    //int i = new Random().nextInt(0,200);
    //System.out.println(i);

    /* 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа */
    //int n = Integer.toBinaryString(i).length();
    //System.out.println(n);

    /* 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1 */

    int i = new Random().nextInt(20);
    int n = Integer.toBinaryString(i).length();
    int cnt = 0;
    int j = Short.MAX_VALUE;
        for ( ; i <=j ; i++){
            if (i % n == 0 ){
                cnt++;
            }
        }
    int[] m2 = new int[cnt];
    cnt = 0;
        for ( ;  i <= j; i++) {
            if ( i % n == 0 ) {
                m2[cnt++] = i;
        }
    System.out.println(m2);
    }



    //int max = new Random().nextInt(i, 200);
    //for( int j = 0; j < m1.length; j++){
    //    if ( i < max) {
    //        if(i % 2 == 0) {
    //            m1[j] = i; 
    //            System.out.println(i);
    //        }
    //        i++;
    //    }
    //}

    /* 4.Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2  */
   // int i = new Random().nextInt(200);
   //int n = Integer.toBinaryString(i).length();
   // int cnt = 0;
   //     for (int j = Short.MIN_VALUE; j <= i; j++){
   //         if (j % n == 0 ){
   //             cnt++;
   //         }
   //     }
   // int[] m1 = new int[cnt];
   // cnt = 0;
   // for (int j = Short.MIN_VALUE; j <= i; j++) {
   //     if ( j % n == 0 ) {
   //         m1[cnt++] = j;
   //     }
   // System.out.println(m1);
   // }
}
}

