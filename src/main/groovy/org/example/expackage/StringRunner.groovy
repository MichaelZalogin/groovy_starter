package org.example.expackage

name = "Name \"Hi!\""
name2 = 'Name2 "Hi!"'
char nameChar = 'N'

value = "Hello $name"

name3 = /Name/
name4 = $/Name/$
name5 = """
                   SELECT *
                   FROM
                   table where name = ${getWithPrefix(name)}
                   """

println(value)
println(name5)

def String getWithPrefix (String name) {
    return "prefix-" + name
}

def getWithPrefixWithoutReturn (String name) {
    "prefix-" + name
}

println name [-1] //последний символ
println name [2]
println name [3..6] //диапазон символов
println name * 3 //повтор
println name - "me" //вычитание


