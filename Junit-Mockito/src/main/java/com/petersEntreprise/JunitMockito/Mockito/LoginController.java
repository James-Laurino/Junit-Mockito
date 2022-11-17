package com.petersEntreprise.JunitMockito.Mockito;

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

