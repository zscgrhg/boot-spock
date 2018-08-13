package com.example

import spock.lang.FailsWith
import spock.lang.Shared
import spock.lang.Specification

class MyFirstSpec extends Specification {

    @Shared int x=100

    @FailsWith(NullPointerException)
    def "pushing an element on the stack"() {
        given: "oops"
            def a = 1
            def b = 1
            throw new NullPointerException()

        expect:
            a == b
    }

    def "HashMap accepts null key"() {

        setup:
            def map = new HashMap()
        and:
            print "hello"
        when:
            map.put(null, "elem")

        then:
            println "hello"
            notThrown(NullPointerException)
    }

    def "computing the maximum of two numbers"() {
        expect:
            Math.max(a, b) == c

        where:
            a << [5, 3]
            b << [1, 9]
            c << [5, 9]
    }

    def "maximum of two numbers #a"() {
        expect:
            println "haha"
            Math.max(a, b) == c

        where:
            a << [1, 7, 0]
            b << [3, 4, 0]
            c=b
    }
}
