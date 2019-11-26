package io.turntabl.students

import java.time.Year

import io.turntabl.grades.Grades

trait AccessCard{
  val cardId: Int
  def gainAccess(day: String) = day.toLowerCase match{
    case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" |"Saturday" | "Sunday"  => true
    case _ => false
  }
}

abstract class TurntablEmployee {
  def Workload: String
  def termOfService : Int
}

class TurntablManager extends TurntablEmployee{
  override def Workload: String = "Works very hard"

  override val termOfService = 100
}

class TLCStudent (val firstName: String, val secondName: String, val idNumber: Int,
                  val roleDescription: String, val yearWorkStarted: Int,
                  val githubUrl: String = "https://github.com/turntabl")extends TurntablEmployee {
  val fullname: String = s"$firstName $secondName"

  override def Workload = "works super hard :)"

  override def toString: String = s"$firstName $secondName has a role of $roleDescription"

  override def termOfService() = Year.now().getValue - yearWorkStarted

  def sameTermOfService(student: TLCStudent) = student.yearWorkStarted == yearWorkStarted

  def TopGrade(subject: String, grades: Double) = Grades(subject, grades)

}

object TLCStudent{
  def apply(firstName: String, secondName: String, idNumber: Int, roleDescription: String, yearWorkStarted: Int, githubUrl: String): TLCStudent = new TLCStudent(firstName, secondName, idNumber, roleDescription, yearWorkStarted, githubUrl)
}
