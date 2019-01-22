package delegate;

/**
 * https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service..");
    }
}
