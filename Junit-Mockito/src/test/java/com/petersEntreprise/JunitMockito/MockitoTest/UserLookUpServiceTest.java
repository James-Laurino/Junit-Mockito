package com.petersEntreprise.JunitMockito.MockitoTest;

import com.petersEntreprise.JunitMockito.Mockito.repository.ClientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserLookUpServiceTest
{
    @Mock
    ClientRepository repository;

    @Test
    public void getRegularUser()
    {

    }

    @Test
    public void getAdminUser()
    {

    }
}
