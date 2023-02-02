package dev.alexengrig.sample.consumer.converter;

import dev.alexengrig.sample.consumer.domain.ConsumedData;
import dev.alexengrig.sample.producer.rest.dto.v1.ProducerDataResponseV1;
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
