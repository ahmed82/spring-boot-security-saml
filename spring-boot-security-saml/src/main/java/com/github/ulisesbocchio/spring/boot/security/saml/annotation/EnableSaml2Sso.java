package com.github.ulisesbocchio.spring.boot.security.saml.annotation;

/**
 * @author Ulises Bocchio
 */

import com.github.ulisesbocchio.spring.boot.security.saml.configuration.DefaultSAMLConfiguration;
import com.github.ulisesbocchio.spring.boot.security.saml.configuration.SAML2ServiceProviderSecurityConfiguration;
import com.github.ulisesbocchio.spring.boot.security.saml.properties.SAML2SsoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableOAuth2Client
@EnableConfigurationProperties(SAML2SsoProperties.class)
@Import({DefaultSAMLConfiguration.class, SAML2ServiceProviderSecurityConfiguration.class})
public @interface EnableSAML2Sso {
}
