package dev.alexengrig.sample.spring.contract.rest.producer.service.v2;

import dev.alexengrig.sample.spring.contract.rest.producer.domain.ProducerData;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataResponseV2;
import dev.alexengrig.sample.spring.contract.rest.producer.service.ProducerDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleProducerDataControllerServiceV2 implements ProducerDataControllerServiceV2 {

    private final ProducerDataService dataService;
    private final Converter<ProducerData, ProducerDataResponseV2> responseConverter;

    @Override
    public ProducerDataResponseV2 getData(ProducerDataRequestV2 request) {
        ProducerData data = dataService.getDataById(request.getId());
        return responseConverter.convert(data);
    }

}
