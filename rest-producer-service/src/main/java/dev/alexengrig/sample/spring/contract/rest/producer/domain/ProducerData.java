package dev.alexengrig.sample.spring.contract.rest.producer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProducerData {

    private String id;
    private String value;

}
