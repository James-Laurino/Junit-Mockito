package com.petersEntreprise.JunitMockito.Mockito.service;

import com.petersEntreprise.JunitMockito.Mockito.model.Client;
import com.petersEntreprise.JunitMockito.Mockito.repository.ClientRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Client> findAllRegularUser()
    {
        List<Client> clients = (clientRepository.findAllClient().stream().filter(client ->
                client.getLive() == true && client.getClientType() == Client.ClientType.REGULAR_USER).collect(Collectors.toList()));

        return clients;
    }

    public List<Client> findAllAdminUser()
    {
        List<Client> clients = (clientRepository.findAllClient().stream().filter(client ->
                client.getLive() == true && client.getClientType() == Client.ClientType.ADMIN_USER).collect(Collectors.toList()));

        return clients;
    }
}
