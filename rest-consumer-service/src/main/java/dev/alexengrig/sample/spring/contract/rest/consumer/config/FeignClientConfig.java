package dev.alexengrig.sample.spring.contract.rest.consumer.config;

import dev.alexengrig.sample.spring.contract.rest.producer.client.openfeign.annotation.EnableProducerFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableProducerFeignClients
public class FeignClientConfig {
}
