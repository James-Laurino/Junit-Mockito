package com.petersEntreprise.JunitMockito.Mockito.service;

import com.petersEntreprise.JunitMockito.Mockito.model.Client;
import com.petersEntreprise.JunitMockito.Mockito.repository.ClientRepository;


import java.util.List;
import java.util.stream.Collectors;

public class UserLookUpService
{
    private ClientRepository clientRepository;

    public UserLookUpService(ClientRepository repository)
    {
        this.clientRepository = repository;
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
