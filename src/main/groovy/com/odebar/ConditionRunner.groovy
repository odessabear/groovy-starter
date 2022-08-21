package com.odebar

class ConditionRunner {
    /**
     * boolean         is true
     * Collection/Map  is not empty
     * Matcher         has match
     * String/GString  is not empty
     * Number/Char     !=0
     * reference       != null
     *
     * asBoolean
     *
     * @param args
     */
    static void main(String[] args) {
        int x = 10
        if (x) {
            println(x)
        }

        def person = new Person(19)
        if (person) {
            println(person.getId())
        }

//        if (person != null) {
//            person.getId()
//        }
//        the same
//        person?.getId()

//        def result = x ? x : 1
        def result = x ?: 1
        println(result)
    }
}
