def geeks = []
geeks << new Geek(name: 'Raj', age: 24, languages: ['Java', 'Groovy'])
geeks << new Geek(name: 'Arun', age: 35, languages: ['Java', 'Scala', 'Clojure'])
geeks << new Geek(name: 'Kumar', age: 28, languages: ['Groovy', 'Scala'])

geeks2  = geeks +  new Geek(name: 'Mark', age: 40, languages: ['Lisp', 'Haskell'])

geeksImmutable = geeks.asImmutable()
//geeksImmutable << new Geek(name: 'Mark', age: 40, languages: ['Lisp', 'Haskell'])

/*
def geeksOrderedByAge = geeks.sort { it.age }
println geeksOrderedByAge
println geeks
*/

/*
def geeksOrderedByAge = geeks.sort false, { it.age }
println geeksOrderedByAge
println geeks
*/
