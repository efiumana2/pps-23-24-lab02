package u02

import org.junit.*
import org.junit.Assert.*
import u02.Shape.*
import u02.Ex2.*
//import u02.Ex4.Shape.{Circle, Perimeter, Rectangle, Scale, Square, isCircle, isRectangle, isSquare}

class Ex2Test {

  @Test def CurryngP1Test() =
    assertTrue(Ex2.p1(2)(2)(2))
    assertFalse(Ex2.p1(2)(2)(1))

@Test def CurryngP2Test() =
  assertTrue(Ex2.p2(2,2,2))
  assertFalse(Ex2.p2(2,2,1))

  @Test def CurryngP3Test() =
    assertTrue(Ex2.p2(2, 2, 2))
    assertFalse(Ex2.p2(2, 2, 1))

  @Test def CurryngP4Test() =
    assertTrue(Ex2.p2(2, 2, 2))
    assertFalse(Ex2.p2(2, 2, 1))

  @Test def ComposeTest =
    assertEquals(9,Ex2.compose(_ - 1, _ * 2)(5))

  @Test def GCDTest() =
    assertEquals(4,gcd(12,8))
    assertEquals(7,gcd(14,7))

  @Test def CheckShapeIsSquare():Unit =
    assertTrue(isSquare(Square(5)))
    assertFalse(isSquare(Circle(5)))

  @Test def CheckShapeIsRectangle():Unit =
    assertTrue(isRectangle(Rectangle(5, 8)))
    assertFalse(isSquare(Circle(5)))

  @Test def CheckShapeIsCircle():Unit =
    assertTrue(isCircle(Circle(5)))
    assertFalse(isSquare(Rectangle(5, 5)))

  @Test def CalculateSquarePerimeter():Unit =
    assertEquals(20,Perimeter(Square(5)),0)

  @Test def CalculateRectanglePerimeter():Unit =
    assertEquals(26,Perimeter(Rectangle(5,8)),0)

  @Test def CalculateCirclePerimeter():Unit =
    assertEquals(31.4,Perimeter(Circle(5)),1)

  @Test def ScaleSquareBy2():Unit =
    assertEquals(Square(10),Scale(Square(5),2))

  @Test def ScaleRectangleBy3():Unit =
    assertEquals(Rectangle(15,24), Scale(Rectangle(5,8), 3))

  @Test def ScaleCircleBy2():Unit =
    assertEquals(Circle(10), Scale(Circle(5), 2))

}
