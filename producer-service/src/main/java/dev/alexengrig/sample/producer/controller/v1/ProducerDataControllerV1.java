package dev.alexengrig.sample.producer.controller.v1;

import dev.alexengrig.sample.producer.rest.dto.v1.ProducerDataResponseV1;
import dev.alexengrig.sample.producer.service.v1.ProducerDataServiceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/datum")
@RequiredArgsConstructor
public class ProducerDataControllerV1 {

    private final ProducerDataServiceV1 service;

    @GetMapping("/{dataId}")
    public ProducerDataResponseV1 getData(@PathVariable String dataId) {
        return service.getData(dataId);
    }

}
