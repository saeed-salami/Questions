package com.fanap.question_5.service;

import com.fanap.question_5.client.ClientService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductService {
    private final ClientService clientService;
    private int firstFormParam;
    private int firstCountParam;

    private Map<String, String> productsMap = new HashMap<>();

    private Long cacheTime;

    public ProductService(ClientService clientService) {
        this.clientService = clientService;
    }


    public Map<String, String> getAllProducts(int from, int count) {


        if (productsMap.isEmpty()) {
            productsMap.put("response", clientService.getAllProducts(from, count));
            cacheTime = System.currentTimeMillis();
            firstFormParam = from;
            firstCountParam = count;
            return productsMap;
        } else if (Math.abs((cacheTime - System.currentTimeMillis())) < 7200000 && firstFormParam == (from) && firstCountParam == (count)) {
            return productsMap;
        } else {
            productsMap.clear();
            productsMap.put("response", clientService.getAllProducts(from, count));
        }
        return productsMap;
    }
}
