object Test extends App {
  def mkArray[T] = Array[T]()
  def foo[T: ClassTag] = mkArray[T]
  println(foo[Int].getClass)
}