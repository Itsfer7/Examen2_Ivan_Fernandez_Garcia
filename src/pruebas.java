public class pruebas {




    public static void main(String[] args) {
        String res = "";
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                res = res + "Fizz";
            } else if (i % 5 == 0){
                res = res + "Buzz";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                res = res + "FizzBuzz";
            } else {
                res = res + i;
            }
        }
        System.out.println(res);
    }
}
