package altamirano.hernandez.proyectogastos_springboot_angular.cors;

import org.springframework.web.filter.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration configuration = new CorsConfiguration();

        configuration.setAllowedOrigins(List.of("*")); // Origenes permitidos
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE")); //Metodos Http Permitidos
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowCredentials(true); //Cookies o credenciales eh headers

        UrlBasedCorsConfigurationSource  source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);

        return new CorsFilter(source);
    }
}
