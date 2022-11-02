package dev.alexengrig.sample.spring.contract.rest.producer.service.v1;

import dev.alexengrig.sample.spring.contract.rest.producer.controller.v1.ProducerDataControllerV1;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v1.ProducerDataResponseV1;

/**
 * Adapter-service of
 * {@link ProducerDataControllerV1 DataControllerV1}.
 */
public interface ProducerDataControllerServiceV1 {

    ProducerDataResponseV1 getData(String dataId);

}
