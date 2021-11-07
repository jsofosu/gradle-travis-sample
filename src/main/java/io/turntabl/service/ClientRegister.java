package io.turntabl.service;

import io.turntabl.models.Client;
import java.util.*;
import java.util.stream.Collectors;

public class ClientRegister {
    private List <Client> clients = new ArrayList<>();

    public ClientRegister(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<String> geContactNameOfGoldClients(){
        return clients.stream()
                .filter(client -> client.getServiceLevel().equals(Client.ServiceLevel.Gold))
                .map(Client::getContactName)
                .collect(Collectors.toList());
    }


    public Optional<String> getClientNameById(String clientId){
        return clients.stream()
                .filter(client -> client.getClientId().equals(clientId))
                .map(Client::getName)
                .findAny();
    }



//    public Map<Client.ServiceLevel, Integer> numberOfClientsAtServiceLevel(){
//        return
//    }
}
