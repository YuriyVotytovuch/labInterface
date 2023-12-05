public class Triagle implements Interface1{
    @Override
    public double getSquare(double a) {
            return (a*a*Math.sqrt(3))/4;
    }
    public double getSum(double a){
        return a+a+a;
    }
}