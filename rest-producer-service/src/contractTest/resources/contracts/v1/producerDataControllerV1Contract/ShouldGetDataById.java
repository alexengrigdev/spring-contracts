package contracts.v1.producerDataControllerV1Contract;

import org.springframework.cloud.contract.spec.Contract;

import java.util.function.Supplier;

import static org.springframework.cloud.contract.verifier.util.ContractVerifierUtil.map;

public class ShouldGetDataById implements Supplier<Contract> {

    @Override
    public Contract get() {
        return Contract.make(c -> {
            c.request(r -> {
                r.method(r.GET());
                r.url(r.$(
                        r.consumer(r.regex("/api/v1/datum/\\s*\\S[\\S\\s]*")),
                        r.producer("/api/v1/datum/test-data-id")
                ));
            });
            c.response(r -> {
                r.status(r.OK());
                r.headers(h -> {
                    h.contentType(h.applicationJson());
                });
                r.body(map()
                        .entry("id", r.fromRequest().path(3))
                        .entry("value", r.anyNonBlankString()));
            });
        });
    }

}
