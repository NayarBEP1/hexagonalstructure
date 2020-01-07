package com.hirex.domain.model.entity;

import com.hirex.domain.exceptions.ExceptionGeneral;

public final class DataValidator {

    private DataValidator() {}

    public static void isMandatory(String value, String exceptionMessage) {
        if(value == null) {
            throw new ExceptionGeneral(exceptionMessage);
        }
    }

    public static void isMandatory(int value, String exceptionMessage) {
        if(value == 0) {
            throw new ExceptionGeneral(exceptionMessage);
        }
    }

    public static void valueRange(int value, int minValue, int maxValue, String exceptionMessage) {
        if(value > maxValue || value < minValue){
            throw new ExceptionGeneral(exceptionMessage);
        }
    }

    public static void valueRange(double value, int minValue, int maxValue, String exceptionMessage) {
        if(value > maxValue || value < minValue){
            throw new ExceptionGeneral(exceptionMessage);
        }
    }
}
