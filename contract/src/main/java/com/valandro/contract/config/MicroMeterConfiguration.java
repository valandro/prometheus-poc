package com.valandro.contract.config;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MicroMeterConfiguration {

    @Bean
    MeterRegistryCustomizer meterRegistryCustomizer(MeterRegistry meterRegistry){
        return meterReg -> {
            meterRegistry.config().commonTags("application", "prometheus-poc");
        };
    }
}
