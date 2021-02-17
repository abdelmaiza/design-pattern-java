package dz.cirta.designspattern.behavioral.chain_of_responsibility.responsibilitydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CEO extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CEO.class);


    @Override
    public void handlerRequest(Request request) {
        LOGGER.info("CEO's can approve anything they want");
    }
}
