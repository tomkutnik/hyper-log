package hyper.core;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

public class HyperImpl implements Hyper {
    private final String app;

    public HyperImpl(String app) {
        this.app = app;
    }

    @Override
    public void log(String msg) throws JsonProcessingException {
        Log log = new Log();
        log.setApp(this.app);
        log.setMessage(msg);
        log.setDate(LocalDateTime.now());
/*
        LogsController hyperServer = new LogsController();
        hyperServer.createLog(log);
    */}
}
