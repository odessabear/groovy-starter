package com.odebar.closure_part_2

import com.odebar.oop.Student

class Closure2Runner {
    static void main(String[] args) {
        Closure closure = {
            firstName = "Sveta"
        }
        println(closure.thisObject)
        println(closure.owner)
        println(closure.delegate)


        def student = new Student("Ivan", "Ivanov", 29)
        println(student)

//        closure.delegate = student
//        closure()
        student.with closure

        println(student)

        student.getInfo().call()

    }
}
