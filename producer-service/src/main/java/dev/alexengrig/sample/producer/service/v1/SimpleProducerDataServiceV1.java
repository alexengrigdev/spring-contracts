package dev.alexengrig.sample.producer.service.v1;

import dev.alexengrig.sample.producer.domain.ProducerData;
import dev.alexengrig.sample.producer.service.ProducerDataService;
import dev.alexengrig.sample.producer.rest.dto.v1.ProducerDataResponseV1;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleProducerDataServiceV1 implements ProducerDataServiceV1 {

    private final ProducerDataService producerDataService;
    private final Converter<ProducerData, ProducerDataResponseV1> responseConverter;

    @Override
    public ProducerDataResponseV1 getData(String dataId) {
        ProducerData data = producerDataService.getDataById(dataId);
        return responseConverter.convert(data);
    }

}
