package com.petersEntreprise.JunitMockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;

@SpringBootTest
class JunitMockitoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testIt()
	{
		Calendar mockCalender = Mockito.mock(Calendar.class);
	}

}
