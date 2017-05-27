/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        double powResult = Math.pow(2, 3);
        System.out.println("pow :" + powResult);

        double sqrtResult = Math.sqrt(16);
        System.out.println("sqrt : " + sqrtResult);

        float absResult = Math.abs(-4.2f);
        System.out.println("abs : " + absResult);

        double floorResult = Math.floor(3.5);
        System.out.println("floor : " +floorResult);

        double ceilResult = Math.ceil(3.4);
        System.out.println("ceil : " + ceilResult);

        double roundResult = Math.round(3.1);
        System.out.println("round : " + roundResult);


        double randomNumber = Math.random();
        System.out.println("random number : " + randomNumber);
    }

}
