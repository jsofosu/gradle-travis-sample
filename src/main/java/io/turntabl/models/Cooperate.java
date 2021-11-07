package io.turntabl.models;

public class Cooperate extends Client{

  private AccountManager accountManager;

    public Cooperate(String name, String clientId, AccountManager accountManager, ServiceLevel serviceLevel) {
        super(name, clientId, serviceLevel);
        this.accountManager = accountManager;
    }



    @Override
    public String getContactName() {
        return accountManager.getManagerName();
    }
}
