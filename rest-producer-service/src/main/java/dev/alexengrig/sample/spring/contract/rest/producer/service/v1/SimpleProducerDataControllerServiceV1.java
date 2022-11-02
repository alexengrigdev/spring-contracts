package dev.alexengrig.sample.spring.contract.rest.producer.service.v1;

import dev.alexengrig.sample.spring.contract.rest.producer.domain.ProducerData;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v1.ProducerDataResponseV1;
import dev.alexengrig.sample.spring.contract.rest.producer.service.ProducerDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleProducerDataControllerServiceV1 implements ProducerDataControllerServiceV1 {

    private final ProducerDataService producerDataService;
    private final Converter<ProducerData, ProducerDataResponseV1> responseConverter;

    @Override
    public ProducerDataResponseV1 getData(String dataId) {
        ProducerData data = producerDataService.getDataById(dataId);
        return responseConverter.convert(data);
    }

}
