package dev.alexengrig.sample.producer.rest.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProducerDataResponseV1 {

    private String id;
    private String value;

}
