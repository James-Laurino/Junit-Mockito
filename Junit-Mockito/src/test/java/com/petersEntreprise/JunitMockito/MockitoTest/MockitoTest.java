package com.petersEntreprise.JunitMockito.MockitoTest;

import com.petersEntreprise.JunitMockito.Mockito.AuthentificationService;
import com.petersEntreprise.JunitMockito.Mockito.LoginController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;

public class MockitoTest
{
    private LoginController controller; // SUT
    private AuthentificationService service; // MOCK

    @Before
    public void setUp()
    {
        this.service = Mockito.mock(AuthentificationService.class);
        this.controller = new LoginController(this.service);
    }

    @Test
    public void testService_validUsernameAndPassword_logsUser()
    {
        // Arange
        Mockito.when(this.service.authenticate(anyString(),anyString())).thenReturn(true);

        // Act
        String viewPath = this.controller.service("tom", "123");

        // Assert
        Assert.assertNotNull(viewPath);
        Assert.assertEquals("/home", viewPath);
    }
}
