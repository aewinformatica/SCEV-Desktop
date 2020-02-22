package com.aewinformatica.scev.desktop;

import com.aewinformatica.scev.desktop.controller.ControllerPrincipal;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Jessica
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class)
                .headless(false)
                .web(WebApplicationType.NONE);

        ConfigurableApplicationContext context;
        context = builder.run(args);

        ControllerPrincipal controllerPrincipal = context.getBean(ControllerPrincipal.class);
        controllerPrincipal.preparaExibirView();
    }
}
