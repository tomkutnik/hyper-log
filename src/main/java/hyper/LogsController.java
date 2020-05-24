package hyper;

import hyper.core.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LogsController {

    @RequestMapping(value = "/logs", method = RequestMethod.GET)
    List<String> allLogs() {
        ArrayList<String> logs = new ArrayList<>();
        logs.add(Log.singleLog());
        return logs;
    }


/*
    @RequestMapping(value = "/logs", method = RequestMethod.POST)
    public void createLog(Log log) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(log);

    }*/
}
