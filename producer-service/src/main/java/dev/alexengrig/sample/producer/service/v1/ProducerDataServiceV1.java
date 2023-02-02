package dev.alexengrig.sample.producer.service.v1;

import dev.alexengrig.sample.producer.controller.v1.ProducerDataControllerV1;
import dev.alexengrig.sample.producer.rest.dto.v1.ProducerDataResponseV1;

/**
 * Adapter-service of
 * {@link ProducerDataControllerV1 DataControllerV1}.
 */
public interface ProducerDataServiceV1 {

    ProducerDataResponseV1 getData(String dataId);

}
