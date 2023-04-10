package com.tsl.workshopSpring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(Object id) {
        super("Resouce not found. ID : "+ id);
    }
}
