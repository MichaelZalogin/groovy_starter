package org.example.expackage

assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 / 2 == 1.5
assert 3.intdiv(2) == 1
assert 10 % 3 == 1
assert 2**3 == 8 //power

def resuilt1 = (int) (3 / 2)
def resuilt2 = (3 / 2) as Integer

println resuilt1 <= 29
println resuilt1 <=> 29 // compareTo
