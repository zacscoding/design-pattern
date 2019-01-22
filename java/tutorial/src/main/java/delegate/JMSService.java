package delegate;

/**
 * https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service..");
    }
}
