package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class Machine extends AbstractType {
    
    private String accountId;
    
    private String authCertificateAuthority;
    
    private String authKey;
    
    private String created;
    
    private String description;
    
    private String dockerVersion;
    
    private String driver;
    
    private Map<String, Object> engineEnv;
    
    private List<String> engineInsecureRegistry;
    
    private String engineInstallUrl;
    
    private Map<String, Object> engineLabel;
    
    private Map<String, Object> engineOpt;
    
    private List<String> engineRegistryMirror;
    
    private String engineStorageDriver;
    
    private String externalId;
    
    private GenericConfig genericConfig;
    
    private String hostTemplateId;
    
    private String kind;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String removed;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uuid;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public String getAuthCertificateAuthority() {
        return this.authCertificateAuthority;
    }

    public void setAuthCertificateAuthority(String authCertificateAuthority) {
      this.authCertificateAuthority = authCertificateAuthority;
    }
    
    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthKey(String authKey) {
      this.authKey = authKey;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
      this.dockerVersion = dockerVersion;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public Map<String, Object> getEngineEnv() {
        return this.engineEnv;
    }

    public void setEngineEnv(Map<String, Object> engineEnv) {
      this.engineEnv = engineEnv;
    }
    
    public List<String> getEngineInsecureRegistry() {
        return this.engineInsecureRegistry;
    }

    public void setEngineInsecureRegistry(List<String> engineInsecureRegistry) {
      this.engineInsecureRegistry = engineInsecureRegistry;
    }
    
    public String getEngineInstallUrl() {
        return this.engineInstallUrl;
    }

    public void setEngineInstallUrl(String engineInstallUrl) {
      this.engineInstallUrl = engineInstallUrl;
    }
    
    public Map<String, Object> getEngineLabel() {
        return this.engineLabel;
    }

    public void setEngineLabel(Map<String, Object> engineLabel) {
      this.engineLabel = engineLabel;
    }
    
    public Map<String, Object> getEngineOpt() {
        return this.engineOpt;
    }

    public void setEngineOpt(Map<String, Object> engineOpt) {
      this.engineOpt = engineOpt;
    }
    
    public List<String> getEngineRegistryMirror() {
        return this.engineRegistryMirror;
    }

    public void setEngineRegistryMirror(List<String> engineRegistryMirror) {
      this.engineRegistryMirror = engineRegistryMirror;
    }
    
    public String getEngineStorageDriver() {
        return this.engineStorageDriver;
    }

    public void setEngineStorageDriver(String engineStorageDriver) {
      this.engineStorageDriver = engineStorageDriver;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public GenericConfig getGenericConfig() {
        return this.genericConfig;
    }

    public void setGenericConfig(GenericConfig genericConfig) {
      this.genericConfig = genericConfig;
    }
    
    public String getHostTemplateId() {
        return this.hostTemplateId;
    }

    public void setHostTemplateId(String hostTemplateId) {
      this.hostTemplateId = hostTemplateId;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Integer getTransitioningProgress() {
        return this.transitioningProgress;
    }

    public void setTransitioningProgress(Integer transitioningProgress) {
      this.transitioningProgress = transitioningProgress;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
