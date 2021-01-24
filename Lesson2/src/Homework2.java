
/// первое задание по вычитанию и сложению.

public class Homework2 {


    public static void main(String[] args) {


        Homework2 work1 = new Homework2();
        int SummaDvyhChisel = work1.sum(20, 10);
        System.out.println(SummaDvyhChisel);

        long vichisleniedvyxchisel = work1.vich(5, 6);
        System.out.println(vichisleniedvyxchisel);

    }


    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static long vich(long a, long b) {
        long result = a - b;
        return result;
    }
}