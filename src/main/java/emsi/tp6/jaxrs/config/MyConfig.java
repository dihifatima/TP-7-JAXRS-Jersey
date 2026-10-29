package emsi.tp6.jaxrs.config;

import emsi.tp6.jaxrs.controllers.CompteRestJaxRSAPI;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig extends ResourceConfig {
    public MyConfig() {
        register(CompteRestJaxRSAPI.class);
        register(OpenApiResource.class);
    }
}