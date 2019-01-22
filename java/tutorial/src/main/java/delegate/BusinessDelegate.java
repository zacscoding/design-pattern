package delegate;

import javafx.util.Builder;

/**
 * @author zacconding
 * @Date 2019-01-23
 * @GitHub : https://github.com/zacscoding
 */
public class BusinessDelegate {

    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
