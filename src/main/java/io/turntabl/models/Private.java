package io.turntabl.models;

public class Private extends Client{
    public Private(String name, String clientId, ServiceLevel serviceLevel) {

        super(name, clientId, serviceLevel);
    }

    @Override
    public String getContactName() {
        return this.getName();
    }
}
