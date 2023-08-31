package ru.podgoretskaya.guide.validate;

import java.util.List;

public class DTOinvalidExeption extends RuntimeException{
    private List<String> invalidField;
    public DTOinvalidExeption( List<String> invalidField) {
        this.invalidField=invalidField;
    }

    @Override
    public String toString() {
        return "DTOinvalidExeption{" +
                "invalidField=" + invalidField +
                '}';
    }
}
