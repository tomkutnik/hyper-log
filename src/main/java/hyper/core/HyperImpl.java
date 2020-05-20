package hyper.core;

import java.time.LocalDateTime;

public class HyperImpl implements Hyper {
    private final String app;

    public HyperImpl(String app) {
        this.app = app;
    }

    @Override
    public void log(String msg) {
        Log log = new Log();
        log.setApp(this.app);
        log.setMessage(msg);
        log.setDate(LocalDateTime.now());

        hyperServer.createLog(log);
    }
}
