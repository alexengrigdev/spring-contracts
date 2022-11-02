package dev.alexengrig.sample.spring.contract.rest.producer.client.feign.config;

import dev.alexengrig.sample.spring.contract.rest.producer.client.feign.FeignProducerDataClientV1;
import dev.alexengrig.sample.spring.contract.rest.producer.client.feign.FeignProducerDataClientV2;
import feign.Feign;
import feign.Logger;
import feign.Retryer;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@RequiredArgsConstructor
public class FeignClientAutoConfiguration {

    @Value("${services.producer.url}")
    private final String producerServiceUrl;

    @Bean
    public FeignProducerDataClientV1 feignProducerDataClientV1() {
        String url = producerServiceUrl + "/api/v1/datum";
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(FeignProducerDataClientV1.class))
                .retryer(Retryer.NEVER_RETRY)
                .logLevel(Logger.Level.FULL)
                .target(FeignProducerDataClientV1.class, url);
    }

    @Bean
    public FeignProducerDataClientV2 feignProducerDataClientV2() {
        String url = producerServiceUrl + "/api/v2/datum";
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(FeignProducerDataClientV2.class))
                .retryer(Retryer.NEVER_RETRY)
                .logLevel(Logger.Level.FULL)
                .target(FeignProducerDataClientV2.class, url);
    }

}
