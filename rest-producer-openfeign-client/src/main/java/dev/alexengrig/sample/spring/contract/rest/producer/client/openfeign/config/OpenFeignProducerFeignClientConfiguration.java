package dev.alexengrig.sample.spring.contract.rest.producer.client.openfeign.config;

import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenFeignProducerFeignClientConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public OkHttpClient feignOkHttpClient() {
        return new OkHttpClient();
    }

    @Bean
    @ConditionalOnMissingBean
    public JacksonEncoder feignJacksonEncoder() {
        return new JacksonEncoder();
    }

    @Bean
    @ConditionalOnMissingBean
    public JacksonDecoder feignJacksonDecoder() {
        return new JacksonDecoder();
    }

}
