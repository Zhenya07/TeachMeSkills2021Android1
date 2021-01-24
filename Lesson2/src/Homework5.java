public class Homework5 {


    public static void main(String[] args) {
        double array[] = {1, 2, 3, 4, 5};


        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];


        }
        System.out.println (sum / array.length);
    }
        public static double average(int[] array){
            double sum = average(array);
            return (double) sum / array.length;


        }


    }




