public class Problema2 {

    private int j;
    private int k;

    public Problema2() {
    }

    public Problema2(int j, int k) {
        this.j = j;
        this.k = k;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public String imprimirProblema2(int j, int k)
    {
        String res = "";
        for (int i = j; i < k; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res = res + "FizzBuzz";
            } else if (i % 3 == 0) {
                res = res + "Fizz";
            } else if (i % 5 == 0){
                res = res + "Buzz";
            } else {
                res = res + i;
            }
        }
        return res;
    }
    public String imprimirProblema2_actual(int j, int k)
    {
        String res = "";
        for (int i = j; i < k; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res = res + "FizzBuzz";
            } else if (i % 3 == 0) {
                res = res + "Fizz";
            } else if (i % 5 == 0){
                res = res + "Buzz";
            } else {
                res = res + i;
            }
        }
        return res;
    }
}