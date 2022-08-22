package com.odebar.basic

def name = "Ivan"
def value = 'Hello "Hi"'
char charValue = 'H'

def stringValue = "Hello $name"
println(stringValue)

def value2 = """
SELECT *
FROM table names
WHERE name = $name
"""
println(value2)

def value3 = /Hello $name/
println(value3)
def value4 = $/Hello $name/$
println(value4)

println(name[2])
println(name[-1])
println(name[1..3])
println(name*3)
println(name - 'Iv')
println(name - 'an')