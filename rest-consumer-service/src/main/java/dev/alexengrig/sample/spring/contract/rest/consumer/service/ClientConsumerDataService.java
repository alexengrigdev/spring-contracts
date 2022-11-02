package dev.alexengrig.sample.spring.contract.rest.consumer.service;

import dev.alexengrig.sample.spring.contract.rest.consumer.client.ProducerDataClientV1;
import dev.alexengrig.sample.spring.contract.rest.consumer.client.ProducerDataClientV2;
import dev.alexengrig.sample.spring.contract.rest.consumer.domain.ConsumedData;
import dev.alexengrig.sample.spring.contract.rest.consumer.dto.ProducerDataRequest;
import dev.alexengrig.sample.spring.contract.rest.consumer.dto.ProducerDataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientConsumerDataService implements ConsumerDataService {

    private final ProducerDataClientV1 dataClientV1;
    private final ProducerDataClientV2 dataClientV2;

    private final Converter<ProducerDataResponse, ConsumedData> consumedDataConverter;

    @Override
    public ConsumedData consumeDataV1() {
        ProducerDataResponse response = dataClientV1.getData("consumer-data-v1");
        return consumedDataConverter.convert(response);
    }

    @Override
    public ConsumedData consumeDataV2() {
        ProducerDataRequest request = ProducerDataRequest.builder()
                .id("consumer-data-v2")
                .build();
        ProducerDataResponse response = dataClientV2.getData(request);
        return consumedDataConverter.convert(response);
    }

}
