package com.example.fakestoreapi.service.Impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.example.fakestoreapi.controller.FakeStoreApi;
import com.example.fakestoreapi.service.FakeStoreApiService;
import com.google.gson.Gson;

@Service
public class FakeStoreApiServiceImpl implements FakeStoreApiService {

    @Override
    public FakeStoreApi tiendaapi(Integer idfake) throws IOException {
        {
            URL url = new URL("https://fakestoreapi.com/products/"+String.valueOf(idfake));
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK){
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                Gson g = new Gson();
                FakeStoreApi fakeStoreApi = g.fromJson(response.toString(), FakeStoreApi.class); // declaro la variable pokeapi de tipo objeto PokeApi
                return fakeStoreApi; 
            }
        return null;
    }
 }
}
