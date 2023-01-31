package contracts.consumerService.v1.producerDataControllerV1Contract

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url '/api/v1/datum/consumer-data-v1'
    }
    response {
        status OK()
        headers {
            contentType(applicationJson())
        }
        body(
                id: $('consumer-data-v1'),
                value: $('Value for: consumer-data-v1')
        )
    }
}
