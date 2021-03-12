public class MathFuntions {

    public static int modulePower(int number, int divisor, int exponent){
        if(exponent == 0){
            return 1;
        }
        if (exponent < 0){
            return 0;
        }
        int d = (number%divisor);
        int producto = 1;
        while(exponent > 0){
            producto *= d;
            exponent--;
        }
        return producto;
    }

}
