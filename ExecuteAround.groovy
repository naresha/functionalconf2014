def sayHello = {
	println "Hello"
}

def sayHi = {
	println "Hi"
}

[sayHello, sayHi].each{ command ->
	println "Before Command"
	command()
	println "After Command"
}