package io.turntabl.service;

import io.turntabl.models.AccountManager;
import io.turntabl.models.Client;
import io.turntabl.models.Cooperate;
import io.turntabl.models.Private;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {
    private List<Client> clients = new ArrayList<>();
    private ClientRegister clientRegister = new ClientRegister(clients);

    @BeforeEach
    void setUp() {

        //Coorporate Clients
        clients.add(new Cooperate("Lynx", "C1", new AccountManager("Judith Serwaa"), Client.ServiceLevel.Gold));
        clients.add(new  Cooperate("Laser", "C2", new AccountManager("Louis Kwaku"), Client.ServiceLevel.Platinum));
        clients.add(new Cooperate("Kenwood", "C3", new AccountManager("Micaiah Adzo"), Client.ServiceLevel.Premium));

        //Private clients
        clients.add(new Private("Mercy Lee", "P1", Client.ServiceLevel.Premium));
        clients.add(new Private("Nick Jonas", "P2", Client.ServiceLevel.Gold));
        clients.add(new Private("Tyler Moore", "P3", Client.ServiceLevel.Platinum));
        clients.add(new Private("Prince Ofosu", "P4", Client.ServiceLevel.Gold));


    }

    @AfterEach
    void tearDown() {
        clients = null;
    }

    @Test
    void testGetClients() {
        assertFalse(clients.isEmpty());
        System.out.println(clients.toString());
    }


    @Test
    void testGetContactNameOfGoldClients() {
        List<String> goldClients = Arrays.asList("Judith Serwaa", "Nick Jonas", "Prince Ofosu");
        assertLinesMatch(goldClients,
               clientRegister.geContactNameOfGoldClients()) ;
        System.out.println(clientRegister.geContactNameOfGoldClients());

    }

    @Test
    void TestGetClientNameById() {
        assertEquals(Optional.of("Kenwood"), clientRegister.getClientNameById("C3"));
        System.out.println(clientRegister.getClientNameById("C3"));
    }
}