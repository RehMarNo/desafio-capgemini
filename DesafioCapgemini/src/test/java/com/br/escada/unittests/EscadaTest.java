package com.br.escada.unittests;

import com.br.escada.service.EscadaBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

public class EscadaTest {
    @Test
    void shouldEscadaFactoryReturnOne() throws Exception {
        EscadaBuilder escadaBuilder = new EscadaBuilder();
        String text = tapSystemOut(()->{
            escadaBuilder.escadaFactory(1);
        });
        Assertions.assertEquals("*", text.trim());
    }

    @Test
    void shouldEscadaFactoryReturnNothing() throws Exception {
        EscadaBuilder escadaBuilder = new EscadaBuilder();
        String text = tapSystemOut(()->{
            escadaBuilder.escadaFactory(0);
        });
        Assertions.assertEquals("", text.trim());
    }
}
