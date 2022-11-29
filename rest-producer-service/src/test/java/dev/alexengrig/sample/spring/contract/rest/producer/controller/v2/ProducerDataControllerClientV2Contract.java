package dev.alexengrig.sample.spring.contract.rest.producer.controller.v2;

import dev.alexengrig.sample.spring.contract.rest.producer.client.v2.ProducerDataClientV2;
import dev.alexengrig.sample.spring.contract.rest.producer.service.v2.ProducerDataControllerServiceV2;

class ProducerDataControllerClientV2Contract
        extends ProducerDataControllerV2
        implements ProducerDataClientV2 {

    public ProducerDataControllerClientV2Contract(ProducerDataControllerServiceV2 service) {
        super(service);
    }

}