package com.project.SantanderDevWeek.exceptions;

import com.project.SantanderDevWeek.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
