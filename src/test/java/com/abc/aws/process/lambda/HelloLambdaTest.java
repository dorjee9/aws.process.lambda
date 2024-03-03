package com.abc.aws.process.lambda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloLambdaTest{
    @Test
    public void shouldReturnHelloMessage() {
        var sut = new HelloLambda();
        assertEquals("Hello, AWS Lambda!","Hello, AWS Lambda!");
    }
}