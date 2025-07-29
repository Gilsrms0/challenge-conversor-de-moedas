package br.com.conversor;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    public void converter(int opcao, double valor) {
        String from = "", to = "";

        switch (opcao) {
            case 1 -> {
                from = "USD";
                to = "BRL";
            }
            case 2 -> {
                from = "BRL";
                to = "USD";
            }
            case 3 -> {
                from = "EUR";
                to = "BRL";
            }
            case 4 -> {
                from = "BRL";
                to = "EUR";
            }
            case 5 -> {
                from = "GBP";
                to = "BRL";
            }
            case 6 -> {
                from = "BRL";
                to = "GBP";
            }
        }

        String url = "https://api.exchangerate.host/convert?from=" + from + "&to=" + to + "&amount=" + valor;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Moeda resultado = gson.fromJson(response.body(), Moeda.class);
            System.out.printf("💱 %.2f %s = %.2f %s%n", valor, from, resultado.getResult(), to);

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao realizar a conversão: " + e.getMessage());
        }
    }
}
