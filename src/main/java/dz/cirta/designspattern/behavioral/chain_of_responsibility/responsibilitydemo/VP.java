package dz.cirta.designspattern.behavioral.chain_of_responsibility.responsibilitydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VP extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(VP.class);

    @Override
    public void handlerRequest(Request request) {
        if (RequestType.PURCHASE.equals(request.getRequestType())) {
            if (request.getAmount() < 1500) {
                LOGGER.info("VPs can approve purchase below 1500");
            } else {
                successor.handlerRequest(request);
            }
        }
    }
}