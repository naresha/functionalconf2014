def geeks = []
geeks << new Geek(name: 'Raj', age: 24, languages: ['Java', 'Groovy'])
geeks << new Geek(name: 'Arun', age: 35, languages: ['Java', 'Scala', 'Clojure'])
geeks << new Geek(name: 'Kumar', age: 28, languages: ['Groovy', 'Scala'])

println geeks.findAll { it.languages.contains('Groovy')}
			.collect {it.age}
			.sum()

println geeks.findAll { it.languages.contains('Groovy')}
			.collect {it.age}
			.with{ sum()/ size()}