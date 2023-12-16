package com.lucadani.trafficmonitorization.exception;

public class DuplicatesNotAllowedException extends RuntimeException {
    public DuplicatesNotAllowedException(String message) {
        super(message);
    }
}
