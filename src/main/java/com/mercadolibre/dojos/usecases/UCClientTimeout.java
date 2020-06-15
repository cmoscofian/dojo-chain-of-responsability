package com.mercadolibre.dojos.usecases;

import com.mercadolibre.dojos.handlers.BaseHandler;
import java.net.HttpURLConnection;

public class UCClientTimeout extends BaseHandler {
    @Override
    public String handle(int statusCode) {
        if (statusCode == HttpURLConnection.HTTP_CLIENT_TIMEOUT) {
            return "HttpURLConnection.HTTP_CLIENT_TIMEOUT found.";
        }
        
        return super.handle(statusCode);
    }
}