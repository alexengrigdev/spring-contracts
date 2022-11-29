package dev.alexengrig.sample.spring.contract.rest.producer.controller.v1;

import dev.alexengrig.sample.spring.contract.rest.producer.controller.BaseControllerContractTest;
import dev.alexengrig.sample.spring.contract.rest.producer.domain.ProducerData;
import dev.alexengrig.sample.spring.contract.rest.producer.service.ProducerDataService;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public abstract class BaseProducerDataControllerV1ContractTest
        extends BaseControllerContractTest {

    @MockBean
    private ProducerDataService producerDataService;

    @BeforeEach
    public void setupMocks() {
        when(producerDataService.getDataById(anyString()))
                .thenAnswer(invocation -> {
                    String dataId = invocation.getArgument(0, String.class);
                    return ProducerData.builder()
                            .id(dataId)
                            .value("Value for: " + dataId)
                            .build();
                });
    }

}
