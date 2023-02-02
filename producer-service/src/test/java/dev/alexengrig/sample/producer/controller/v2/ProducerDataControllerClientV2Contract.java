package dev.alexengrig.sample.producer.controller.v2;

import dev.alexengrig.sample.producer.rest.client.v2.ProducerDataClientV2;
import dev.alexengrig.sample.producer.service.v2.ProducerDataServiceV2;

class ProducerDataControllerClientV2Contract
        extends ProducerDataControllerV2
        implements ProducerDataClientV2 {

    public ProducerDataControllerClientV2Contract(ProducerDataServiceV2 service) {
        super(service);
    }

}