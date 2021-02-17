package dz.cirta.designspattern.behavioral.chain_of_responsibility.responsibilitydemo;

public abstract class AbstractHandler {
    protected AbstractHandler successor;

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    public abstract void handlerRequest(Request request);
}
