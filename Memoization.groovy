import groovy.transform.*

@Memoized
def timeConsumingOperation(int number){
	println "Performing computation"
	number * number
}

println timeConsumingOperation(2)
println timeConsumingOperation(2)