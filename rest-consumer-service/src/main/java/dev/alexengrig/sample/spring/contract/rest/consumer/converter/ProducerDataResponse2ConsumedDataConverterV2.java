package dev.alexengrig.sample.spring.contract.rest.consumer.converter;

import dev.alexengrig.sample.spring.contract.rest.consumer.domain.ConsumedData;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataResponseV2;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProducerDataResponse2ConsumedDataConverterV2 implements Converter<ProducerDataResponseV2, ConsumedData> {

    @Override
    public ConsumedData convert(ProducerDataResponseV2 source) {
        return ConsumedData.builder()
                .id(source.getId())
                .value(source.getValue())
                .build();
    }

}
