package com.mercadolibre.dojos.main;

import com.mercadolibre.dojos.handlers.HttpCodeHandler;

import java.net.HttpURLConnection;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ok. I found: " + new HttpCodeHandler().handle(HttpURLConnection.HTTP_ENTITY_TOO_LARGE));
    }
}
