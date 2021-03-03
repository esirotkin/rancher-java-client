package io.rancher.type;

import io.rancher.base.AbstractType;

public class GenericConfig extends AbstractType {
    
    private String enginePort;
    
    private String ipAddress;
    
    private String sshKey;
    
    private String sshPort;
    
    private String sshUser;
    
    public String getEnginePort() {
        return this.enginePort;
    }

    public void setEnginePort(String enginePort) {
      this.enginePort = enginePort;
    }
    
    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
    }
    
    public String getSshKey() {
        return this.sshKey;
    }

    public void setSshKey(String sshKey) {
      this.sshKey = sshKey;
    }
    
    public String getSshPort() {
        return this.sshPort;
    }

    public void setSshPort(String sshPort) {
      this.sshPort = sshPort;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
}
