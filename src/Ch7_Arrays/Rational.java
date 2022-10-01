package Ch7_Arrays;

public class Rational {
    private int num, denom;

    public Rational(double d){
        String s = String.valueOf(d);

        int digitsDec = s.length() -1 - s.indexOf('.');
        int denom = 1;
        for (int i = 0; i < digitsDec; i++) {
            d *= 10;
            denom *= 10;

        }

        int num = (int) Math.round(d);
        this.num = num;
        this.denom = denom;

    }
    public Rational(int num, int denom){
        this.num = num;
        this.denom = denom;

    }

    public String toString(){
        return String.valueOf(num) + "/" + String.valueOf(denom);
    }
    static private String convertDecimalToFraction(double x){
        if (x < 0){
            return "-" + convertDecimalToFraction(-x);
        }
        double tolerance = 1.0E-6;
        double h1=1; double h2=0;
        double k1=0; double k2=1;
        double b = x;
        do {
            double a = Math.floor(b);
            double aux = h1; h1 = a*h1+h2; h2 = aux;
            aux = k1; k1 = a*k1+k2; k2 = aux;
            b = 1/(b-a);
        } while (Math.abs(x-h1/k1) > x*tolerance);

        return h1+"/"+k1;
    }

    public static void main(String[] args) {
        System.out.println(convertDecimalToFraction(6.66667));
    }
}
