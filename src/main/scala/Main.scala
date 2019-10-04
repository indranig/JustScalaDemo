// la
/* la-la
*/

object Main extends App {


  val kuku = 2L
  var shmuku: Int = 3

  val list = List(1, 2, 3)

  val list2 = list.map(x => x * 2)

  val list4 = list.map(_ * 2)

  println(list2)

  val list3 = list2.foreach(x => println("my next number is: " + x))

  val list5 = list.map(x => x * x)

  //val list6 = list.map(_ * _)

  //val list10: Int = List(1, 2L, "string")

  val list11 = List(1, 2L, ())

  3.2 + 2L

  case class User(name: String, lastname: String, age: Int, gender: Char, phone: Option[String])

  val user = User(name = "John", lastname = "Doe", 39, 'm', Some("111-1111-111"))
  val user2 = User(name = "Mary", lastname = "Kern", 39, 'm', Some("222-2222-222"))

  val user3 = user.copy(age = 40)

  println(user)
  println(user2)

  val userList = List(user, user2)

  //userList.map(user => if(user.name == "Mary") user else user.copy(age = user.age + 1))

  val user4 = User(name = "Zoe", lastname = "War", 39, 'm', None)

  val userCombinedList = userList ++ List(user4)

  println(userCombinedList)

  //val userCombinedList2 = user4  +: userList

  //val userCombinedList3 = userList :+ user4

  val userListWithSpacesInPhones = userCombinedList.map(user => user.copy(phone = user.phone.map(x => x.replace("-", " "))))

  println(userListWithSpacesInPhones)


  val row = ("Jeff", "Johnston", 20, 'm', Some("111-1111"))

  val listOfTuples = List(("Jeff", "Johnston", 20, 'm', Some("111-1111")), ("Suzy", "Edwards", 20, 'm', Some("222-2222")))

  println(listOfTuples.map(x => (x._1, x._2, x._3, x._4, x._5.map(_.replace("-", " ")))))

  println(listOfTuples.map(x => x.copy(_5 = x._5.map(_.replace("-", " ")))))

  val res = 5 / 2

  import scala.util._

  def divide(x: Int, y: Int): Try[Int] = Try(x / y)

  divide(4, 2).map(_ * 2)

  divide(4, 0).map(_ * 2)

}














