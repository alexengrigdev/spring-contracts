package dev.alexengrig.sample.spring.contract.rest.consumer.service;

import dev.alexengrig.sample.spring.contract.rest.consumer.domain.ConsumedData;

public interface ConsumerDataService {

    ConsumedData consumeDataV1();

    ConsumedData consumeDataV2();

}
