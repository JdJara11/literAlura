package com.alura.literAlura.services;

public interface IConvertirDatos {
    <T> T getData(String json, Class<T> classes);
}
