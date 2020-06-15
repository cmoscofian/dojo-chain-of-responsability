package com.mercadolibre.dojos.handlers;

public class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public String handle(int statusCode) {
        String result = String.format("UNKNOWN ERROR %s", statusCode);
        if (next != null) {
            result = next.handle(statusCode);
        }

        return result;
    }
}