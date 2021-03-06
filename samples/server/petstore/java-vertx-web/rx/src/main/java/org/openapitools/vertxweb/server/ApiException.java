package org.openapitools.vertxweb.server;

public class ApiException extends RuntimeException {
    private final String message;
    private Integer statusCode;

    public ApiException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public ApiException setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public Integer getStatusCode() {
        return statusCode;
    }
}
