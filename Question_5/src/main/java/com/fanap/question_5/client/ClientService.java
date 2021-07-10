package com.fanap.question_5.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ClientService {
    public String getAllProducts(int from, int count) {
        String baseUrl = "http://85.133.232.226:12561/appStore/restAPI/spring/service/getAllProducts?from=" + from + "&count=" + count;
        WebClient webClient = WebClient.builder().baseUrl(baseUrl).build();
        return webClient
                .get()
                .uri(baseUrl)
                .header("OSTYPE", "ANDROID")
                .retrieve().bodyToMono(String.class).block();
    }
}
