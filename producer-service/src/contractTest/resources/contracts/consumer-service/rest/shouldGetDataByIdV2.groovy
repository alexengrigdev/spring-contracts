import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method POST()
        url '/api/v2/datum'
        headers {
            contentType(applicationJson())
        }
        body(
                id: $('consumer-data-v2')
        )
    }
    response {
        status OK()
        headers {
            contentType(applicationJson())
        }
        body(
                id: $('consumer-data-v2'),
                value: $('Value for: consumer-data-v2')
        )
    }
}
