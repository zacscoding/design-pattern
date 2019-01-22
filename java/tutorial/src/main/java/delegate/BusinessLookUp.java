package delegate;

/**
 * https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else if (serviceType.equalsIgnoreCase("jms")) {
            return new JMSService();
        } else {
            throw new IllegalArgumentException(serviceType + "is unknown type");
        }
    }
}
