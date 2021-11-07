package io.turntabl.models;

public class AccountManager {
    private String managerName;

    public String getManagerName() {
        return managerName;
    }

    public AccountManager(String managerName) {
        this.managerName = managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
