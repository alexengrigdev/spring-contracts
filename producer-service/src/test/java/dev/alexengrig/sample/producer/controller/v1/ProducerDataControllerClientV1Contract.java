package dev.alexengrig.sample.producer.controller.v1;

import dev.alexengrig.sample.producer.rest.client.v1.ProducerDataClientV1;
import dev.alexengrig.sample.producer.service.v1.ProducerDataServiceV1;

class ProducerDataControllerClientV1Contract
        extends ProducerDataControllerV1
        implements ProducerDataClientV1 {

    public ProducerDataControllerClientV1Contract(ProducerDataServiceV1 service) {
        super(service);
    }

}