def geeks = []
geeks << new Geek(name: 'Raj', age: 24, languages: ['Java', 'Groovy'])
geeks << new Geek(name: 'Arun', age: 35, languages: ['Java', 'Scala', 'Clojure'])
geeks << new Geek(name: 'Kumar', age: 28, languages: ['Groovy', 'Scala'])

// find all groovy geeks
def findGroovyGeeksImperative(geeks){
	def groovyGeeks = []
	for(geek in geeks){
	    if(geek.languages.contains('Groovy')){
	        groovyGeeks << geek
	    }
	}
	groovyGeeks
}

def findGeeks(geeks, String language){
	def knowsLang = []
	for(geek in geeks){
	    if(geek.languages.contains(language)){
	        knowsLang << geek
	    }
	}
	knowsLang
}
//println findGroovyGeeksImperative(geeks)
//println findGeeks(geeks, 'Clojure')


/*
def findGroovyGeeksFunctional(geeks){
	geeks.findAll({it.languages.contains('Groovy')})
}
*/

/*
def findGroovyGeeksFunctional(geeks){
	geeks.findAll() {it.languages.contains('Groovy')}
}
*/

/*
def findGroovyGeeksFunctional(geeks){
	geeks.findAll {it.languages.contains('Groovy')}
}
*/

/*
def findGeeksFunctional(geeks, String language){
	geeks.findAll({it.languages.contains(language)})
}
*/
/*
def findGeeksFunctional(geeks, String language){
	geeks.findAll {it.languages.contains(language)}
}
*/

def knowsGroovy = { geek -> 
	geek.languages.contains('Groovy')
}

def knowsClojure = { geek ->
	geek.languages.contains('Clojure')
}

def findGeeksFunctional(geeks, criterion){
	geeks.findAll(criterion)
}

println findGeeksFunctional(geeks, knowsGroovy)
println findGeeksFunctional(geeks, knowsClojure)
