package dz.cirta.designspattern.behavioral.chain_of_responsibility.responsibilitydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Director extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(Director.class);

    @Override
    public void handlerRequest(Request request) {
        if(RequestType.CONFERENCE.equals(request.getRequestType())) {
            LOGGER.info("Director can approve conference ");
        } else {
            successor.handlerRequest(request);
        }
    }
}
