package org.example.expackage

import groovy.transform.CompileStatic

import java.sql.Date as SqlDate

class VeriableRunner {

    /**
     * BigInteger, BigDecimal
     */

    def field;

    @CompileStatic
    static void main(def args) {
        int value = 5 // Всегда Integer
        Integer value2 = 5
        BigInteger value3 = 26G
        BigDecimal value4 = 2.6G
        def value5 = 32;

    }
}
