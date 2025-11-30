package com.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    // ==========================
    // OPTION 1: STATIC ROUTES
    // ==========================

    @Bean
    RouteLocator staticRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/clients/**").uri("lb://SERVICE-CLIENT"))
                .route(r -> r.path("/client/**").uri("lb://SERVICE-CLIENT"))
                .route(r -> r.path("/voitures/**").uri("lb://SERVICE-VOITURE"))
                .build();
    }


    // ==========================
    // OPTION 2: DYNAMIC ROUTES
    // ==========================
    /*
    @Bean
    DiscoveryClientRouteDefinitionLocator dynamicRoutes(
            ReactiveDiscoveryClient rdc,
            DiscoveryLocatorProperties dlp) {

        return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
    }*/
}
