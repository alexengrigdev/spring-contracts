package dev.alexengrig.sample.spring.contract.rest.producer.service.v2;

import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataResponseV2;

/**
 * Adapter-service of
 * {@link dev.alexengrig.sample.spring.contract.rest.producer.controller.v2.ProducerDataControllerV2 DataControllerV2}.
 */
public interface ProducerDataControllerServiceV2 {

    ProducerDataResponseV2 getData(ProducerDataRequestV2 request);

}
