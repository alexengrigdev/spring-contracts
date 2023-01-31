package dev.alexengrig.sample.spring.contract.rest.otherconsumer.service;

import dev.alexengrig.sample.spring.contract.rest.otherconsumer.domain.ConsumedData;

public interface ConsumerDataService {

    ConsumedData consumeDataV1();

    ConsumedData consumeDataV2();

}
