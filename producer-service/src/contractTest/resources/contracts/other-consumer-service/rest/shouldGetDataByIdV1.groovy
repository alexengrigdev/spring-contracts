import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url '/api/v1/datum/test-data'
    }
    response {
        status OK()
        headers {
            contentType(applicationJson())
        }
        body(
                id: $('test-data'),
                value: $('Other value for: test-data')
        )
    }
}
