package dev.alexengrig.sample.producer.controller.v2;

import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataResponseV2;
import dev.alexengrig.sample.producer.service.v2.ProducerDataServiceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/datum")
@RequiredArgsConstructor
public class ProducerDataControllerV2 {

    private final ProducerDataServiceV2 service;

    @PostMapping
    public ProducerDataResponseV2 getData(@RequestBody ProducerDataRequestV2 request) {
        return service.getData(request);
    }

}
