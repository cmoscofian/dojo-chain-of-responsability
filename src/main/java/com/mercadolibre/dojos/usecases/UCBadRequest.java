package com.mercadolibre.dojos.usecases;

import com.mercadolibre.dojos.handlers.BaseHandler;
import java.net.HttpURLConnection;

public class UCBadRequest extends BaseHandler {
    @Override
    public String handle(int statusCode) {
        if (statusCode == HttpURLConnection.HTTP_BAD_REQUEST) {
            return "HttpURLConnection.HTTP_BAD_REQUEST found.";
        }
        
        return super.handle(statusCode);
    }
}