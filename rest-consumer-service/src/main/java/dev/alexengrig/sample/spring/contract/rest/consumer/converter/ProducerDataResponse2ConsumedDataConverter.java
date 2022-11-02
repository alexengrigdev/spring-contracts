package dev.alexengrig.sample.spring.contract.rest.consumer.converter;

import dev.alexengrig.sample.spring.contract.rest.consumer.domain.ConsumedData;
import dev.alexengrig.sample.spring.contract.rest.consumer.dto.ProducerDataResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProducerDataResponse2ConsumedDataConverter implements Converter<ProducerDataResponse, ConsumedData> {

    @Override
    public ConsumedData convert(ProducerDataResponse source) {
        return ConsumedData.builder()
                .id(source.getId())
                .value(source.getValue())
                .build();
    }

}
