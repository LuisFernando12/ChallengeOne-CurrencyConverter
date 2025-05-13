package br.com.luis.fernando.http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http implements IHttp{
    private HttpClient client;
    public Http(){
        this.client = HttpClient.newHttpClient();
    }
    @Override
    public String get(String uri) {
        HttpRequest request = HttpRequest.newBuilder(URI.create(uri))
                .GET()
                .build();
        return this.client
                .sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .join();
    }
}
