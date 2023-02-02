package dev.alexengrig.sample.otherconsumer.scheduler;

import dev.alexengrig.sample.otherconsumer.domain.ConsumedData;
import dev.alexengrig.sample.otherconsumer.service.ConsumerDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ConsumerDataScheduler {

    private final ConsumerDataService dataService;

    @Scheduled(fixedDelay = 5000L)
    public void consumeAndPrintDataV1() {
        ConsumedData data = dataService.consumeDataV1();
        log.info("Consumed data version 1: {}", data);
    }

    @Scheduled(fixedDelay = 5000L)
    public void consumeAndPrintDataV2() {
        ConsumedData data = dataService.consumeDataV2();
        log.info("Consumed data version 2: {}", data);
    }

}
