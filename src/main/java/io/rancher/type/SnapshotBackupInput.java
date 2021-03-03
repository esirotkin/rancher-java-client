package io.rancher.type;

import io.rancher.base.AbstractType;

public class SnapshotBackupInput extends AbstractType {
    
    private String backupTargetId;
    
    private String name;
    
    public String getBackupTargetId() {
        return this.backupTargetId;
    }

    public void setBackupTargetId(String backupTargetId) {
      this.backupTargetId = backupTargetId;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
