package com.mauricio.security.sso.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@KeycloakConfiguration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public @interface SSOSecurity {
}
