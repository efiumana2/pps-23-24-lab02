package u02

object Ex2 extends App:

  val res: Int => String = _ match
    case n if n >= 0 => "Positive"
    case _ => "Negative"


  def positive(x: Int): String = x match
    case n if n >= 0 => "Positive"
    case _ => "Negative"

  def empty(s: String): Boolean = s == ""
  def empty2: String => Boolean = _ == ""
  //def p(f:(String) => Boolean): (String => Boolean) = f => (s => !f(s))
  val f: Int => Int = a => a + 1
  def neg: (String => Boolean) => String => Boolean = f => (s => !f(s)) // ?????
  def neg2(f:String => Boolean):String => Boolean = !f(_)

  def emptyGen[A](a: A,  v: A): Boolean = a == v
  def emptyGen2[A]:(A,  A) => Boolean = _ == _
  // QUali delel 2 sopra è meglio?
  def negGen[A](f:(A, A)=>Boolean):(A, A) => Boolean = !f(_,_)
  // def negGen2[A]:((A, A) => Boolean) => (A => Boolean) = f => (s => !f(s,)) //Il secondo parametro ?

  println(res(5))
  println(res(-4))
  println(positive(2))
  println(positive(0))
  println(positive(-2))

  println(neg(empty2)("Ciao"))
  println(neg2(empty)("Ciao"))
  println(emptyGen("A",""))
  println(negGen(emptyGen)("A",""))

  val p1: Int => Int => Int => Boolean = x => y => z => x match
    case x if x <= y && y == z => true
    case _ => false
  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x match
    case x if x <= y && y == z => true
    case _ => false
  def p3(x: Int)(y: Int)(z: Int): Boolean = x match
    case x if x <= y && y == z => true
    case _ => false
  def p4(x: Int,y: Int,z: Int): Boolean = x match
    case x if x <= y && y == z => true
    case _ => false

  def compose(f: Int => Int, g: Int => Int): Int => Int = (x: Int) => f(g(x))

  @annotation.tailrec
  def gcd(a: Int, b: Int): Int = b match
    case 0 => a
    case _ => gcd(b, a % b)

// Io l'ho scritta subito così, che mi sembra tail


enum Shape:
  case Square(Side: Double)
  case Rectangle(Side1: Double, Side2: Double)
  case Circle(Radius: Double)

object Shape:
  def isSquare(s: Shape): Boolean = s match
    case Square(_) => true
    case _ => false

  def isRectangle(s: Shape): Boolean = s match
    case Rectangle(_, _) => true
    case _ => false

  def isCircle(s: Shape): Boolean = s match
    case Circle(_) => true
    case _ => false

  def Perimeter(s: Shape): Double = s match
    case Square(s) => s * 4
    case Rectangle(s1, s2) => s1 * 2 + s2 * 2
    case Circle(r) => r * 2 * 3.14

  def Scale(s: Shape, f: Int): Shape = s match
    case Square(s) => Square(s * f)
    case Rectangle(s1, s2) => Rectangle(s1 * f, s2 * f)
    case Circle(r) => Circle(r * f)

      