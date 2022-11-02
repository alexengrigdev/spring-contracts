package dev.alexengrig.sample.spring.contract.rest.consumer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProducerDataResponse {

    private String id;
    private String value;

}
