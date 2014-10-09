def geeks = []
geeks << new Geek(name: 'Raj', age: 24, languages: ['Java', 'Groovy'])
geeks << new Geek(name: 'Arun', age: 35, languages: ['Java', 'Scala', 'Clojure'])
geeks << new Geek(name: 'Kumar', age: 28, languages: ['Groovy', 'Scala'])

def knowsLanguage = { geek, language ->
	geek.languages.contains(language)
}

/*
def findGeeks(geeks, criterion, String language){
	geeks.findAll {criterion(it, language)}
}

println findGeeks(geeks, knowsLanguage, 'Groovy')
*/

def knowsGroovy = knowsLanguage.rcurry('Groovy')
def knowsClojure = knowsLanguage.rcurry('Clojure')

def findGeeks(geeks, criterion){
	geeks.findAll(criterion)
}

println findGeeks(geeks, knowsGroovy)
println findGeeks(geeks, knowsClojure)