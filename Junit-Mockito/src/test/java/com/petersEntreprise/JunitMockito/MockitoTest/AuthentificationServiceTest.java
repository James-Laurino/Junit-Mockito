package com.petersEntreprise.JunitMockito.MockitoTest;

import com.petersEntreprise.JunitMockito.Mockito.AuthentificationService;
import com.petersEntreprise.JunitMockito.Mockito.ClientRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AuthentificationServiceTest
{
    private AuthentificationService service; // SUT
    private ClientRepository clientRepository; // mock

    @Before
    public  void setUp()
    {
        this.clientRepository = Mockito.mock(ClientRepository.class);
        this.service = new AuthentificationService(this.clientRepository);
    }

    @Test
    public void testAuthenticate()
    {
        // ARRANGE
        Mockito.when(this.clientRepository.findByUsername(Mockito.anyString())).thenThrow(new IllegalArgumentException());

        // ACT
        this.service.authenticate("harry", "1234");

        // ASSERT


    }
}
