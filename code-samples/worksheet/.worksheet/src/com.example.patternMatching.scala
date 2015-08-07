package com.example

object patternMatching {

	case class Person(name: String, age: Int)
	case class Course(name: String, teacher: Person);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(215); 
	
	def guard(block: => Int) {
		if (true) {
			block
		} else {
			0
		}
	};System.out.println("""guard: (block: => Int)Unit""");$skip(54); 
	
	
	val course = Course("Test2", Person("A2mir", 9));System.out.println("""course  : com.example.patternMatching.Course = """ + $show(course ));$skip(290); 
	course match {
		case Course("Test", _) => {
			println("The course name is Test")
		}
		case Course(_, Person("Amir", _)) => {
			println("The teacher name is Amir")
		}
		case Course(_, Person(_, age)) if age > 20 => {
			println("The teacher is old")
		}
		case _ => println("else")
	}}
}
