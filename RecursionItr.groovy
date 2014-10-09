def geeks = []
geeks << new Geek(name: 'Raj', age: 24, languages: ['Java', 'Groovy'])
geeks << new Geek(name: 'Arun', age: 35, languages: ['Java', 'Scala', 'Clojure'])
geeks << new Geek(name: 'Kumar', age: 28, languages: ['Groovy', 'Scala'])

def ages = geeks.collect { it.age }


def sum
sum = { head, tail ->
	if(!tail){
		head
	}
	else{
		head + sum(tail.head(), tail.tail())
	}
}

println(sum(0, ages))


/*
println ages.inject(0) { s, item ->
	s  + item
}
*/
