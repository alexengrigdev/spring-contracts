package dev.alexengrig.sample.producer.service.v2;

import dev.alexengrig.sample.producer.domain.ProducerData;
import dev.alexengrig.sample.producer.service.ProducerDataService;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataResponseV2;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleProducerDataServiceV2 implements ProducerDataServiceV2 {

    private final ProducerDataService dataService;
    private final Converter<ProducerData, ProducerDataResponseV2> responseConverter;

    @Override
    public ProducerDataResponseV2 getData(ProducerDataRequestV2 request) {
        ProducerData data = dataService.getDataById(request.getId());
        return responseConverter.convert(data);
    }

}
