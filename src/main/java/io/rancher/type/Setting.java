package io.rancher.type;

import io.rancher.base.AbstractType;

public class Setting extends AbstractType {
    
    private String activeValue;
    
    private String name;
    
    private String value;
    
    public String getActiveValue() {
        return this.activeValue;
    }

    public void setActiveValue(String activeValue) {
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
