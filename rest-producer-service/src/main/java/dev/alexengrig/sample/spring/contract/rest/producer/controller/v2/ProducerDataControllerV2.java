package dev.alexengrig.sample.spring.contract.rest.producer.controller.v2;

import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataResponseV2;
import dev.alexengrig.sample.spring.contract.rest.producer.service.v2.ProducerDataControllerServiceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/datum")
@RequiredArgsConstructor
public class ProducerDataControllerV2 {

    private final ProducerDataControllerServiceV2 service;

    @PostMapping
    public ProducerDataResponseV2 getData(@RequestBody ProducerDataRequestV2 request) {
        return service.getData(request);
    }

}
