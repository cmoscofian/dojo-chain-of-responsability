package com.mercadolibre.dojos.handlers;

import com.mercadolibre.dojos.usecases.Accepted;
import com.mercadolibre.dojos.usecases.BadGateway;
import com.mercadolibre.dojos.usecases.BadRequest;
import com.mercadolibre.dojos.usecases.ClientTimeout;
import com.mercadolibre.dojos.usecases.Conflict;
import com.mercadolibre.dojos.usecases.InternalError;

public class HttpCodeHandler {
    public String handle(final int error) {
        final Handler baseHandler = new BaseHandler();
        final Handler accepted = new Accepted();
        final Handler badGateway = new BadGateway();
        final Handler badRequest = new BadRequest();
        final Handler clientTimeout = new ClientTimeout();
        final Handler conflict = new Conflict();
        final Handler internalError = new InternalError();

        baseHandler.setNext(accepted);
        accepted.setNext(badGateway);
        badGateway.setNext(badRequest);
        badRequest.setNext(clientTimeout);
        clientTimeout.setNext(conflict);
        conflict.setNext(internalError);

        return baseHandler.handle(error);
    }
}
