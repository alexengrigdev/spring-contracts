package contracts.otherConsumerService.v1.producerDataControllerV1Contract

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url '/api/v1/datum/other-consumer-data-v1'
    }
    response {
        status OK()
        headers {
            contentType(applicationJson())
        }
        body(
                id: $('other-consumer-data-v1'),
                value: $('Value for: other-consumer-data-v1')
        )
    }
}
