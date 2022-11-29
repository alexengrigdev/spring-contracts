package dev.alexengrig.sample.spring.contract.rest.producer.controller.v1;

import dev.alexengrig.sample.spring.contract.rest.producer.client.v1.ProducerDataClientV1;
import dev.alexengrig.sample.spring.contract.rest.producer.service.v1.ProducerDataControllerServiceV1;

class ProducerDataControllerClientV1Contract
        extends ProducerDataControllerV1
        implements ProducerDataClientV1 {

    public ProducerDataControllerClientV1Contract(ProducerDataControllerServiceV1 service) {
        super(service);
    }

}