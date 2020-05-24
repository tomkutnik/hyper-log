package hyper.core;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Log {
    public static String app;
    public static String msg;
    public static LocalDateTime now;


    public void setApp(String app) {
        Log.app = app;
    }

    public void setMessage(String msg) {
        Log.msg = msg;
    }

    public void setDate(LocalDateTime now) {
        Log.now = now;
    }

    //Just to see if any of var is changing when compile
    public static String singleLog (){
        return "App " + app + ": " + now + "- Says: " + msg;
    }



}

