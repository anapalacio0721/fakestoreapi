package com.example.fakestoreapi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fakestoreapi.service.FakeStoreApiService;

@RestController
@RequestMapping( "/fakestoreapi" )
public class FakeStoreApiController {
    private final FakeStoreApiService fakestoreapiservice;
    public FakeStoreApiController( @Autowired FakeStoreApiService fakestoreapiservice )
    {
        this.fakestoreapiservice = fakestoreapiservice;
    } 
    @GetMapping( "/{idfake}")
    public ResponseEntity<FakeStoreApi> mostrarTienda(@PathVariable Integer idfake){
        try {
            return ResponseEntity.ok(fakestoreapiservice.tiendaapi(idfake));
        } catch (IOException e) {
           e.printStackTrace();
        }
        return null;
        
    }
}
