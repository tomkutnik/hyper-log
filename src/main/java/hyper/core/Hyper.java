package hyper.core;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Hyper {

    void log(String msg) throws JsonProcessingException;
}
