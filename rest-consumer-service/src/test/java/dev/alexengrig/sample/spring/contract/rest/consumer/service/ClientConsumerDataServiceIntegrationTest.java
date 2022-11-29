package dev.alexengrig.sample.spring.contract.rest.consumer.service;

import dev.alexengrig.sample.spring.contract.rest.consumer.domain.ConsumedData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        properties = "services.producer.url=http://localhost:18080")
@AutoConfigureMockMvc
@AutoConfigureStubRunner(ids = "dev.alexengrig.sample:rest-producer-service:18080")
class ClientConsumerDataServiceIntegrationTest {

    @Autowired
    ClientConsumerDataService service;

    @Test
    void should_consume_dataV1() {
        ConsumedData data = service.consumeDataV1();
        assertEquals("consumer-data-v1", data.getId(), "Id");
        assertNotNull(data.getValue(), "Value");
        assertFalse(data.getValue().isBlank(), "Blank value");
    }

    @Test
    void should_consume_dataV2() {
        ConsumedData data = service.consumeDataV2();
        assertEquals("consumer-data-v2", data.getId(), "Id");
        assertNotNull(data.getValue(), "Value");
        assertFalse(data.getValue().isBlank(), "Blank value");
    }

}