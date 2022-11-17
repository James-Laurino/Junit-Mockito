package com.petersEntreprise.JunitMockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class ClientRepository
{
    Map<String,String> db = new HashMap<String,String>();

    public Client findByUsername(String username)
    {
        populateMap();
        String password = db.get(username);
        Client client = new Client(username,password);
        return client;
    }

    private void populateMap()
    {
        db.put("Thomas", "1234");
        db.put("James", "12345");
        db.put("Admin", "Amdin");
    }
}
