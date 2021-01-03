fun Main () {

    // An example of concatenation of strings

    var newChar: Char = '!'
    var greetingMessage = "Hello Tumininu"
    greetingMessage += newChar // This is one way

    println(greetingMessage)

    var concatenatedString = greetingMessage + newChar
    var concatenatedString1 = "Hello Tumininu" + "!"

    println(concatenatedString)
    println(concatenatedString1)
}