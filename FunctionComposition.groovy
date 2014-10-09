def geeks = []
geeks << new Geek(name: 'Raj', age: 24, languages: ['Java', 'Groovy'])
geeks << new Geek(name: 'Arun', age: 35, languages: ['Java', 'Scala', 'Clojure'])
geeks << new Geek(name: 'Kumar', age: 28, languages: ['Groovy', 'Scala'])

def knowsLanguage = { geek, language ->
	geek.languages.contains(language)
}

def knowsGroovy = knowsLanguage.rcurry('Groovy')

def atleast25YearsOld = { geek ->
	geek.age >= 25
}

def findGeeks(geeks, criterion){
	geeks.findAll(criterion)
}

def findGroovyGeeks = (this.&findGeeks).rcurry(knowsGroovy)
def findGeeksAtLeast25 = (this.&findGeeks).rcurry(atleast25YearsOld)

def findGroovyGeeksOlderThan24 = findGeeksAtLeast25 << findGroovyGeeks

println findGroovyGeeksOlderThan24(geeks)

//def atleast25YearsOldAndKnowsGroovy = 
//println findGeeks(geeks, atleast25YearsOldAndKnowsGroovy)

