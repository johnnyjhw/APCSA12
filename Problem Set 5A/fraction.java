
public class fraction {
    
    private int numerator;
    private int denominator;
    
    public fraction(){
        numerator = 1;
        denominator = 1;
    }
    
    public fraction(int num, int denom){
        setNum(num);
        setDem(denom);
    }
    
    public fraction(String Fraction){
        if(Fraction.substring(Fraction.indexOf("/"), Fraction.length()).equals("0")){
            System.out.println("Error. Denominator cannot be zero");
        } else {
        numerator = Integer.parseInt(Fraction.substring(0, Fraction.indexOf("/")));
        denominator = Integer.parseInt(Fraction.substring(Fraction.indexOf("/")+1, Fraction.length()));
    }
    }
    
    public fraction(fraction f){
        numerator = f.numerator;
        denominator = f.denominator;
    }
    
    public int getNum(){
        return numerator;
    }
    
    public int getDem(){
        return denominator;
    }
    
    public String toString(){
        return numerator + "/" + denominator;
    }
    
    public double toDouble(){
        return (double) numerator/denominator;
    }
    
      public void setNum(int n ){
        numerator = n;
    }
    
    public void setDem(int d){
        if(d == 0){
            System.out.println("Error. Choose a number other than zero");
        } else {
             denominator = d;
        }
    } 
    
    public void reduce(int a, int b){
        int factor = GCF(Math.abs(numerator), Math.abs(denominator));
        numerator/= factor;
        denominator /= factor;
    
    }
    
    private int GCF(int a , int b){
        if (a== b) return a;
        if(a>b) return GCF(a-b, b);
        else return GCF ( a, b-a);
    }
    
       public static fraction add(fraction f1, fraction f2) {
        int num = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int den = f1.denominator * f2.denominator;
        return new fraction(num, den);
    }


    public static fraction subtract(fraction f1, fraction f2) {
        int num = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
        int den = f1.denominator * f2.denominator;
        return new fraction(num, den);
    }

    public static fraction multiply(fraction f1, fraction f2) {
        int num = f1.numerator * f2.numerator;
        int den = f1.denominator * f2.denominator;
        return new fraction(num, den);
    }
    
    public static fraction division(fraction f1, fraction f2){
         if (f2.numerator == 0) {
            System.out.println("numerator for fraction 2 cannot be zero");
        }
        int num = f1.numerator * f2.denominator;
        int den = f1.denominator * f2.numerator;
        return new fraction(num, den);
    }

}  