package io.turntabl.students

import java.time.Year

import io.turntabl.grades.Grades

class TLCStudent (val firstName: String, val secondName: String, val idNumber: Int,
                  val roleDescription: String, val yearWorkStarted: Int,
                  val githubUrl: String = "https://github.com/turntabl" ) {
  val fullname: String = s"$firstName $secondName"

  override def toString: String = s"$firstName $secondName has a role of $roleDescription"

  def termOfService() = Year.now().getValue - yearWorkStarted

  def sameTermOfService(student: TLCStudent) = student.yearWorkStarted == yearWorkStarted

  def TopGrade(subject: String, grades: Double) = Grades(subject, grades)

}

object TLCStudent{
  def apply(firstName: String, secondName: String, idNumber: Int, roleDescription: String, yearWorkStarted: Int, githubUrl: String): TLCStudent = new TLCStudent(firstName, secondName, idNumber, roleDescription, yearWorkStarted, githubUrl)
}
