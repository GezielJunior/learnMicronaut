package com.learnMicronaut

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject

@MicronautTest
class LearnMicronautSpec extends Specification {

    @Inject
    EmbeddedApplication<?> application

    void 'test it works'() {
        expect:
        application.running
    }

}
