# STD LIB


## Classes

Classes in scala are static templates that can be instantiated into many objects
at runtime.
For example the class point:

```scala
class Point(x: Int, y:Int){
  override def toString(): String = "(" + x + ", " + y + ")"
}

var pt = new Point(1,2)

```
