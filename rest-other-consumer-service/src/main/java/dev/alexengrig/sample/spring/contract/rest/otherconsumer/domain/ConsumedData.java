package dev.alexengrig.sample.spring.contract.rest.otherconsumer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsumedData {

    private String id;
    private String value;

}
