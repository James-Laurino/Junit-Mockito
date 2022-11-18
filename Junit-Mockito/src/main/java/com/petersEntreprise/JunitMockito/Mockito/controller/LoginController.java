package com.petersEntreprise.JunitMockito.Mockito.controller;

import com.petersEntreprise.JunitMockito.Mockito.service.AuthentificationService;

public class LoginController
{
    private AuthentificationService authentificationService;

    public LoginController(AuthentificationService authentificationService)
    {
        this.authentificationService = authentificationService;
    }

    public String service(String username, String password)
    {
        if(authentificationService.authenticate(username, password))
        {
            return "/home";
        }
        else
        {
            return "/login";
        }

    }
}

