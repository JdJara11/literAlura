package com.alura.literAlura.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertirDatos implements IConvertirDatos{
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> classes) {
        try {
            return objectMapper.readValue(json, classes);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
