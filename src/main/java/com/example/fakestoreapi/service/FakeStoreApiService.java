package com.example.fakestoreapi.service;

import java.io.IOException;

import com.example.fakestoreapi.controller.FakeStoreApi;

public interface FakeStoreApiService {
    FakeStoreApi tiendaapi(Integer idfake) throws IOException;
}
