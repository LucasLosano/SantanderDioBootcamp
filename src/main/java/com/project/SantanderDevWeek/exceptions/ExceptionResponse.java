package com.project.SantanderDevWeek.exceptions;

public class ExceptionResponse {

    private String message;

    public ExceptionResponse(String message){
        this.message = message;
    }

    private String getMessage(){
        return message;
    }
}
