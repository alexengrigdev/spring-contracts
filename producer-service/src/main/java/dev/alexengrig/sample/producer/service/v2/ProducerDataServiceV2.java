package dev.alexengrig.sample.producer.service.v2;

import dev.alexengrig.sample.producer.controller.v2.ProducerDataControllerV2;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataResponseV2;

/**
 * Adapter-service of
 * {@link ProducerDataControllerV2 DataControllerV2}.
 */
public interface ProducerDataServiceV2 {

    ProducerDataResponseV2 getData(ProducerDataRequestV2 request);

}
