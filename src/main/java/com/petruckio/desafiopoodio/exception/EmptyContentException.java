package com.petruckio.desafiopoodio.exception;

public class EmptyContentException extends RuntimeException {
    public EmptyContentException(String message) {
        super(message);
    }

    public EmptyContentException(String message, Throwable cause) {
        super(message, cause);
    }
}
