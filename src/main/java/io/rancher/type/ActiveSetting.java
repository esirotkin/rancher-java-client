package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ActiveSetting extends AbstractType {
    
    private Map<String, Object> activeValue;
    
    private String name;
    
    private String value;
    
    public Map<String, Object> getActiveValue() {
        return this.activeValue;
    }

    public void setActiveValue(Map<String, Object> activeValue) {
      this.activeValue = activeValue;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }
    
}
