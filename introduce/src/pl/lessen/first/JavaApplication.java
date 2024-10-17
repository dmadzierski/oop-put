package pl.lessen.first;



import java.util.stream.IntStream;

class JavaApplication {

    public static void main(String[] args) throws Exception {
        Rectangle r1 = new Rectangle(2,3,1,1);
        System.out.println(r1);
    }
    
    public static void main2(String[] args) {
        System.out.println("Hello World");
        int[] nums = IntStream.range(0, 10).toArray();
        for (int i : nums) {
            printNumber(i);
        }
    }

    static void printNumber(int a) {
        System.out.printf("%.2f\n", (double) a);
    }

}
