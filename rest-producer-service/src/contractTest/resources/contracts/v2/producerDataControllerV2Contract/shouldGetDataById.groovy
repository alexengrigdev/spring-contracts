package contracts.v2.producerDataControllerV2Contract

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method POST()
        url '/api/v2/datum'
        headers {
            contentType(applicationJson())
        }
        body(
                id: anyNonBlankString()
        )
    }
    response {
        status OK()
        headers {
            contentType(applicationJson())
        }
        body(
                id: fromRequest().body('$.id'),
                value: anyNonBlankString()
        )
    }
}
