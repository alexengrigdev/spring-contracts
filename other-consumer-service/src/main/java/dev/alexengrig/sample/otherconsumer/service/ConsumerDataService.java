package dev.alexengrig.sample.otherconsumer.service;

import dev.alexengrig.sample.otherconsumer.domain.ConsumedData;

public interface ConsumerDataService {

    ConsumedData consumeDataV1();

    ConsumedData consumeDataV2();

}
