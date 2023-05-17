package br.com.jeronimocardoso.jeronimocardoso_erp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {


    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {

        http.httpBasic().and().csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/api/v1/clientes/teste/").permitAll()
                        .anyRequest().authenticated()
                )
        ;

        return http.build();
    }


}
