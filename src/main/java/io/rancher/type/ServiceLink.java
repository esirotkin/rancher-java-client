package io.rancher.type;

import io.rancher.base.AbstractType;

public class ServiceLink extends AbstractType {
    
    private String name;
    
    private String service;
    
    private String serviceId;
    
    private String uuid;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getService() {
        return this.service;
    }

    public void setService(String service) {
      this.service = service;
    }
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
