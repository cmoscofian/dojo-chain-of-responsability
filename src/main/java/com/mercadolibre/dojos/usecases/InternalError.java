package com.mercadolibre.dojos.usecases;

import com.mercadolibre.dojos.handlers.BaseHandler;
import java.net.HttpURLConnection;

public class InternalError extends BaseHandler {
    @Override
    public String handle(int statusCode) {
        if (statusCode == HttpURLConnection.HTTP_INTERNAL_ERROR) {
            return "HttpURLConnection.HTTP_INTERNAL_ERROR found.";
        }
        
        return super.handle(statusCode);
    }
}