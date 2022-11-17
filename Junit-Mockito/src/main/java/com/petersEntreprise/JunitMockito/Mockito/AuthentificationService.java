package com.petersEntreprise.JunitMockito.Mockito;

import org.apache.catalina.User;

public class AuthentificationService
{
    private ClientRepository clientRepository;

    public AuthentificationService(ClientRepository repository)
    {
        this.clientRepository = repository;
    }

    public Boolean authenticate(String username, String password)
    {
        Client client = clientRepository.findByUsername(username);
        return client.getPassword().equals(password);
    }
}
