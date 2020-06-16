package com.mercadolibre.dojos.usecases;

import com.mercadolibre.dojos.handlers.BaseHandler;
import java.net.HttpURLConnection;

public class Conflict extends BaseHandler {
    @Override
    public String handle(int statusCode) {
        if (statusCode == HttpURLConnection.HTTP_CONFLICT) {
            return "HttpURLConnection.HTTP_CONFLICT found.";
        }
        
        return super.handle(statusCode);
    }
}