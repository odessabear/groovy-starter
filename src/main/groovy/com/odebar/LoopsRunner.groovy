package com.odebar

class LoopsRunner {
    static void main(String[] args) {
//     while/for
        def list = [1, 2, 3, 4]
//        for (int i; i < list.size(); i++){
//            println(i)
//        }
        for (i in 0..<list.size()) {
            println(i)
        }

//        for (Integer value  : list) {
//            println(value)
//        }
//        for (value in list) {
//            println(value)
//        }
        println()
        0.upto(list.size()) {
            println(it)
        }
        println()
        list.size().downto(0) {
            println(it)
        }
        println()
        list.size().times {
            println(it)
        }
        println()
        0.step(5, 2) {
            println(it)
        }
    }
}
