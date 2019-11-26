package io.turntabl.functions

class Collections {

  val nameAndLanguage = ("Isaac", "Java")
  val name, progLanguage = ("Isaac", "Java")

  val countries = scala.collection.immutable.Map("Ghana" -> "Accra", "UK" -> "London", "USA" -> "Washington")
  val currentCountries = countries.+("Togo" -> "Lome", "Nigeria" -> "Abuja")

  countries.getOrElse("Norway", "Unknown")

  val friendsName = Set("Shadrack", "Dennis", "Isaac")
  val newFriends = friendsName.+("Samuel", "Samuel")
  newFriends.count(_ == "Samuel")

  val names = List("Isaac ", "Agyen ", "Duffour ")
  names foreach(print)

  names foreach(n => if(names.length> 6) println(n))

  names.count(_ .length>6)

}
