package com.mercadolibre.dojos.handlers;

public interface Handler {
    public void setNext(Handler handler);
    public String handle(int statusCode);
}