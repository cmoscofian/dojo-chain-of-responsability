package com.mercadolibre.dojos.handlers;

import com.mercadolibre.dojos.usecases.UCAccepted;
import com.mercadolibre.dojos.usecases.UCBadGateway;
import com.mercadolibre.dojos.usecases.UCBadRequest;
import com.mercadolibre.dojos.usecases.UCClientTimeout;
import com.mercadolibre.dojos.usecases.UCConflict;
import com.mercadolibre.dojos.usecases.UCInternalError;

public class HttpCodeHandler {
    public String handle(final int error) {
        final Handler baseHandler = new BaseHandler();
        final Handler ucAccepted = new UCAccepted();
        final Handler ucBadGateway = new UCBadGateway();
        final Handler ucBadRequest = new UCBadRequest();
        final Handler ucClientTimeout = new UCClientTimeout();
        final Handler ucConflict = new UCConflict();
        final Handler ucInternalError = new UCInternalError();

        baseHandler.setNext(ucAccepted);
        ucAccepted.setNext(ucBadGateway);
        ucBadGateway.setNext(ucBadRequest);
        ucBadRequest.setNext(ucClientTimeout);
        ucClientTimeout.setNext(ucConflict);
        ucConflict.setNext(ucInternalError);

        return baseHandler.handle(error);
    }
}
