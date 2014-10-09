import groovy.transform.*

class Website{
	String address
	@Lazy 
	URL url = address.toURL()
}


def fuconf = new Website(address: 'http://functionalconf.com/')
println fuconf.dump()

def content =  fuconf.url.text
println content.grep("\n").size()
println fuconf.dump()