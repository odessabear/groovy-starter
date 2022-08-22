package com.odebar.basic

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {
//        Function<Integer, Integer> function = value -> value + value
//        def result = function.apply(5)
//        println(result)

        Closure closure = {
            println(it)
            it + it
        }
//        def result = closure.call(5)
        def result = closure(5)
        println(result)

        Stream.of(1, 2, 3, 4)
        //.map(function)
                .map(closure)
                .map(String::valueOf)
                .forEach(System.out::println)

        int x = 10
        check(x > 0) {
            println(++x)
        }

        println(x)
    }

    static def check(boolean condition, Closure closure) {
        if (closure) {
            closure()
        }
    }
}
