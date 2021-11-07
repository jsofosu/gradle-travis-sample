package io.turntabl.models;

public abstract class Client {
    private String name;
    private String clientId;
    private ServiceLevel serviceLevel;
    public enum ServiceLevel{
        Gold, Platinum, Premium
    }

    public Client(String name, String clientId, ServiceLevel serviceLevel) {
        this.name = name;
        this.clientId = clientId;
        this.serviceLevel = serviceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientId() {
        return clientId;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public abstract String getContactName();

    @Override
    public String toString() {
        return "Client{" +'\n' +
                " name ='" + name + '\'' + '\n'+
                " clientId ='" + clientId + '\'' +'\n'+
                " serviceLevel =" + serviceLevel +'\n'+
                '}'+'\n';
    }
}
