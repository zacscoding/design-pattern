package delegate;

/**
 * https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
 */
public class Client {

    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.doTask();
    }
}
