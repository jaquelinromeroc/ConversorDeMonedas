import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ColsultaMoneda {
    public Moneda buscarMoneda(String monedaBase, String monedaTarget) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/02200a4de2e0bbfbdabcb590/pair/" + monedaBase + "/" + monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encuentro la moneda, revisa la abreviatura");
        }
    }
}

