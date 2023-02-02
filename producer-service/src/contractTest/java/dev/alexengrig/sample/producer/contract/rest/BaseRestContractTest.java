package dev.alexengrig.sample.producer.contract.rest;

import dev.alexengrig.sample.producer.contract.BaseContractTest;
import dev.alexengrig.sample.producer.domain.ProducerData;
import dev.alexengrig.sample.producer.service.ProducerDataService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
public abstract class BaseRestContractTest
        extends BaseContractTest {

    @MockBean
    private ProducerDataService producerDataService;

    @BeforeEach
    public void setupContext(@Autowired WebApplicationContext webApplicationContext) {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
    }

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
