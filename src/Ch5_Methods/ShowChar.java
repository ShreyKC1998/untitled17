package Ch5_Methods;

public class ShowChar {
    public static void main(String[] args) {

        System.out.println(showChar("New York", 2));
    }

    public static char showChar(String obj, int pos){

       return obj.charAt(pos);
    }

}


