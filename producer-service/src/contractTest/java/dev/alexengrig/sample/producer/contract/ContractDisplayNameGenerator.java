package dev.alexengrig.sample.producer.contract;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class ContractDisplayNameGenerator extends DisplayNameGenerator.Standard {

    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        String className = super.generateDisplayNameForClass(testClass);
        String packageName = testClass.getPackageName();
        if (packageName.isBlank()) {
            return className;
        }
        int lastDot = packageName.lastIndexOf('.');
        String consumerName = packageName.substring(lastDot + 1);
        return className + " (" + consumerName + ")";
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        String methodName = super.generateDisplayNameForMethod(testClass, testMethod);
        return methodName.substring("validate_".length());
    }

}
