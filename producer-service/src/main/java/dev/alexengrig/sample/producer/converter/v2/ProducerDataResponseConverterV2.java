package dev.alexengrig.sample.producer.converter.v2;

import dev.alexengrig.sample.producer.domain.ProducerData;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataResponseV2;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProducerDataResponseConverterV2 implements Converter<ProducerData, ProducerDataResponseV2> {

    @Override
    public ProducerDataResponseV2 convert(ProducerData source) {
        return ProducerDataResponseV2.builder()
                .id(source.getId())
                .value(source.getValue())
                .build();
    }

}
