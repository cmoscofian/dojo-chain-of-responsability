package com.mercadolibre.dojos.handlers;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;

public class HttpCodeHandlerTest {
    
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {

        //formato: INPUT, EXPECTED
        return new Object[][]{
                {HttpURLConnection.HTTP_ACCEPTED, "HttpURLConnection.HTTP_ACCEPTED found."},
                {HttpURLConnection.HTTP_INTERNAL_ERROR, "HttpURLConnection.HTTP_INTERNAL_ERROR found."},
                {HttpURLConnection.HTTP_BAD_GATEWAY, "HttpURLConnection.HTTP_BAD_GATEWAY found."},
                {HttpURLConnection.HTTP_BAD_REQUEST, "HttpURLConnection.HTTP_BAD_REQUEST found."},
                {HttpURLConnection.HTTP_CLIENT_TIMEOUT, "HttpURLConnection.HTTP_CLIENT_TIMEOUT found."},
                {HttpURLConnection.HTTP_CONFLICT, "HttpURLConnection.HTTP_CONFLICT found."},
                {666, "UNKNOWN ERROR 666"}
        };
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(int data, String expected) {

        System.out.println("Input Data is: " + data);
        String out = new HttpCodeHandler().handle(data);

        Assert.assertEquals(expected,out);
    }
}