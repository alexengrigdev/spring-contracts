package dev.alexengrig.sample.consumer.service;

import dev.alexengrig.sample.consumer.domain.ConsumedData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        properties = "services.producer.url=http://localhost:18080")
@AutoConfigureMockMvc
@AutoConfigureStubRunner(
        ids = "dev.alexengrig.sample:producer-service:18080",
        stubsPerConsumer = true)
class ClientConsumerDataServiceIntegrationTest {

    @Autowired
    ClientConsumerDataService service;

    @Test
    void should_consume_dataV1() {
        ConsumedData data = service.consumeDataV1();
        assertEquals("test-data", data.getId(), "Id");
        assertEquals("Value for: test-data", data.getValue(), "Value");
    }

    @Test
    void should_consume_dataV2() {
        ConsumedData data = service.consumeDataV2();
        assertEquals("consumer-data-v2", data.getId(), "Id");
        assertEquals("Value for: consumer-data-v2", data.getValue(), "Value");
    }

}