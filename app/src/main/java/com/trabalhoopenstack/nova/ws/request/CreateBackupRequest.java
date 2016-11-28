package com.trabalhoopenstack.nova.ws.request;

public class CreateBackupRequest {
  Backup createBackup;

  public CreateBackupRequest() {
  }

  public Backup getCreateBackup() {
    return createBackup;
  }

  public void setCreateBackup(Backup createBackup) {
    this.createBackup = createBackup;
  }

  public class Backup {
    String name;
    String backupType;
    int rotation;

    public Backup() {
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getBackupType() {
      return backupType;
    }

    public void setBackupType(String backupType) {
      this.backupType = backupType;
    }

    public int getRotation() {
      return rotation;
    }

    public void setRotation(int rotation) {
      this.rotation = rotation;
    }
  }
}
