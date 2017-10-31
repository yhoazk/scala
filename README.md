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

## [Scala exercises:](https://www.scala-exercises.org/)
