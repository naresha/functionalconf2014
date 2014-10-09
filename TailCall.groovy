import groovy.transform.*

@TailRecursive
def factorial(number, fact = 1){
	number == 0 ? fact : factorial(number - 1, fact * number)
}

println factorial(2500G)