package com.mercadolibre.dojos.usecases;

import com.mercadolibre.dojos.handlers.BaseHandler;
import java.net.HttpURLConnection;

public class UCBadGateway extends BaseHandler {
    @Override
    public String handle(int statusCode) {
        if (statusCode == HttpURLConnection.HTTP_BAD_GATEWAY) {
            return "HttpURLConnection.HTTP_BAD_GATEWAY found.";
        }
        
        return super.handle(statusCode);
    }
}