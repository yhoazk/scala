# scala
Tutorials and that sort of stuff to learn scala

Scala stands for __scalable Language__. This is a language designated to run on
the JVM, its a statically typed language. Scala has the right features, but its
most obvious deficiency is a very slow compilation. Scala fuses object-oriented
and functional programming in a statically typed programming language.

Scala is object oriented, in scala everything is an object and can be accessed
as such. This is not necessarily a deliberate choice, since there is a slight
penalty for using reference types instead of primitive, but is due to the
fact that in JVM you cannot define value types. So to get the advantages of a
smarter type systems you can only implement it with reference types.


Scala supports equally well the functional and object-oriented programming
paradigms. It was designed with this in mind and it includes features like
* currying
* memoization
* partial applications
* type classes

## Running scala programms
```
echo "println(30)" > test.scala
scala test.scala
30
```

## Importing packages
Example:
```java
import scala.math._ // In scala the _ is a wildcard, like * in java
```

- - -

 Scala can be run in interactive mode, much like python. It's called REPL
(Read-Eval-Print loop).

When an expression is evaluated, the REPL saves the result as a new numbered value.

* Scala is a strongly typed language, the type of variables can be checked within
the REPL by using the built-in `type`.

```scala
scala> :type 2.0 // Look at the colon (:), it's needed!
Double

scala> :type true // Look at the colon (:), it's needed!
Boolean
```


REPL Sessions can be saved, much like in `R`:
```scala
scala>:save /home/me/scala_tut/repl_test.scala
```
Once a session has being saved can be loaded into a new REPL:
```scala
scala>:load /home/me/scala_tut/repl_test.scala
Loading /home/me/scala_tut/repl_test.scala
res1: Int = 3
res2: Int = 3333
```

The past commands can be shown by the function:
```
:h?
```


### Comments
Comments are the same as Java and C/C++.
```scala
// One line Comment
/*
  Multiline comments.
*/
```

### Printing
Scala provides the function `println`.

Here's the helloworld in scala.
```scala
println("Bye world")
```
Also, to stay in the same line, use the `print` function.
```scala
print("In the")
print("same line")
```


### variables
Declaring values is done usign either `var` or `val`.

**val**: Declarations are immutable
**var**: Declares mutable objects
```scala
val x = 10
x = 20 // Error: reassignment to val
var y = 10
y = 20 // y now is 20
```


Scala is a statically typed language, but at the moment we haven't specified the
type of the variables. This is due to a language feature called type inference.
In most cases, the compiler can guess what's the type of the variable, so you
don't have to do it every time. (Probably is b/c of this that scala is slow
  at compile time.)

We can help the compiler and explicitly declare the type of a variable:
```scala
val z: Int = 10
val a: Double = 1.0
```

### Strings
```scala
"Scala strings are sorrounded by double quotes"
'a' // This is a char
'This string will cause an error'
```


Scala strings have the ususal java methods:
```scala
"Test".lenght
"Hello hell".substring(1,3)
"TACO".replace("C", "3")
```

Scala added some extra methods. (See scala.collection.immutable.StringOps)
```scala
"Hello hell".take(5)
"Hello hell".drop(5)
```

String interpolation:

Just add the `s` at the begining of the string.
```scala
val n = 6
s"The n in this string will be replaced if prepend a $. Like this $n"
```
We can do more elaborated stuff like the next examples:
```scala
val a = Array(11, 9, 6)
s"My second daughter is ${a(0) - a(2)} years old."    // => "My second daughter is 5 years old."
s"Power of 2: ${math.pow(2, 2)}"                      // => "Power of 2: 4"
```

And also formating strings, by prependign the `f`:
```scala
// Formatting with interpolated strings with the prefix "f"
f"Power of 5: ${math.pow(5, 2)}%1.0f"         // "Power of 5: 25"
```

If we just want a simple string, we can use simple `raw` strings:
```scala
// Raw strings, ignoring special characters.
raw"New line feed: \n. Carriage return: \r." // => "New line feed: \n. Carriage return: \r."
```

Like in python, triple double quotes, let strings span multiple rows and contain
quotes.

val html = """<form id="daform">
                <p>Press belo', Joe</p>
                <input type="submit">
              </form>"""





### Functions


## [Scala exercises:](https://www.scala-exercises.org/)
