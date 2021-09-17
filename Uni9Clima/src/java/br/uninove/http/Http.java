package br.uninove.http;

import br.uninove.clima.Clima;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Http {
    
    public static Clima dadosClimaticos(String cidade){
        try{
            String charset = StandardCharsets.UTF_8.name();
            final String url = "http://api.openweathermap.org/data/2.5/weather";
            final String appId = "bf00f9c8ad3a0e102fe5d2d0710178e1";
            final String units = "metric";
            final String lang = "pt_br";
            
            String query = String.format("q=%s&appid=%s&units=%s&lang=%s",
                        URLEncoder.encode(cidade, charset),
                        URLEncoder.encode(appId, charset),
                        URLEncoder.encode(units, charset),
                        URLEncoder.encode(lang, charset)
                    );
            return null;
        }catch(Exception e){
            return null;
        }
    }
    
}
