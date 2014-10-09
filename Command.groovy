def sayHello = {
	println "Hello"
}

def sayHi = {
	println "Hi"
}

[sayHello, sayHi].each{ command ->
	command()
}