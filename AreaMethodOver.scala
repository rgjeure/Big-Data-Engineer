package oops

/*
Task: Create a method area() that:

area(radius: Double) → area of a circle

area(length: Int, breadth: Int) → area of rectangle

area(side: Int) → area of square
 */

class AreaMethodOver {
  val pi=math.Pi
  def area(radius: Double):Unit=println(f"area of circle: ${pi*radius*radius}%.2f")

  def area(length:Int,breath:Int):Unit=println(s"Area of rectangle: ${length*breath}")

  def area(side:Int):Unit=println(s"Area of square: ${side*side}")
}

object mainAreaMethodOver {
  def main(args: Array[String]): Unit = {
    val a1=new AreaMethodOver
    a1.area(10.0)
    a1.area(10,10)
    a1.area(10)
  }
}