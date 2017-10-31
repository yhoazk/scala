# STD LIB

## Asserts:

ScalaTest makes three assertions available by default in any style trait.
* `assert` for general assertions
* `assertResult` to diferentiate expected from actual values
* `intercept` to ensure a bit of code throws an expected exception.

In any scala program, assertions can be called and passing a boolean expression.
Example of an assertion:
```scala
val left = 2
val right = 1
assert(left == right)
java.lang.AssertionError: assertion failed
	at scala.Predef$.assert(Predef.scala:165)
	at .<init>(<console>:10)
	at .<clinit>(<console>)
	at .<init>(<console>:7)
	at .<clinit>(<console>)
	at $print(<console>)
...
```
1==
If the boolean expression is `true`, `assert` will return normally; if `false`,
scala's `assert` will complete abruptly with an `AssertionError`.

ScalaTest provides a domain specific language (DSL) for expressing assertions
in tests using the word `should`. ScalaTest matchers provide five different ways
to check equality.

```scala
result should equal(3)
result should ===(3) // As in JS this enforces type constraints
result should be(3)
result shouldEqual 3
result shouldBe 3

```
