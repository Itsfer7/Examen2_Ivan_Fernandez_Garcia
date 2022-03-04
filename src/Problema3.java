public class Problema3 {

    private int j;
    private int k;

    public Problema3() {
    }

    public Problema3(int j, int k) {
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

    public String imprimirProblema3(int j, int k)
    {
        String res = "";
        for (int i = j; i < k; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res = res + "FizzBuzz";
            } else if (i % 3 == 0 && i % 7 == 0) {
                res = res + "FizzFoo";
            } else if (i % 3 == 0 && i % 11 == 0) {
                res = res + "FizzBoo";
            } else if (i % 5 == 0 && i % 7 == 0) {
                res = res + "BuzzFoo";
            } else if (i % 5 == 0 && i % 11 == 0) {
                res = res + "BuzzBoo";
            } else if (i % 7 == 0 && i % 11 == 0) {
                res = res + "FooBoo";
            }

            else if (i % 3 == 0) {
                res = res + "Fizz";
            } else if (i % 5 == 0){
                res = res + "Buzz";
            } else if (i % 7 == 0){
                res = res + "Foo";
            } else if (i % 11 == 0){
                res = res + "Boo";
            } else {
                res = res + i;
            }
        }
        return res;
    }
    public String imprimirProblema3_actual(int j, int k)
    {
        String res = "";
        for (int i = j; i < k; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res = res + "FizzBuzz";
            } else if (i % 3 == 0 && i % 7 == 0) {
                res = res + "FizzFoo";
            } else if (i % 3 == 0 && i % 11 == 0) {
                res = res + "FizzBoo";
            } else if (i % 5 == 0 && i % 7 == 0) {
                res = res + "BuzzFoo";
            } else if (i % 5 == 0 && i % 11 == 0) {
                res = res + "BuzzBoo";
            } else if (i % 7 == 0 && i % 11 == 0) {
                res = res + "FooBoo";
            }

            else if (i % 3 == 0) {
                res = res + "Fizz";
            } else if (i % 5 == 0){
                res = res + "Buzz";
            } else if (i % 7 == 0){
                res = res + "Foo";
            } else if (i % 11 == 0){
                res = res + "Boo";
            }else {
                res = res + i;
            }
        }
        System.out.print(res);
        return res;
    }
}