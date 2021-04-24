public class AreaCalculator {
    public static double area(double radius){
        double result = 0.0;

        if(radius < 0){
            result = -1.0;
        }else{
            result = radius * radius * Math.PI;
        }
        return result;
    }

    public static double area(double x, double y){
        double result = 0.0;

        if(x < 0 || y < 0 || (x < 0 && y < 0)){
            result = -1.0;
        }else{
            result = x * y;
        }
        return result;
    }
}
