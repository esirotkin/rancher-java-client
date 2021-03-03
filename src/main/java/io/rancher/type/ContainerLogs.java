package io.rancher.type;

import io.rancher.base.AbstractType;

public class ContainerLogs extends AbstractType {
    
    private Boolean follow;
    
    private Integer lines;
    
    private String since;
    
    private Boolean timestamps;
    
    public Boolean getFollow() {
        return this.follow;
    }

    public void setFollow(Boolean follow) {
      this.follow = follow;
    }
    
    public Integer getLines() {
        return this.lines;
    }

    public void setLines(Integer lines) {
      this.lines = lines;
    }
    
    public String getSince() {
        return this.since;
    }

    public void setSince(String since) {
      this.since = since;
    }
    
    public Boolean getTimestamps() {
        return this.timestamps;
    }

    public void setTimestamps(Boolean timestamps) {
      this.timestamps = timestamps;
    }
    
}
