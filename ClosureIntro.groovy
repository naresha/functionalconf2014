/*
def wish = {
	println "Hello"
}

wish()
*/

/*
def wishFriend = {
	println "Hello $it"
} 

wishFriend 'Raj'
*/

def wishFriend = { to ->
	println "Hello $to"
}

wishFriend 'Raj'

def wish = { ->
	println "Hello"
}

wish()

def wishWithMessage = { to, message ->
	println "Hello $to, $message"
}

wishWithMessage "Raj", "Good Evening"
