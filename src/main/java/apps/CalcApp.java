package apps;

import com.fasterxml.jackson.core.JsonProcessingException;
import hyper.core.Hyper;
import hyper.core.HyperImpl;
import org.springframework.web.bind.annotation.RestController;


public class CalcApp {

    public static void main(String[] args) throws JsonProcessingException {
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
