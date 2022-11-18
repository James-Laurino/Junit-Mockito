package com.petersEntreprise.JunitMockito.Mockito.repository;

import com.petersEntreprise.JunitMockito.Mockito.model.Client;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ClientRepository {
    Map<String, Client> db = new HashMap<String, Client>();

    public Client findByUsername(String username) {
        populateMap();
        Client client = db.get(username);
        return client;
    }

    public List<Client> findAllClient()
    {
        List<Client> clients = new LinkedList<Client>(db.values());
        return clients;
    }

    private void populateMap()
    {
        db.put("Thomas", new Client("Thomas","1234",true,Client.ClientType.REGULAR_USER));
        db.put("James", new Client("James","1234",true,Client.ClientType.REGULAR_USER));
        db.put("Pipo", new Client("Pipo","1234",true,Client.ClientType.REGULAR_USER));
        db.put("Lilo", new Client("Lilo","1234",true,Client.ClientType.ADMIN_USER));

    }
}
