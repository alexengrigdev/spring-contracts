package dev.alexengrig.sample.spring.contract.rest.producer.converter.v1;

import dev.alexengrig.sample.spring.contract.rest.producer.domain.ProducerData;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v1.ProducerDataResponseV1;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProducerDataResponseConverterV1 implements Converter<ProducerData, ProducerDataResponseV1> {

    @Override
    public ProducerDataResponseV1 convert(ProducerData source) {
        return ProducerDataResponseV1.builder()
                .id(source.getId())
                .value(source.getValue())
                .build();
    }

}
