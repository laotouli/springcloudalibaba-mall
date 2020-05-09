package com.lxh.mall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class MyCorsConfiguration {
    @Bean
    public CorsWebFilter corsWebFilter(){

        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource =new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        //配置跨域
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.setAllowCredentials(true);

        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);

        return new CorsWebFilter(urlBasedCorsConfigurationSource);
    }
}
