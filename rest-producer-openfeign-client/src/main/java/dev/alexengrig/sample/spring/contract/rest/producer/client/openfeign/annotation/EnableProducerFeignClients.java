package dev.alexengrig.sample.spring.contract.rest.producer.client.openfeign.annotation;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@EnableFeignClients(basePackages = EnableProducerFeignClients.PACKAGE)
public @interface EnableProducerFeignClients {

    String PACKAGE = "dev.alexengrig.sample.spring.contract.rest.producer.client.openfeign";

    @AliasFor(annotation = EnableFeignClients.class, attribute = "defaultConfiguration")
    Class<?>[] defaultConfiguration() default {};

}
