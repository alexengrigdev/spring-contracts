package dev.alexengrig.sample.spring.contract.rest.consumer.client;

import dev.alexengrig.sample.spring.contract.rest.consumer.dto.ProducerDataResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TemplateProducerDataClientV1 implements ProducerDataClientV1 {

    private final RestTemplate template;

    public TemplateProducerDataClientV1(
            RestTemplateBuilder templateBuilder,
            @Value("${services.producer.url}")
            String producerServiceUrl
    ) {
        this.template = templateBuilder
                .rootUri(producerServiceUrl)
                .build();
    }

    @Override
    public ProducerDataResponse getData(String dataId) {
        String url = "/api/v1/datum/" + dataId;
        return template.getForObject(url, ProducerDataResponse.class);
    }

}
