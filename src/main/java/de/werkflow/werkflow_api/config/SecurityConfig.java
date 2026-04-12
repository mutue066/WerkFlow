package de.werkflow.werkflow_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Alles erlaubt
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                // CSRF-Schutz für H2 deaktivieren
                .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
                .headers(headers -> headers
                        // H2-console läuft in einem iFrame
                        .frameOptions(HeadersConfigurer.FrameOptionsConfig::disable))
                // Spring eigner Login-Screen deaktivieren
                .formLogin(AbstractHttpConfigurer::disable);

        return http.build();
    }
}
