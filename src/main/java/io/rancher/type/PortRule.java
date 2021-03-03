package io.rancher.type;

import io.rancher.base.AbstractType;

public class PortRule extends AbstractType {
    
    private String backendName;
    
    private String environment;
    
    private String hostname;
    
    private String path;
    
    private Integer priority;
    
    private String protocol;
    
    private String region;
    
    private String selector;
    
    private String serviceId;
    
    private Integer sourcePort;
    
    private Integer targetPort;
    
    private Integer weight;
    
    public String getBackendName() {
        return this.backendName;
    }

    public void setBackendName(String backendName) {
      this.backendName = backendName;
    }
    
    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String environment) {
      this.environment = environment;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
      this.priority = priority;
    }
    
    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getSelector() {
        return this.selector;
    }

    public void setSelector(String selector) {
      this.selector = selector;
    }
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
    public Integer getSourcePort() {
        return this.sourcePort;
    }

    public void setSourcePort(Integer sourcePort) {
      this.sourcePort = sourcePort;
    }
    
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public void setTargetPort(Integer targetPort) {
      this.targetPort = targetPort;
    }
    
    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
      this.weight = weight;
    }
    
}
