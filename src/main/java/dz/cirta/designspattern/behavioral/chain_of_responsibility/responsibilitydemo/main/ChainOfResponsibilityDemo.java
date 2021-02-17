package dz.cirta.designspattern.behavioral.chain_of_responsibility.responsibilitydemo.main;

import dz.cirta.designspattern.behavioral.chain_of_responsibility.responsibilitydemo.*;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handlerRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handlerRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handlerRequest(request);
    }
}
