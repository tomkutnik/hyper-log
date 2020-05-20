package apps;

import hyper.core.Hyper;
import hyper.core.HyperImpl;

public class CalcApp {

    public static void main(String[] args) {
        Hyper hyper = new HyperImpl("CalcApp");

        System.out.println("I am a Calc App");
        // log to hyper that app starts
        hyper.log("starting up");

        int a = 10;
        int b = 20;

        System.out.println(add(a, b));
    }


    static int add(int a, int b) {
        return a + b;
    }
}
