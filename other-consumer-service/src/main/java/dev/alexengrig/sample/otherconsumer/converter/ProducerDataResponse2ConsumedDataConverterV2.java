package dev.alexengrig.sample.otherconsumer.converter;

import dev.alexengrig.sample.otherconsumer.domain.ConsumedData;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataResponseV2;
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
