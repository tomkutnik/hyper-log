package hyper;

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
        logs.add("one");
        logs.add("two");
        return logs;
    }

    @RequestMapping(value = "/logs", method = RequestMethod.POST)
    void createLog(Log log) {
        // store in a file
    }
}
