import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method POST()
        url '/api/v2/datum'
        headers {
            contentType(applicationJson())
        }
        body(
                id: $('other-consumer-data-v2')
        )
    }
    response {
        status OK()
        headers {
            contentType(applicationJson())
        }
        body(
                id: $('other-consumer-data-v2'),
                value: $('Other value for: other-consumer-data-v2')
        )
    }
}
