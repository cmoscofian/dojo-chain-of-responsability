package com.mercadolibre.dojos.usecases;

import com.mercadolibre.dojos.handlers.BaseHandler;
import java.net.HttpURLConnection;

public class UCAccepted extends BaseHandler {
    @Override
    public String handle(int statusCode) {
        if (statusCode == HttpURLConnection.HTTP_ACCEPTED) {
            return "HttpURLConnection.HTTP_ACCEPTED found.";
        }
        
        return super.handle(statusCode);
    }
}