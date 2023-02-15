package com.example.y2015.d5

class StringValidator {
    fun allValid(strings: List<String>, predicates: List<StringPredicate>): Boolean {
        return strings.all { string -> predicates.all { stringPredicate ->  stringPredicate.validate(string) } }
    }

    fun countValid(strings: List<String>, predicates: List<StringPredicate>) : Int {
        return strings.filter { string -> predicates.all { stringPredicate ->  stringPredicate.validate(string) } }.size
    }

}
