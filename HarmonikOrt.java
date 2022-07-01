public class HarmonikOrt {
    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5};
        double harmoniksum = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmoniksum += (1 / numbers[i]);
        }
        System.out.println(harmoniksum / numbers.length);
    }
}