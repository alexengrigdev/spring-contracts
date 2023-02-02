package dev.alexengrig.sample.consumer.service;

import dev.alexengrig.sample.consumer.domain.ConsumedData;

public interface ConsumerDataService {

    ConsumedData consumeDataV1();

    ConsumedData consumeDataV2();

}
