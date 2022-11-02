package dev.alexengrig.sample.spring.contract.rest.consumer.service;

import dev.alexengrig.sample.spring.contract.rest.consumer.domain.ConsumedData;
import dev.alexengrig.sample.spring.contract.rest.producer.client.v1.ProducerDataClientV1;
import dev.alexengrig.sample.spring.contract.rest.producer.client.v2.ProducerDataClientV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v1.ProducerDataResponseV1;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataResponseV2;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientConsumerDataService implements ConsumerDataService {

    private final ProducerDataClientV1 dataClientV1;
    private final ProducerDataClientV2 dataClientV2;

    private final Converter<ProducerDataResponseV1, ConsumedData> consumedDataConverterV1;
    private final Converter<ProducerDataResponseV2, ConsumedData> consumedDataConverterV2;

    @Override
    public ConsumedData consumeDataV1() {
        ProducerDataResponseV1 response = dataClientV1.getData("consumer-data-v1");
        return consumedDataConverterV1.convert(response);
    }

    @Override
    public ConsumedData consumeDataV2() {
        ProducerDataRequestV2 request = ProducerDataRequestV2.builder()
                .id("consumer-data-v2")
                .build();
        ProducerDataResponseV2 response = dataClientV2.getData(request);
        return consumedDataConverterV2.convert(response);
    }

}
