package dev.gustavorh.crudjpa.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests((authz) -> authz
                        .requestMatchers(HttpMethod.GET,"/api/users").permitAll() // Reglas de negocio, ruta a permitir acceso.
                        .requestMatchers(HttpMethod.POST,"/api/users/register").permitAll() // Reglas de negocio, ruta a permitir acceso.
                        .anyRequest().authenticated()) // Cualquier otro request, necesita autorización.
                        .csrf(config -> config.disable())
                        .sessionManagement(management ->
                                management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                        .build();
    }
}
