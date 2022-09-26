package Ch5_Methods;

public class PaintJobEstimator {
    public static void main(String[] args) {
        System.out.println(gallons(230));
        System.out.println(hours(230));

    }

    public static int gallons(int sqrFeet){
       int gal = 115;
       return sqrFeet/gal;

    }
    public static int hours(int sqrHrs){

        int hours = 8;
        if(sqrHrs >= 115)
            return 8;
        else
            return 0;

    }
}
