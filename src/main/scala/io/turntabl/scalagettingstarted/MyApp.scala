package io.turntabl.scalagettingstarted

import io.turntabl.students.TLCStudent

object MyApp extends App {
    val stu1 = new TLCStudent("Isaac", "agyen", 122, "software Engineer", 2019)
    val stu2 = new TLCStudent("Shadrack", "Ankomah", 122, "software Engineer", 2019)

  println(stu1.termOfService())
  println( stu1 sameTermOfService stu2)
  println(stu1.TopGrade("Data", 90.09))
}