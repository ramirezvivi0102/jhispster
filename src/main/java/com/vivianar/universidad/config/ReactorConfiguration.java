package com.vivianar.universidad.config;

import io.github.jhipster.config.JHipsterConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import reactor.core.publisher.Hooks;

@Configuration
@Profile("!" + JHipsterConstants.SPRING_PROFILE_PRODUCTION)
public class ReactorConfiguration {
    public ReactorConfiguration() {
        Hooks.onOperatorDebug();
    }
}
