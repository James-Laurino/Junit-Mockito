package com.petersEntreprise.JunitMockito.Junit;



import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculateTest
{
    private Calculator calculator;

    @Before
    public void setUp()
    {
        calculator = new Calculator();
    }

    @Test
    public void testAssert()
    {
        // Assert
        Assert.assertNotNull(new Object());
        Assert.assertTrue("10 always equals 10",10 == 10);
        Assert.assertNotEquals(1,6);
    }
    @Test
    public void testAdd()
    {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int res = calculator.add(a,b);

        // Assert
        Assert.assertEquals(30, res);
    }

}
