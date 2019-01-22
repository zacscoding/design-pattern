package delegate;

/**
 * https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
 */
public class BusinessDelegateDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
//        output ::
//        Processing task by invoking EJB Service..
//        Processing task by invoking JMS Service..
    }
}
