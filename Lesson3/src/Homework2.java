import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {

///        Scanner scanner = new Scanner(System.in);
///        int a = scanner.nextInt();
///        int b = scanner.nextInt();

//        operational(a);
///        foobar(b);

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Random random = new Random(100);

        int Dlinna_I = scanner.nextInt();                       //переменная типа инт length будет равнятся введенному числу в консоли
        int Dlinna_J = scanner2.nextInt();
        int[][] massiv = new int[Dlinna_I][Dlinna_J];               // инициализировали массив и указали , что его длинна будет равна введенному нами числу
        for (int i = 0; i < massiv.length; i++) {                //massiv.length-указали что массив будет длинной равной введунному значению
            if(i % 3 == 0){
                System.out.println("Количество элементов делимых без остатка на 0 = " +'+');
            }
                                                                  // с помощью рандома указали ,что максимальное число будет 100
            for (int j = 0; j < massiv.length; j++) {
                massiv[i][j] = random.nextInt(100);
                if(j % 7 == 0){
                    System.out.println("Количество элементов делимых без остатка на 0 = " +'-');
                }

            System.out.println(Arrays.toString(massiv));                        /// с помощью  подключаемого метода (Arrays.toString(massiv)) вывели на экран
        }

    }

    /**
     * Method should perform some operation with int "number" based on some conditions:
     *  - if number is positive - increase it by 1
     *  - if number is negative - decrease it by 2
     *  - if number is equal to zero - replace it with 10
     *  return number value after operation
     */
//    public static int operational(int number) {
//        if (number>0) {
//            System.out.println(number+1);}
//            if (number<0){
//            System.out.println(number-2);}
//            if (number == 0){;
//            System.out.println(10);
//        }
//        return number;
//    }

    /**
     * Method should print different strings in console based on some conditions:
     * - if remainder of the division number by 3 is zero - print "foo" (example of number - 6)
     * - if remainder of the division number by 5 is zero - print "bar" (example of number - 10)
     * - if remainder of the division number by both 3 and 5 is zero 0  and - print "foobar" (example of number - 15)
     */
//    public static void foobar(int number2) {
//        if (number2 % 3 == 0) {
//            System.out.println("foo");
//        }
//        if (number2 % 5 == 0) {
//            System.out.println("------------");
//        }
//        if (number2 % 5 == 0 && number2 % 3 == 0) {
//            ;
//            System.out.println("foobar");
//        }
//
//
//    }

    /**
     * Steps to implement:
     * - Read two ints from console
     * - Create a two-dimensional int array (use ints that you read from console height and width)
     * - Fill array with random values (under 100)
     * - Print in console matrix with given size, but:
     * - If remainder of the division array element by 3 is zero - print "+" sign instead of array element value
     * - If remainder of the division array element by 7 is zero - print "-" sign instead of array element value
     * - Print "*" otherwise
     * <p>
     * Example:
     * - Values from console -  2 and 3
     * - Array will look like this (values be different because it's a random)
     * 6 11 123
     * 1 14 21
     * - For this values output in console should be:
     * <p>
     * + * *
     * * - +
     * <p>
     * Note that 21 % 3 == 0 and 21 % 7 = 0, but output is not +-, but +
//     */
//    public static void printMatrix() {
//
//
//
//
//
//    }
//}







//    /**
//     * (optional)
//     * Method should print all prime numbers < 1000
////     */
////    public static void printPrimeNumbers() {
////
////    }
//
    }
}