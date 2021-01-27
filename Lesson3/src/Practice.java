public class Practice {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int length = scanner.nextInt(); //переменная типа инт length будет равнятся введенному числу в консоли
//        int[] massiv=new int [length];  // инициализировали массив и указали , что его длинна будет равна введенному нами числу
//
//        for (int i = 0; i < massiv.length; i++) {   //massiv.length-указали что массив будет длинной равной введунному значению
//            massiv[i] = random.nextInt(100); // с помощью рандома указали ,что максимальное число будет 100
//        }
//        System.out.println(Arrays.toString(massiv)); /// с помощью  подключаемого метода (Arrays.toString(massiv)) вывели на экран
//    }
//
//
//}

//public static int countOdd(int[]array){   ///задача по четным и не четным числам
//    int sumElement=0;
//    for (int element:array){
//        if (element %2==1){
//            sumElement++;
//        }
//    }
//}


    // двумерные массивы и как с ними обращатся
    public static void main(String[] args) {
        int[] oneDarray = new int[]{1, 2, 3};
        int[][] twoDarray = new int[][]{
                {1, 2, 3},
                {3, 4, 5},
                {5, 7, 9},
                {5, 5, 7},

        };
//        for (int[] row :twoDarray){ ///// пройтись одномерному первому масииву
//            for (int column :row){
//                System.out.println(column+" ");
//            }
//        }
        for (int i = 0; i < twoDarray.length; i++) {   //twoDarray.length- количество рядов
            for (int j = 0; j < twoDarray[i].length; j++) {     /// i тый ряд j тый элемент
                {
                    System.out.println(twoDarray[i][j] + " ");


                }


            }


        }
    }

}