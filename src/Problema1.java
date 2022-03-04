public class Problema1 {

   private int j;

    public Problema1() {
    }

    public Problema1(int j) {
        this.j = j;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public String imprimirProblema1(int j)
    {
        String res = "";
        for (int i = j; i < 21; i++) {
            if (i % 3 == 0 && i != 15) {
                res = res + "Fizz";
            } else if (i % 5 == 0 && i != 15){
                res = res + "Buzz";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                res = res + "FizzBuzz";
            } else {
                res = res + i;
            }
        }
        return res;
    }
}