public class pruebas {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0 && i != 15) {
                System.out.print("Fizz");
            } else if (i % 5 == 0 && i != 15){
                System.out.print("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            } else {
                System.out.print(i);
            }
        }
    }
}
