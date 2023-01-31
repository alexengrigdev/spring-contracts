package dev.alexengrig.sample.spring.contract.rest.otherconsumer.converter;

import dev.alexengrig.sample.spring.contract.rest.otherconsumer.domain.ConsumedData;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v1.ProducerDataResponseV1;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProducerDataResponse2ConsumedDataConverterV1 implements Converter<ProducerDataResponseV1, ConsumedData> {

    @Override
    public ConsumedData convert(ProducerDataResponseV1 source) {
        return ConsumedData.builder()
                .id(source.getId())
                .value(source.getValue())
                .build();
    }

}
