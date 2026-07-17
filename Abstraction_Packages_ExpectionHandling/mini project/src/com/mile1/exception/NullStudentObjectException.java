package com.mile1.exception;

public class NullStudentObjectException extends Exception {

    @Override
    public String toString() {
        return "Student object is null";
    }
}